package com.example.brittanyjones.emeraldguide.rest;
public class ApiClient {

    public static final String BASE_URL = "https://data.seattle.gov/resource/47rs-c243.json";
    private static Retrofit retrofit = null;


    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}

