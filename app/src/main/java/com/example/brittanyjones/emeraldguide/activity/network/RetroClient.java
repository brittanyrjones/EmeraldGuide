package com.example.brittanyjones.emeraldguide.activity.network;

import com.example.brittanyjones.emeraldguide.activity.Api.ApiService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;




public class RetroClient {

    private static final String ROOT_URL = "https://data.seattle.gov/resource/";



    private static Retrofit getRetrofitInstance() {
        return new Retrofit.Builder()
                .baseUrl(ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }


    public static ApiService getApiService() {
        return getRetrofitInstance().create(ApiService.class);
    }
}



















//public class RetroClient {
//
//    private static RetroClient mInstance;
//    private static final String BASE_URL = "https://data.seattle.gov/resource/";
//    private Retrofit mRetrofit;
//
//
//    private RetroClient() {
//        mRetrofit = new Retrofit.Builder()
//                .baseUrl("https://data.seattle.gov/resource/")
//
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//    }
//
//    public static RetroClient getInstance() {
//        if (mInstance == null) {
//            mInstance = new RetroClient();
//        }
//        return mInstance;
//    }
//    public Api getJSONApi() {
//        return mRetrofit.create(Api.class);
//    }
//}
