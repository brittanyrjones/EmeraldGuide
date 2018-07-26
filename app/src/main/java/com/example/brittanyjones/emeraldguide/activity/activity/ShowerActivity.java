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
import com.example.brittanyjones.emeraldguide.activity.adapter.HygieneAdapter;
import com.example.brittanyjones.emeraldguide.activity.model.Hygiene;
import com.example.brittanyjones.emeraldguide.activity.model.HygieneList;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ShowerActivity extends AppCompatActivity {
    private final static String JSON_FILE_ANDROID_HYG = "hygiene.json";
    private final static String TAG = "ShowerActivity";
    private HygieneAdapter hygieneAdapter;
    private ListView hyglistView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shower);
        setTitle("Hygiene Facilities");
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        Button search_btn = (Button) findViewById(R.id.button25);
        search_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchint = new Intent(ShowerActivity.this, SearchActivity.class);
                startActivity(searchint);
            }
        });
        init();
    }
    public void init() {
        hyglistView = (ListView) findViewById(R.id.hyglistView);
        hygieneAdapter = new HygieneAdapter(ShowerActivity.this, getHygieneData());
        hyglistView.setAdapter(hygieneAdapter);
    }
    /* Convert JSON String to BaseWatch Model via GSON */
    public List<Hygiene> getHygieneData() {
        String jsonString = getAssetsJSON(JSON_FILE_ANDROID_HYG);
        Log.d(TAG, "Json: " + jsonString);
        Gson gson = new Gson();
        HygieneList baseHygiene = gson.fromJson(jsonString, HygieneList.class);
        return  baseHygiene.getHygiene();
    }
    public String getAssetsJSON(String hygiene) {
        String json = null;
        try {
            InputStream inputStream = this.getAssets().open(hygiene);
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