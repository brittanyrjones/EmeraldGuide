package com.example.brittanyjones.emeraldguide.activity.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.brittanyjones.emeraldguide.R;
import com.example.brittanyjones.emeraldguide.activity.model.Feed;
import com.example.brittanyjones.emeraldguide.activity.model.Info;
import com.mindorks.placeholderview.ExpandablePlaceHolderView;

import java.util.Objects;

public class YouthSearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        Button search_btn = (Button) findViewById(R.id.button25);
        Button help_btn = (Button) findViewById(R.id.button26);

        search_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchint = new Intent(YouthSearchActivity.this, SearchActivity.class);
                startActivity(searchint);
            }
        });
        help_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent helpint = new Intent(YouthSearchActivity.this, HelpActivity.class);
                startActivity(helpint);
            }

        });



    Context mContext = this.getApplicationContext();
        ExpandablePlaceHolderView mExpandableView = (ExpandablePlaceHolderView) findViewById(R.id.expandableView);
        for(Feed feed : Objects.requireNonNull(Utils.loadFeeds(this.getApplicationContext()))){
            mExpandableView.addView(new HeadingView(mContext, feed.getHeading()));
            for(Info info : feed.getInfoList()){
                mExpandableView.addView(new InfoView(mContext, info));
            }
        }
    }
}