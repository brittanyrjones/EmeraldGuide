package com.example.brittanyjones.emeraldguide.activity.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.brittanyjones.emeraldguide.R;

public class VolunteerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteer);
        setTitle("Give Back to the Community");

        Button search_btn = (Button) findViewById(R.id.button25);
        Button help_btn = (Button) findViewById(R.id.button26);

        search_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchint = new Intent(VolunteerActivity.this, SearchActivity.class);
                startActivity(searchint);
            }
        });
        help_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent helpint = new Intent(VolunteerActivity.this, HelpActivity.class);
                startActivity(helpint);
            }

        });

    }

}
