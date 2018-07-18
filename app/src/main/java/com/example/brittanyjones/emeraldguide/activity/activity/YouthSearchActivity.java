package com.example.brittanyjones.emeraldguide.activity.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.brittanyjones.emeraldguide.R;
import com.example.brittanyjones.emeraldguide.activity.adapter.ResourceAdapter;

public class YouthSearchActivity extends AppCompatActivity {



    private final static String JSON_FILE_ANDROID_YOUTHWEAR = "youthresource.json";
    private final static String TAG = "ResourceActivity";

    private ResourceAdapter resourceAdapter;
    private ListView listView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youth_search);
    }
}
