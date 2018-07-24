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
import com.example.brittanyjones.emeraldguide.activity.adapter.YouthShelterAdapter;
import com.example.brittanyjones.emeraldguide.activity.model.YouthShelter;
import com.example.brittanyjones.emeraldguide.activity.model.YouthShelterList;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class YouthShelterActivity extends AppCompatActivity {


    private final static String JSON_FILE_ANDROID_YOUTHSHEL = "youthshelter.json";
    private final static String TAG = "ShelterActivity";

    private YouthShelterAdapter youthshelterAdapter;
    private ListView youthshellistView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shelter);
        setTitle("Emergency Shelters");


        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        Button search_btn = (Button) findViewById(R.id.button25);
        Button help_btn = (Button) findViewById(R.id.button26);

        search_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchint = new Intent(YouthShelterActivity.this, SearchActivity.class);
                startActivity(searchint);
            }
        });
        help_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent helpint = new Intent(YouthShelterActivity.this, HelpActivity.class);
                startActivity(helpint);
            }

        });
        init();
    }

    public void init() {
        youthshellistView = (ListView) findViewById(R.id.shellistView);
        youthshelterAdapter = new YouthShelterAdapter(YouthShelterActivity.this, getYouthShelterData());
        youthshellistView.setAdapter(youthshelterAdapter);
    }

    /* Convert JSON String to BaseWatch Model via GSON */
    public List<YouthShelter> getYouthShelterData() {
        String jsonString = getAssetsJSON(JSON_FILE_ANDROID_YOUTHSHEL);
        Log.d(TAG, "Json: " + jsonString);
        Gson gson = new Gson();
        YouthShelterList baseYouthShelter = gson.fromJson(jsonString, YouthShelterList.class);
        return  baseYouthShelter.getYouthShelter();
    }

    public String getAssetsJSON(String youthshelter) {
        String json = null;
        try {
            InputStream inputStream = this.getAssets().open(youthshelter);
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
