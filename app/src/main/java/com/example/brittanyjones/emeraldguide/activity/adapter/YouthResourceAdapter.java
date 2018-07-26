package com.example.brittanyjones.emeraldguide.activity.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.brittanyjones.emeraldguide.R;
import com.example.brittanyjones.emeraldguide.activity.model.YouthResource;

import java.util.List;

public class YouthResourceAdapter extends BaseAdapter{

    Context context;
    List<YouthResource> dataList;
    private View youthvi;
    private ViewHolder viewHolder;
    private static LayoutInflater inflater = null;
    public YouthResourceAdapter(Context context, List<YouthResource> dataList){
        this.context = context;
        this.dataList = dataList;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return dataList.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        youthvi = view;
        //Populate the Listview
        final int pos = position;
        YouthResource youthresource = dataList.get(pos);
        if(youthvi == null) {
            youthvi = inflater.inflate(R.layout.listitem_resource, viewGroup, false);
            viewHolder = new ViewHolder();
            viewHolder.geographicArea = (TextView) youthvi.findViewById(R.id.geographicArea_txt);
            viewHolder.programName = (TextView) youthvi.findViewById(R.id.programName_txt);
            viewHolder.location = (TextView) youthvi.findViewById(R.id.location_txt);
            viewHolder.phoneNumber = (TextView) youthvi.findViewById(R.id.phoneNumber_txt);
            viewHolder.website = (TextView) youthvi.findViewById(R.id.website_txt);
            viewHolder.mealInformation = (TextView) youthvi.findViewById(R.id.mealInformation_txt);
            youthvi.setTag(viewHolder);
        }else
            viewHolder = (ViewHolder) view.getTag();
        viewHolder.geographicArea.setText(youthresource.getGeographicArea());
        viewHolder.programName.setText(youthresource.getProgramName());
        viewHolder.location.setText(youthresource.getLocation());
        viewHolder.phoneNumber.setText(youthresource.getPhoneNumber());
        viewHolder.website.setText(youthresource.getWebsite());
        viewHolder.mealInformation.setText(youthresource.getMealInformation());
        return youthvi;
    }
    public class ViewHolder{
        TextView geographicArea;
        TextView programName;
        TextView location;
        TextView phoneNumber;
        TextView website;
        TextView mealInformation;
    }
}


