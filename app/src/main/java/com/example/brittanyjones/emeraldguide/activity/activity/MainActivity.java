package com.example.brittanyjones.emeraldguide.activity.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.brittanyjones.emeraldguide.R;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);


        Button search_btn=(Button)findViewById(R.id.button25);
        Button help_btn=(Button)findViewById(R.id.button26);
        Button emergency_btn=(Button)findViewById(R.id.button27) ;
        Button volunteer_btn=(Button)findViewById(R.id.button28);
        Button resource_btn=(Button)findViewById(R.id.button19);
        Button shower_btn=(Button)findViewById(R.id.button21);
        Button shelter_btn=(Button)findViewById(R.id.button20);
        Button youth_btn=(Button)findViewById(R.id.button30);

        search_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchint = new Intent(MainActivity.this,SearchActivity.class);
                startActivity(searchint);
                }
        });
        help_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent helpint = new Intent(MainActivity.this,HelpActivity.class);
                startActivity(helpint);
            }
        });
        emergency_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emergencyint = new Intent(MainActivity.this,EmergencyActivity.class);
                startActivity(emergencyint);
            }
        });
        volunteer_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent volunteerint = new Intent(MainActivity.this,VolunteerActivity.class);
                startActivity(volunteerint);
            }
        });

        resource_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent resourceint = new Intent(MainActivity.this,ResourceActivity.class);
                startActivity(resourceint);
            }
        });
        shower_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent showerint = new Intent(MainActivity.this,ShowerActivity.class);
                startActivity(showerint);
            }
        });

        shelter_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shelterint = new Intent(MainActivity.this,ShelterActivity.class);
                startActivity(shelterint);
            }
        });
        youth_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent youthint = new Intent(MainActivity.this,YouthActivity.class);
                startActivity(youthint);
            }
        });
    }
}
