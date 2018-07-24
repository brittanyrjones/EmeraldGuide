package com.example.brittanyjones.emeraldguide.activity.activity;//package com.example.brittanyjones.emeraldguide.activity.activity;

import android.content.Context;
import android.widget.TextView;

import com.example.brittanyjones.emeraldguide.R;
import com.example.brittanyjones.emeraldguide.activity.model.Info;
import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;
import com.mindorks.placeholderview.annotations.expand.ChildPosition;
import com.mindorks.placeholderview.annotations.expand.ParentPosition;

@Layout(R.layout.feed_item)
public class InfoView {

    @ParentPosition
    private int mParentPosition;

    @ChildPosition
    private int mChildPosition;

    @View(R.id.programName_txt)
    private TextView programName_txt;

    @View(R.id.geographicArea_txt)
    private TextView geographicArea_txt;

    @View(R.id.location_txt)
    private TextView location_txt;

    @View(R.id.phoneNumber_txt)
    private TextView phoneNumber_txt;

    @View(R.id.website_txt)
    private TextView website_txt;

    @View(R.id.mealInformation_txt)
    private TextView mealInformation_txt;



    private Info mInfo;
    private Context mContext;

    public InfoView(Context context, Info info) {
        mContext = context;
        mInfo = info;
    }

    @Resolve
    private void onResolved() {
        programName_txt.setText(mInfo.getProgramName());
        geographicArea_txt.setText(mInfo.getGeographicArea());
        location_txt.setText(mInfo.getLocation());
        phoneNumber_txt.setText(mInfo.getPhoneNumber());
        website_txt.setText(mInfo.getWebsite());
        mealInformation_txt.setText(mInfo.getMealInformation());
    }
}


//import android.content.Context;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import com.bumptech.glide.Glide;
//import com.example.brittanyjones.emeraldguide.R;
//import com.example.brittanyjones.emeraldguide.activity.model.Info;
//import com.mindorks.placeholderview.annotations.Layout;
//import com.mindorks.placeholderview.annotations.Resolve;
//import com.mindorks.placeholderview.annotations.View;
//import com.mindorks.placeholderview.annotations.expand.ChildPosition;
//import com.mindorks.placeholderview.annotations.expand.ParentPosition;
//
//@Layout(R.layout.feed_item)
//public class InfoView {
//
//    @ParentPosition
//    private int mParentPosition;
//
//    @ChildPosition
//    private int mChildPosition;
//
//    @View(R.id.titleTxt)
//    private TextView titleTxt;
//
//    @View(R.id.captionTxt)
//    private TextView captionTxt;
//
//    @View(R.id.timeTxt)
//    private TextView timeTxt;
//
//    @View(R.id.imageView)
//    private ImageView imageView;
//
//    private Info mInfo;
//    private Context mContext;
//
//    public InfoView(Context context, Info info) {
//        mContext = context;
//        mInfo = info;
//    }
//
//    @Resolve
//    private void onResolved() {
//        titleTxt.setText(mInfo.getTitle());
//        captionTxt.setText(mInfo.getCaption());
//        timeTxt.setText(mInfo.getTime());
//        Glide.with(mContext).load(mInfo.getImageUrl()).into(imageView);
//    }
//}