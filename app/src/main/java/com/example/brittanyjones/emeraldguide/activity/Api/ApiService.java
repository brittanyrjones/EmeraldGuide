package com.example.brittanyjones.emeraldguide.activity.Api;

import com.example.brittanyjones.emeraldguide.activity.model.Resource;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;



public interface ApiService {

    @GET("47rs-c243.json?$$app_token=z6xRNwqCisAx6UdpF9pYOa64m")
    Call<List<Resource>> getResourceData();

}
