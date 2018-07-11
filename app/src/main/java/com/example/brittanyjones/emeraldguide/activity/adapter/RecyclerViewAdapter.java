package com.example.brittanyjones.emeraldguide.activity.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.brittanyjones.emeraldguide.R;
import com.example.brittanyjones.emeraldguide.activity.model.Resource;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private List<Resource> item;
    Context context ;

        public RecyclerViewAdapter(Context context, List<Resource> item ) {
            Log.d("123", "RecyclerViewAdapter");
            this.item = item;
            this.context = context;
        }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d("123", "onCreateViewHolder");
        View view = LayoutInflater.from(context).inflate(R.layout.resource_list, null);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Log.d("123", "onBindViewHolder");
        holder.name_of_program.setText(item.get(position).getName_Of_Program());
        holder.location.setText(item.get(position).getLocation());
        holder.meal_served.setText(item.get(position).getMeal_Served());
        holder.people_served.setText(item.get(position).getPeopleServed());
        holder.day_time.setText(item.get(position).getDayTime());
    }


    @Override
    public int getItemCount() {
        Log.d("123", "getItemCount");
        return item.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name_of_program, location, meal_served, people_served, day_time;

        public ViewHolder(View itemView) {
            super(itemView);
            Log.d("123", "ViewHolder");

            name_of_program = (TextView) itemView.findViewById(R.id.nameOfProgram);
            location = (TextView) itemView.findViewById(R.id.location);
            meal_served = (TextView) itemView.findViewById(R.id.mealServed);
            people_served = (TextView) itemView.findViewById(R.id.peopleServed);
            day_time = (TextView) itemView.findViewById(R.id.dayTime);
        }
    }
}