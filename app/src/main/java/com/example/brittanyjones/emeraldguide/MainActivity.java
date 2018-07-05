package com.example.brittanyjones.emeraldguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button search_btn=(Button)findViewById(R.id.button25);
        Button help_btn=(Button)findViewById(R.id.button26);
        Button emergency_btn=(Button)findViewById(R.id.button27) ;
        Button volunteer_btn=(Button)findViewById(R.id.button28);
        Button login_btn=(Button)findViewById(R.id.button30);
        Button food_btn=(Button)findViewById(R.id.button19);
        Button shower_btn=(Button)findViewById(R.id.button20);
        Button menu_search_btn=(Button)findViewById(R.id.button25);
        Button shelter_btn=(Button)findViewById(R.id.button21);
        Button give_btn=(Button)findViewById(R.id.button22);

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
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginint = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(loginint);
            }
        });
        food_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent foodint = new Intent(MainActivity.this,FoodActivity.class);
                startActivity(foodint);
            }
        });
        shower_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent showerint = new Intent(MainActivity.this,ShowerActivity.class);
                startActivity(showerint);
            }
        });
        menu_search_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menusearchint = new Intent(MainActivity.this,MenuSearchActivity.class);
                startActivity(menusearchint);
            }
        });
        shelter_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shelterint = new Intent(MainActivity.this,ShelterActivity.class);
                startActivity(shelterint);
            }
        });
        give_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent givint = new Intent(MainActivity.this,GiveActivity.class);
                startActivity(givint);
            }
        });




    }
}
