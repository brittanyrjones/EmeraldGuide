package com.example.brittanyjones.emeraldguide.activity.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.brittanyjones.emeraldguide.R;
import com.example.brittanyjones.emeraldguide.activity.adapter.ResourceAdapter;
import com.example.brittanyjones.emeraldguide.activity.model.BaseResource;
import com.example.brittanyjones.emeraldguide.activity.model.Resource;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ResourceActivity extends AppCompatActivity {


    private final static String JSON_FILE_ANDROID_WEAR = "resources.json";
    private final static String TAG = "ResourceActivity";

    private ResourceAdapter resourceAdapter;
    private ListView listView;
    EditText search;




//
//    TextView geographicArea_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resource);
        setTitle("Free Hot/Cold Meals");

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        Button search_btn=(Button)findViewById(R.id.button25);
        Button help_btn=(Button)findViewById(R.id.button26);

        search_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchint = new Intent(ResourceActivity.this,SearchActivity.class);
                startActivity(searchint);
            }
        });
        help_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent helpint = new Intent(ResourceActivity.this,HelpActivity.class);
                startActivity(helpint);
            }
        });

        init();
    }



        public void init() {
        listView = (ListView) findViewById(R.id.listView);

        resourceAdapter = new ResourceAdapter(ResourceActivity.this, getResourcesData());
        listView.setAdapter(resourceAdapter);
    }


    /* Convert JSON String to BaseWatch Model via GSON */
    public List<Resource> getResourcesData() {
        String jsonString = getAssetsJSON(JSON_FILE_ANDROID_WEAR);
        Log.d(TAG, "Json: " + jsonString);
        Gson gson = new Gson();
        BaseResource baseResource = gson.fromJson(jsonString, BaseResource.class);
        return  baseResource.getResource();
    }

    /* Get File in Assets Folder */
    public String getAssetsJSON(String resources) {
        String json = null;
        try {
            InputStream inputStream = this.getAssets().open(resources);
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            json = new String(buffer, "UTF-8");

        } catch (IOException e) {
            e.printStackTrace();
        }

        return json;
    }


}












//    private LinearLayoutManager layoutManager;
//    List<Resource> resourceList =null;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_resource);
//        setTitle("Free Meals Served in Seattle");
//        Log.d("123", "onCreate");
//        getResourceList();
//    }
//    private void getResourceList() {
//        Log.d("123", "getResourceList");
//        try {
//            String url = "https://data.seattle.gov/resource/";
//            Log.d("123", "https://data.seattle.gov/resource/");
//
//            Retrofit retrofit = null;
//            Log.d("123", "retrofit");
//
//            if (retrofit == null) {
//                retrofit = new Retrofit.Builder()
//                        .baseUrl(url)
//                        .addConverterFactory(GsonConverterFactory.create())
//                        .build();
//                Log.d("123", "build();");
//            }
//
//
//            ApiService service = retrofit.create(ApiService.class);
//            Log.d("123", " ApiService service = retrofit.create(ApiService.class);");
//
//
//            Call<List<Resource>> call = service.getResourceData();
//            Log.d("123", "Call<List<Resource>> call = service.getResourceData();");
//
//            call.enqueue(new Callback<List<Resource>>() {
//                @Override
//                public void onResponse(Call<List<Resource>> call, Response<List<Resource>> response) {
//                    //Log.d("onResponse", response.message());
//                    Log.d("123", "onResponse");
//
//                    resourceList = response.body();
//                    Log.d("123", "List<Resource> resourceList = response.body();");
//
//                    RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler);
//                    Log.d("123", "RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler);");
//
//                    layoutManager = new LinearLayoutManager(ResourceActivity.this);
//                    Log.d("123", "layoutManager = new LinearLayoutManager(ResourceActivity.this);");
//                    recyclerView.setLayoutManager(layoutManager);
//                    Log.d("123", "recyclerView.setLayoutManager(layoutManager);");
//
//                    RecyclerViewAdapter recyclerViewAdapter =new RecyclerViewAdapter(getApplicationContext(), resourceList);
//                    Log.d("123", "RecyclerViewAdapter recyclerViewAdapter =new RecyclerViewAdapter(getApplicationContext(), resourceList);");
//                    recyclerView.setAdapter(recyclerViewAdapter);
//                    Log.d("123", "recyclerView.setAdapter(recyclerViewAdapter);");
//                }
//
//                @Override
//                public void onFailure(Call<List<Resource>> call, Throwable t) {
//                    Log.d("123", t.getMessage());
//                }
//            });
//        }catch (Exception e) {Log.d("123", "Exception");}
//    }









//public class ResourceActivity extends AppCompatActivity {
//
//    private ArrayList<Resource> resourceList;
//    private ProgressDialog pDialog;
//    private RecyclerView recyclerView;
//    private RecyclerViewAdapter eAdapter;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_resource);
//
//        pDialog = new ProgressDialog(ResourceActivity.this);
//        pDialog.setMessage("Loading Data.. Please wait...");
//        pDialog.setIndeterminate(false);
//        pDialog.setCancelable(false);
//        pDialog.show();
//
//
//        ApiService api = RetroClient.getApiService();
//
//
//        Call<ResourceList> call = api.getMyJSON();
//
//        call.enqueue(new Callback<ResourceList>() {
//            @Override
//            public void onResponse(Call<ResourceList> call, Response<ResourceList> response) {
//
//                pDialog.dismiss();
//
//                if (response.isSuccessful()) {
//
//                    resourceList = response.body().getResource();
//                    recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
//                    eAdapter = new RecyclerViewAdapter(resourceList);
//                    RecyclerView.LayoutManager eLayoutManager = new LinearLayoutManager(getApplicationContext());
//                    recyclerView.setLayoutManager(eLayoutManager);
//                    recyclerView.setItemAnimator(new DefaultItemAnimator());
//                    recyclerView.setAdapter(eAdapter);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<ResourceList> call, Throwable t) {
//                pDialog.dismiss();
//            }
//        });
//    }
//}

//public class ResourceActivity extends AppCompatActivity {
//
//    ListView listView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_resource);
//
//        listView = (ListView) findViewById(R.id.listViewResources);
//
//        //calling the method to display the heroes
//        getAllResources();
//    }
//
//    private void getAllResources() {
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("https://data.seattle.gov/resource/")
//                .addConverterFactory(GsonConverterFactory.create()) //Here we are using the GsonConverterFactory to directly convert json data to object
//                .build();
//
//        Api api = retrofit.create(Api.class);
//
//        Call<List<Resource>> call = api.getAllResources();
//
//
//
//
//        call.enqueue(new Callback<List<Resource>>() {
//            @Override
//            public void onResponse(Call<List<Resource>> call, Response<List<Resource>> response) {
//                List<Resource> resourceList = response.body();
//
//                //Creating an String array for the ListView
//                String[] resources = new String[resourceList.size()];
//
//                //looping through all the heroes and inserting the names inside the string array
//                for (int i = 0; i < resourceList.size(); i++) {
//                    resources[i] = resourceList.get(i).getNameOfProgram();
//                }
//
//
//                //displaying the string array into listview
//                listView.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, resources));
//
//            }
//
//            @Override
//            public void onFailure(Call<List<Resource>> call, Throwable t) {
//                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//
