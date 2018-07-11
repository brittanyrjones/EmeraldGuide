package com.example.brittanyjones.emeraldguide.activity.activity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.brittanyjones.emeraldguide.R;
import com.example.brittanyjones.emeraldguide.activity.Api.ApiService;
import com.example.brittanyjones.emeraldguide.activity.adapter.ResourcesAdapter;
import com.example.brittanyjones.emeraldguide.activity.model.Resource;
import com.example.brittanyjones.emeraldguide.activity.model.ResourceList;
import com.example.brittanyjones.emeraldguide.activity.network.RetroClient;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ResourceActivity extends AppCompatActivity {

    private ArrayList<Resource> resourceList;
    private ProgressDialog pDialog;
    private RecyclerView recyclerView;
    private ResourcesAdapter eAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resource);

        pDialog = new ProgressDialog(ResourceActivity.this);
        pDialog.setMessage("Loading Data.. Please wait...");
        pDialog.setIndeterminate(false);
        pDialog.setCancelable(false);
        pDialog.show();


        ApiService api = RetroClient.getApiService();


        Call<ResourceList> call = api.getMyJSON();

        call.enqueue(new Callback<ResourceList>() {
            @Override
            public void onResponse(Call<ResourceList> call, Response<ResourceList> response) {

                pDialog.dismiss();

                if (response.isSuccessful()) {

                    resourceList = response.body().getResource();
                    recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
                    eAdapter = new ResourcesAdapter(resourceList);
                    RecyclerView.LayoutManager eLayoutManager = new LinearLayoutManager(getApplicationContext());
                    recyclerView.setLayoutManager(eLayoutManager);
                    recyclerView.setItemAnimator(new DefaultItemAnimator());
                    recyclerView.setAdapter(eAdapter);
                }
            }

            @Override
            public void onFailure(Call<ResourceList> call, Throwable t) {
                pDialog.dismiss();
            }
        });
    }
}

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
