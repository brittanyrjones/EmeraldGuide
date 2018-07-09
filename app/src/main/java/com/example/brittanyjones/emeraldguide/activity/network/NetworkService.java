package com.example.brittanyjones.emeraldguide.activity.network;

import com.example.brittanyjones.emeraldguide.activity.Api.Api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkService {

    private static NetworkService mInstance;
    private static final String BASE_URL = "https://data.seattle.gov/resource/";
    private Retrofit mRetrofit;


    private NetworkService() {
        mRetrofit = new Retrofit.Builder()
                .baseUrl("https://data.seattle.gov/resource/")

                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static NetworkService getInstance() {
        if (mInstance == null) {
            mInstance = new NetworkService();
        }
        return mInstance;
    }
    public Api getJSONApi() {
        return mRetrofit.create(Api.class);
    }
}
