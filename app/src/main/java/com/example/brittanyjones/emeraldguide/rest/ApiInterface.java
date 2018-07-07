package com.example.brittanyjones.emeraldguide.rest;


import com.example.brittanyjones.emeraldguide.model.ResourceResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ApiInterface {
    @GET("resource/")
    Call<ResourcesResponse> getlocation(@Query("api_key") String apiKey);

    @GET("resource")
    Call<ResourceResponse> getNameOfProgram(@Path("id") int id, @Query("api_key") String apiKey);
}
