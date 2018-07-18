package com.example.brittanyjones.emeraldguide.activity.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.brittanyjones.emeraldguide.R;
import com.example.brittanyjones.emeraldguide.activity.model.YouthShelter;

import java.util.List;

public class YouthShelterAdapter extends BaseAdapter {
    Context context;
    List<YouthShelter> dataList;

    private View youthshelvi;
    private ViewHolder viewHolder;
    private static LayoutInflater inflater = null;

    public YouthShelterAdapter(Context context, List<YouthShelter> dataList){
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
        youthshelvi = view;
        //Populate the Listview
        final int pos = position;
        YouthShelter youthshelter = dataList.get(pos);
        if(youthshelvi == null) {
            youthshelvi = inflater.inflate(R.layout.listitem_shelter, viewGroup, false);
            viewHolder = new ViewHolder();
            viewHolder.category = (TextView) youthshelvi.findViewById(R.id.shelCategory_txt);
            viewHolder.shelterName = (TextView) youthshelvi.findViewById(R.id.shelterName_txt);
            viewHolder.shelterInformation = (TextView) youthshelvi.findViewById(R.id.shelterInformation_txt);
            viewHolder.phoneNumber = (TextView) youthshelvi.findViewById(R.id.shelPhoneNumber_txt);
            viewHolder.website = (TextView) youthshelvi.findViewById(R.id.shelWebsite_txt);
            viewHolder.area = (TextView) youthshelvi.findViewById(R.id.shelArea_txt);
            viewHolder.shelterAddress = (TextView) youthshelvi.findViewById(R.id.shelterAddress_txt);
            viewHolder.shelterHours = (TextView) youthshelvi.findViewById(R.id.shelterHours_txt);
            viewHolder.peopleServed = (TextView) youthshelvi.findViewById(R.id.shelterPeople_Served_txt);
            youthshelvi.setTag(viewHolder);
        }else
            viewHolder = (ViewHolder) view.getTag();

        viewHolder.category.setText(youthshelter.getCategory());
        viewHolder.shelterName.setText(youthshelter.getShelterName());
        viewHolder.shelterInformation.setText(youthshelter.getShelterInformation());
        viewHolder.phoneNumber.setText(youthshelter.getPhoneNumber());
        viewHolder.website.setText(youthshelter.getWebsite());
        viewHolder.shelterHours.setText(youthshelter.getShelterHours());
        viewHolder.area.setText(youthshelter.getArea());
        viewHolder.shelterAddress.setText(youthshelter.getShelterAddress());
        viewHolder.peopleServed.setText(youthshelter.getPeopleServed());


        return youthshelvi;
    }

    public class ViewHolder{
        TextView category;
        TextView shelterName;
        TextView shelterInformation;
        TextView phoneNumber;
        TextView website;
        TextView shelterHours;
        TextView shelterAddress;
        TextView area;
        TextView peopleServed;
    }
}
