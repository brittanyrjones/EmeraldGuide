package com.example.brittanyjones.emeraldguide.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.brittanyjones.emeraldguide.R;
import com.example.brittanyjones.emeraldguide.adapter.ResourcesAdapter;
import com.example.brittanyjones.emeraldguide.model.Resource;
import com.example.brittanyjones.emeraldguide.rest.ApiClient;
import com.example.brittanyjones.emeraldguide.rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FoodActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();


    private final static String API_KEY = "Hh0_tRJ1HqazeJffdYF_mhSq_2CqCfdlp38l";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        if (API_KEY.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please obtain your API KEY first from themoviedb.org", Toast.LENGTH_LONG).show();
            return;

        }

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.resources_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);

        Call<ResourcesResponse> call = apiService.getResources(API_KEY);
        call.enqueue(new Callback<ResourcesResponse>() {
            @Override
            public void onResponse(Call<ResourcesResponse> call, Response<ResourcesResponse> response) {
                List<Resource> resources = response.body().getJSON();
                recyclerView.setAdapter(new ResourcesAdapter(resources, R.layout.list_item_resource, getApplicationContext()));

            }

            @Override
            public void onFailure(Call<ResourcesResponse> call, Throwable t) {
                // Log error here since request failed
                Log.e(TAG, t.toString());
            }
        });
    }
}
