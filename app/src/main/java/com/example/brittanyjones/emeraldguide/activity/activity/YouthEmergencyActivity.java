package com.example.brittanyjones.emeraldguide.activity.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import com.example.brittanyjones.emeraldguide.R;
import com.example.brittanyjones.emeraldguide.activity.adapter.EmergencyAdapter;
import com.example.brittanyjones.emeraldguide.activity.model.Emergency;
import com.example.brittanyjones.emeraldguide.activity.model.EmergencyList;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class YouthEmergencyActivity extends AppCompatActivity {

    private final static String JSON_FILE_ANDROID_EMG = "emergencies.json";
    private final static String TAG = "EmergencyActivity";


    private EmergencyAdapter emergencyAdapter;
    private ListView emglistView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);
        setTitle("Emergency & Crisis Lines");
        init();
    }


    public void init() {
        emglistView = (ListView) findViewById(R.id.emglistView);
        emergencyAdapter = new EmergencyAdapter(YouthEmergencyActivity.this, getEmergencyData());
        emglistView.setAdapter(emergencyAdapter);
    }

    /* Convert JSON String to BaseWatch Model via GSON */
    public List<Emergency> getEmergencyData() {
        String jsonString = getAssetsJSON(JSON_FILE_ANDROID_EMG);
        Log.d(TAG, "Json: " + jsonString);
        Gson gson = new Gson();
        EmergencyList baseEmergency = gson.fromJson(jsonString, EmergencyList.class);
        return  baseEmergency.getEmergency();
    }
    public String getAssetsJSON(String emergency) {
        String json = null;
        try {
            InputStream inputStream = this.getAssets().open(emergency);
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
