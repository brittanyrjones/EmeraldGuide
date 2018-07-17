package com.example.brittanyjones.emeraldguide.activity.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.brittanyjones.emeraldguide.R;

public class YouthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youth);


        Button youth_search_btn = (Button) findViewById(R.id.button25);
        Button youth_help_btn = (Button) findViewById(R.id.button26);
        Button youth_emergency_btn = (Button) findViewById(R.id.button27);
        Button youth_volunteer_btn = (Button) findViewById(R.id.button28);
        Button youth_resource_btn = (Button) findViewById(R.id.button19);
        Button youth_shower_btn = (Button) findViewById(R.id.button21);
        Button youth_shelter_btn = (Button) findViewById(R.id.button20);
        Button youth_btn = (Button) findViewById(R.id.button30);

        youth_search_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent youthsearchint = new Intent(YouthActivity.this, YouthSearchActivity.class);
                startActivity(youthsearchint);
            }
        });
        youth_help_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent youthhelpint = new Intent(YouthActivity.this, YouthHelpActivity.class);
                startActivity(youthhelpint);
            }
        });
        youth_emergency_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent youthemergencyint = new Intent(YouthActivity.this, YouthEmergencyActivity.class);
                startActivity(youthemergencyint);
            }
        });
        youth_volunteer_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent youthvolunteerint = new Intent(YouthActivity.this, YouthVolunteerActivity.class);
                startActivity(youthvolunteerint);
            }
        });

        youth_resource_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent youthresourceint = new Intent(YouthActivity.this, YouthResourceActivity.class);
                startActivity(youthresourceint);
            }
        });
        youth_shower_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent youthshowerint = new Intent(YouthActivity.this, YouthShowerActivity.class);
                startActivity(youthshowerint);
            }
        });

        youth_shelter_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent youthshelterint = new Intent(YouthActivity.this, YouthShelterActivity.class);
                startActivity(youthshelterint);
            }
        });
        youth_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent adultint = new Intent(YouthActivity.this, MainActivity.class);
                startActivity(adultint);
            }
        });
    }
}


