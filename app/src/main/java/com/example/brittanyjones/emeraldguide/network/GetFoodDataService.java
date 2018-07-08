package com.example.brittanyjones.emeraldguide.network;

import com.example.brittanyjones.emeraldguide.model.FoodList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetFoodDataService {



        @GET("/foods")
        Call<FoodList> getFoodData();


}
