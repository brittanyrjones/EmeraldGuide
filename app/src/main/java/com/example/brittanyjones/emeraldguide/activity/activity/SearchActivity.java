package com.example.brittanyjones.emeraldguide.activity.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.brittanyjones.emeraldguide.R;
import com.example.brittanyjones.emeraldguide.activity.model.Feed;
import com.example.brittanyjones.emeraldguide.activity.model.Info;
import com.mindorks.placeholderview.ExpandablePlaceHolderView;

import java.util.Objects;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
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