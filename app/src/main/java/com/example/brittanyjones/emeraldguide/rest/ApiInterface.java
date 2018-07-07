package com.example.brittanyjones.emeraldguide.rest;


import com.example.brittanyjones.emeraldguide.model.Resource;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface ApiInterface {

    String BASE_URL = "https://data.seattle.gov/resource/";
    @GET("47rs-c243")

    Call<List<Resource>> getResources();
}

