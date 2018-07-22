package com.example.brittanyjones.emeraldguide.activity.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
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
