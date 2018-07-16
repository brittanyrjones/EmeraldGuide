package com.example.brittanyjones.emeraldguide.activity.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.brittanyjones.emeraldguide.R;
import com.example.brittanyjones.emeraldguide.activity.model.Resource;

import java.util.List;

public class ResourceAdapter extends BaseAdapter {

    Context context;
    List<Resource> dataList;

    private View vi;
    private ViewHolder viewHolder;
    private static LayoutInflater inflater = null;


    public ResourceAdapter(Context context, List<Resource> dataList){
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
        vi = view;
        //Populate the Listview
        final int pos = position;
        Resource resource = dataList.get(pos);
        if(vi == null) {
            vi = inflater.inflate(R.layout.listitem_resource, viewGroup, false);
            viewHolder = new ViewHolder();
            viewHolder.geographicArea = (TextView) vi.findViewById(R.id.geographicArea_txt);
            viewHolder.programName = (TextView) vi.findViewById(R.id.programName_txt);
            viewHolder.location = (TextView) vi.findViewById(R.id.location_txt);
            viewHolder.phoneNumber = (TextView) vi.findViewById(R.id.phoneNumber_txt);
            viewHolder.website = (TextView) vi.findViewById(R.id.website_txt);
            viewHolder.mealInformation = (TextView) vi.findViewById(R.id.mealInformation_txt);
            vi.setTag(viewHolder);
        }else
            viewHolder = (ViewHolder) view.getTag();

        viewHolder.geographicArea.setText(resource.getGeographicArea());
        viewHolder.programName.setText(resource.getProgramName());
        viewHolder.location.setText(resource.getLocation());
        viewHolder.phoneNumber.setText(resource.getPhoneNumber());
        viewHolder.website.setText(resource.getWebsite());
        viewHolder.mealInformation.setText(resource.getMealInformation());

        return vi;
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
