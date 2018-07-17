package com.example.brittanyjones.emeraldguide.activity.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.brittanyjones.emeraldguide.R;
import com.example.brittanyjones.emeraldguide.activity.model.Hygiene;
import com.example.brittanyjones.emeraldguide.activity.model.Shelter;

import java.util.List;

public class ShelterAdapter extends BaseAdapter {


    Context context;
    List<Shelter> dataList;

    private View shelvi;
    private ViewHolder viewHolder;
    private static LayoutInflater inflater = null;

    public ShelterAdapter(Context context, List<Shelter> dataList){
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
        shelvi = view;
        //Populate the Listview
        final int pos = position;
        Shelter shelter = dataList.get(pos);
        if(shelvi == null) {
            shelvi = inflater.inflate(R.layout.listitem_hygiene, viewGroup, false);
            viewHolder = new ViewHolder();
            viewHolder.category = (TextView) shelvi.findViewById(R.id.shelCategory_txt);
            viewHolder.shelterName = (TextView) shelvi.findViewById(R.id.shelterName_txt);
            viewHolder.shelterInformation = (TextView) shelvi.findViewById(R.id.shelterInformation_txt);
            viewHolder.phoneNumber = (TextView) shelvi.findViewById(R.id.shelPhoneNumber_txt);
            viewHolder.website = (TextView) shelvi.findViewById(R.id.shelWebsite_txt);
            viewHolder.area = (TextView) shelvi.findViewById(R.id.shelArea_txt);
            viewHolder.shelterAddress = (TextView) shelvi.findViewById(R.id.shelterAddress_txt);
            viewHolder.shelterHours = (TextView) shelvi.findViewById(R.id.shelterHours_txt);
            viewHolder.peopleServed = (TextView) shelvi.findViewById(R.id.shelterPeople_Served_txt);
            shelvi.setTag(viewHolder);
        }else
            viewHolder = (ViewHolder) view.getTag();

        viewHolder.category.setText(shelter.getCategory());
        viewHolder.shelterName.setText(shelter.getShelterName());
        viewHolder.shelterInformation.setText(shelter.getShelterInformation());
        viewHolder.phoneNumber.setText(shelter.getPhoneNumber());
        viewHolder.website.setText(shelter.getWebsite());
        viewHolder.shelterHours.setText(shelter.getShelterHours());
        viewHolder.area.setText(shelter.getArea());
        viewHolder.shelterAddress.setText(shelter.getShelterAddress());
        viewHolder.peopleServed.setText(shelter.getPeopleServed());


        return shelvi;
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
