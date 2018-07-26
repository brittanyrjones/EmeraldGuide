package com.example.brittanyjones.emeraldguide.activity.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.brittanyjones.emeraldguide.R;
import com.example.brittanyjones.emeraldguide.activity.model.YouthHygiene;

import java.util.List;

public class YouthHygieneAdapter extends BaseAdapter{
    Context context;
    List<YouthHygiene> dataList;
    private View youthhyvi;
    private ViewHolder viewHolder;
    private static LayoutInflater inflater = null;
    public YouthHygieneAdapter(Context context, List<YouthHygiene> dataList){
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
        youthhyvi = view;
        //Populate the Listview
        final int pos = position;
        YouthHygiene youthhygiene = dataList.get(pos);
        if(youthhyvi == null) {
            youthhyvi = inflater.inflate(R.layout.listitem_hygiene, viewGroup, false);
            viewHolder = new ViewHolder();
            viewHolder.category = (TextView) youthhyvi.findViewById(R.id.hygCategory_txt);
            viewHolder.hygieneName = (TextView) youthhyvi.findViewById(R.id.hygieneName_txt);
            viewHolder.hygieneInformation = (TextView) youthhyvi.findViewById(R.id.hygieneInformation_txt);
            viewHolder.phoneNumber = (TextView) youthhyvi.findViewById(R.id.hygPhoneNumber_txt);
            viewHolder.website = (TextView) youthhyvi.findViewById(R.id.hygWebsite_txt);
            viewHolder.area = (TextView) youthhyvi.findViewById(R.id.hygArea_txt);
            viewHolder.hygieneAddress = (TextView) youthhyvi.findViewById(R.id.hygieneAddress_txt);
            viewHolder.hygieneHours = (TextView) youthhyvi.findViewById(R.id.hygieneHours_txt);
            youthhyvi.setTag(viewHolder);
        }else
            viewHolder = (ViewHolder) view.getTag();
        viewHolder.category.setText(youthhygiene.getCategory());
        viewHolder.hygieneName.setText(youthhygiene.getHygieneName());
        viewHolder.hygieneInformation.setText(youthhygiene.getHygieneInformation());
        viewHolder.phoneNumber.setText(youthhygiene.getPhoneNumber());
        viewHolder.website.setText(youthhygiene.getWebsite());
        viewHolder.hygieneHours.setText(youthhygiene.getHygieneHours());
        viewHolder.area.setText(youthhygiene.getArea());
        viewHolder.hygieneAddress.setText(youthhygiene.getHygieneAddress());
        return youthhyvi;
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
