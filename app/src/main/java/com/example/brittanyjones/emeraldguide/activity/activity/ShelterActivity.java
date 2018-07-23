package com.example.brittanyjones.emeraldguide.activity.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.example.brittanyjones.emeraldguide.R;
import com.example.brittanyjones.emeraldguide.activity.adapter.ShelterAdapter;
import com.example.brittanyjones.emeraldguide.activity.model.Shelter;
import com.example.brittanyjones.emeraldguide.activity.model.ShelterList;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ShelterActivity extends AppCompatActivity {
    private final static String JSON_FILE_ANDROID_SHEL = "shelter.json";
    private final static String TAG = "ShelterActivity";
    private ShelterAdapter shelterAdapter;
    private ListView shellistView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shelter);
        setTitle("Emergency Shelters");
        init();

    }

    public void on(View V){
        TextView tv = (TextView) findViewById(R.id.shelterInformation_txt);
        tv.setVisibility(View.VISIBLE);

    }


    public void init() {
        shellistView = (ListView) findViewById(R.id.shellistView);
        shelterAdapter = new ShelterAdapter(ShelterActivity.this, getShelterData());
        shellistView.setAdapter(shelterAdapter);




    }

    /* Convert JSON String to BaseWatch Model via GSON */
    public List<Shelter> getShelterData() {
        String jsonString = getAssetsJSON(JSON_FILE_ANDROID_SHEL);
        Log.d(TAG, "Json: " + jsonString);
        Gson gson = new Gson();
        ShelterList baseShelter = gson.fromJson(jsonString, ShelterList.class);
        return  baseShelter.getShelter();
    }
    public String getAssetsJSON(String shelter) {
        String json = null;
        try {
            InputStream inputStream = this.getAssets().open(shelter);
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
