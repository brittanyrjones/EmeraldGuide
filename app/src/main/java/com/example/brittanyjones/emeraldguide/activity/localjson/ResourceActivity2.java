package com.example.brittanyjones.emeraldguide.activity.localjson;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.brittanyjones.emeraldguide.R;
import com.example.brittanyjones.emeraldguide.activity.activity.ResourceActivity;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import com.google.gson.Gson;

public class ResourceActivity2 {
    private final static String JSON_FILE_ANDROID_RESOURCE = "resources.JSON";
    private final static String TAG = "ResourceActivity2";

    private ResourceAdapter resourceAdapter;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resource2);

        init();
    }

    public void init() {
        listView = (ListView) findViewById(R.id.listView);
        resourceAdapter = new ResourceAdapter(ResourceActivity2.this, getResourcesData());
        listView.setAdapter(resourceAdapter);
    }

    /* Convert JSON String to BaseWatch Model via GSON */
    public List<Resource> getResourcesData() {
        String jsonString = getAssetsJSON(JSON_FILE_ANDROID_RESOURCE);
        Log.d(TAG, "Json: " + jsonString);
        Gson gson = new Gson();
        BaseResource baseResource = gson.fromJson(jsonString, BaseResource.class);
        return  baseResource.getResources();
    }

    /* Get File in Assets Folder */
    public String getAssetsJSON(String resources) {
        String json = null;
        try {
            InputStream inputStream = this.getAssets().open(resources);
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            json = new String(buffer, "UTF-8");

        } catch (IOException e) {
            e.printStackTrace();
        }

        return json;
    }
}
