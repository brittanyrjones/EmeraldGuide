package com.example.brittanyjones.emeraldguide.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.brittanyjones.emeraldguide.R;
import com.example.brittanyjones.emeraldguide.adapter.FoodAdapter;
import com.example.brittanyjones.emeraldguide.model.Food;
import com.example.brittanyjones.emeraldguide.model.FoodList;
import com.example.brittanyjones.emeraldguide.network.GetFoodDataService;
import com.example.brittanyjones.emeraldguide.network.RetrofitInstance;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FoodActivity extends AppCompatActivity {

    private FoodAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        GetFoodDataService service = RetrofitInstance.getRetrofitInstance().create(GetFoodDataService.class);

        Call<FoodList> call = service.getFoodData();

        Log.wtf("URL Called", call.request().url() + "");

        call.enqueue(new Callback<FoodList>() {
            @Override
            public void onResponse(Call<FoodList> call, Response<FoodList> response) {
                generateFoodList(response.body().getFoodArrayList());
            }

            @Override
            public void onFailure(Call<FoodList> call, Throwable t) {
                Toast.makeText(FoodActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void generateFoodList(ArrayList<Food> foodDataList) {
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_food_list);

        adapter = new FoodAdapter(foodDataList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(FoodActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }
}