package com.example.brittanyjones.emeraldguide.activity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.brittanyjones.emeraldguide.R;
import com.example.brittanyjones.emeraldguide.adapter.ResourcesAdapter;
import com.example.brittanyjones.emeraldguide.model.Resource;
import com.example.brittanyjones.emeraldguide.network.RetrofitClientInstance;
import com.example.brittanyjones.emeraldguide.rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FoodActivity extends AppCompatActivity {
    private ResourcesAdapter adapter;
    private RecyclerView recyclerView;
    ProgressDialog progressDoalog;

    private static final String TAG = MainActivity.class.getSimpleName();


    private final static String API_KEY = "Hh0_tRJ1HqazeJffdYF_mhSq_2CqCfdlp38l";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        progressDoalog = new ProgressDialog(FoodActivity.this);
        progressDoalog.setMessage("Loading....");
        progressDoalog.show();

        ApiInterface service = RetrofitClientInstance.getRetrofitInstance().create(ApiInterface.class);
        Call<List<Resource>> call = service.getAllResources();
        call.enqueue(new Callback<List<Resource>>() {
            @Override
            public void onResponse(Call<List<Resource>> call, Response<List<Resource>> response) {
                progressDoalog.dismiss();
                generateDataList(response.body());
            }

            @Override
            public void onFailure(Call<List<Resource>> call, Throwable t) {
                progressDoalog.dismiss();
                Toast.makeText(MainActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void generateDataList(List<Resource> resourceList) {
        recyclerView = findViewById(R.id.customRecyclerView);
        adapter = new ResourceAdapter(this,resourceList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(FoodActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}

