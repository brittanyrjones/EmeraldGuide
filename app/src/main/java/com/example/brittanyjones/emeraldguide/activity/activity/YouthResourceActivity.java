package com.example.brittanyjones.emeraldguide.activity.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.brittanyjones.emeraldguide.R;
import com.example.brittanyjones.emeraldguide.activity.adapter.YouthResourceAdapter;
import com.example.brittanyjones.emeraldguide.activity.model.YouthResource;
import com.example.brittanyjones.emeraldguide.activity.model.YouthResourceList;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class YouthResourceActivity extends AppCompatActivity {


    private final static String JSON_FILE_ANDROID_YOUTHRES = "youthresource.json";
    private final static String TAG = "ResourceActivity";

    private YouthResourceAdapter youthresourceAdapter;
    private ListView youthreslistView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resource);
        setTitle("Free Hot/Cold Meals");
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        Button search_btn = (Button) findViewById(R.id.button25);
        search_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchint = new Intent(YouthResourceActivity.this, SearchActivity.class);
                startActivity(searchint);
            }
        });
        init();
    }

    public void init() {
        youthreslistView = (ListView) findViewById(R.id.listView);
        youthresourceAdapter = new YouthResourceAdapter(YouthResourceActivity.this, getYouthResourceData());
        youthreslistView.setAdapter(youthresourceAdapter);
    }

    public List<YouthResource> getYouthResourceData() {
        String jsonString = getAssetsJSON(JSON_FILE_ANDROID_YOUTHRES);
        Log.d(TAG, "Json: " + jsonString);
        Gson gson = new Gson();
        YouthResourceList baseYouthResource = gson.fromJson(jsonString, YouthResourceList.class);
        return  baseYouthResource.getYouthresource();
    }

    public String getAssetsJSON(String youthresource) {
        String json = null;
        try {
            InputStream inputStream = this.getAssets().open(youthresource);
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
