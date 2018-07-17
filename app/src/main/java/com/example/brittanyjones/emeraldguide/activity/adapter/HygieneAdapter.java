package com.example.brittanyjones.emeraldguide.activity.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.brittanyjones.emeraldguide.R;
import com.example.brittanyjones.emeraldguide.activity.model.Emergency;
import com.example.brittanyjones.emeraldguide.activity.model.Hygiene;

import java.util.List;

public class HygieneAdapter extends BaseAdapter {

    Context context;
    List<Hygiene> dataList;

    private View hyvi;
    private ViewHolder viewHolder;
    private static LayoutInflater inflater = null;

    public HygieneAdapter(Context context, List<Hygiene> dataList){
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
        hyvi = view;
        //Populate the Listview
        final int pos = position;
        Hygiene hygiene = dataList.get(pos);
        if(hyvi == null) {
            hyvi = inflater.inflate(R.layout.listitem_hygiene, viewGroup, false);
            viewHolder = new ViewHolder();
            viewHolder.category = (TextView) hyvi.findViewById(R.id.hygCategory_txt);
            viewHolder.hygieneName = (TextView) hyvi.findViewById(R.id.hygieneName_txt);
            viewHolder.hygieneInformation = (TextView) hyvi.findViewById(R.id.hygieneInformation_txt);
            viewHolder.phoneNumber = (TextView) hyvi.findViewById(R.id.hygPhoneNumber_txt);
            viewHolder.website = (TextView) hyvi.findViewById(R.id.hygWebsite_txt);
            viewHolder.area = (TextView) hyvi.findViewById(R.id.hygArea_txt);
            viewHolder.hygieneAddress = (TextView) hyvi.findViewById(R.id.hygieneAddress_txt);
            viewHolder.hygieneHours = (TextView) hyvi.findViewById(R.id.hygieneHours_txt);
            hyvi.setTag(viewHolder);
        }else
            viewHolder = (ViewHolder) view.getTag();

        viewHolder.category.setText(hygiene.getCategory());
        viewHolder.hygieneName.setText(hygiene.getHygieneName());
        viewHolder.hygieneInformation.setText(hygiene.getHygieneInformation());
        viewHolder.phoneNumber.setText(hygiene.getPhoneNumber());
        viewHolder.website.setText(hygiene.getWebsite());
        viewHolder.hygieneHours.setText(hygiene.getHygieneHours());
        viewHolder.area.setText(hygiene.getArea());
        viewHolder.hygieneAddress.setText(hygiene.getHygieneAddress();

        return hyvi;
    }

    public class ViewHolder{
        TextView category;
        TextView hygieneName;
        TextView hygieneInformation;
        TextView phoneNumber;
        TextView website;
        TextView hygieneHours;
        TextView hygieneAddress;
        TextView area;
    }
}
