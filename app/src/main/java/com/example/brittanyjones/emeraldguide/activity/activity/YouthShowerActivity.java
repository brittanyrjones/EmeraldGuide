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
import com.example.brittanyjones.emeraldguide.activity.adapter.YouthHygieneAdapter;
import com.example.brittanyjones.emeraldguide.activity.model.YouthHygiene;
import com.example.brittanyjones.emeraldguide.activity.model.YouthHygieneList;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class YouthShowerActivity extends AppCompatActivity {


    private final static String JSON_FILE_ANDROID_YOUTHHYG = "youthhygiene.json";
    private final static String TAG = "ShowerActivity";

    private YouthHygieneAdapter youthhygieneAdapter;
    private ListView youthhyglistView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shower);
        setTitle("Hygiene Facilities");

        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        Button search_btn = (Button) findViewById(R.id.button25);
        Button help_btn = (Button) findViewById(R.id.button26);

        search_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchint = new Intent(YouthShowerActivity.this, SearchActivity.class);
                startActivity(searchint);
            }
        });
        help_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent helpint = new Intent(YouthShowerActivity.this, HelpActivity.class);
                startActivity(helpint);
            }

        });
        init();
    }

    public void init() {
        youthhyglistView = (ListView) findViewById(R.id.hyglistView);
        youthhygieneAdapter = new YouthHygieneAdapter(YouthShowerActivity.this, getYouthHygieneData());
        youthhyglistView.setAdapter(youthhygieneAdapter);
    }

    /* Convert JSON String to BaseWatch Model via GSON */
    public List<YouthHygiene> getYouthHygieneData() {
        String jsonString = getAssetsJSON(JSON_FILE_ANDROID_YOUTHHYG);
        Log.d(TAG, "Json: " + jsonString);
        Gson gson = new Gson();
        YouthHygieneList baseYouthHygiene = gson.fromJson(jsonString, YouthHygieneList.class);
        return  baseYouthHygiene.getYouthHygiene();
    }

    public String getAssetsJSON(String youthhygiene) {
        String json = null;
        try {
            InputStream inputStream = this.getAssets().open(youthhygiene);
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
