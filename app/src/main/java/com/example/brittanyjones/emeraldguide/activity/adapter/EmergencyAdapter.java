package com.example.brittanyjones.emeraldguide.activity.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.brittanyjones.emeraldguide.R;
import com.example.brittanyjones.emeraldguide.activity.model.Emergency;

import java.util.List;

public class EmergencyAdapter extends BaseAdapter {
    Context context;
    List<Emergency> dataList;

    private View emvi;
    private ViewHolder viewHolder;
    private static LayoutInflater inflater = null;
    public EmergencyAdapter(Context context, List<Emergency> dataList){
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
        emvi = view;
        //Populate the Listview
        final int pos = position;
        Emergency emergency = dataList.get(pos);
        if(emvi == null) {
            emvi = inflater.inflate(R.layout.listitem_emergency, viewGroup, false);
            viewHolder = new ViewHolder();
            viewHolder.category = (TextView) emvi.findViewById(R.id.emgCategory_txt);
            viewHolder.emergencyName = (TextView) emvi.findViewById(R.id.emergencyName_txt);
            viewHolder.emergencyInformation = (TextView) emvi.findViewById(R.id.emergencyInformation_txt);
            viewHolder.phoneNumber = (TextView) emvi.findViewById(R.id.emgPhoneNumber_txt);
            viewHolder.website = (TextView) emvi.findViewById(R.id.emgWebsite_txt);
            emvi.setTag(viewHolder);
        }else
            viewHolder = (ViewHolder) view.getTag();

        viewHolder.category.setText(emergency.getCategory());
        viewHolder.emergencyName.setText(emergency.getEmergencyName());
        viewHolder.emergencyInformation.setText(emergency.getEmergencyInformation());
        viewHolder.phoneNumber.setText(emergency.getPhoneNumber());
        viewHolder.website.setText(emergency.getWebsite());

        return emvi;
    }

    public class ViewHolder{
        TextView category;
        TextView emergencyName;
        TextView emergencyInformation;
        TextView phoneNumber;
        TextView website;
    }
}