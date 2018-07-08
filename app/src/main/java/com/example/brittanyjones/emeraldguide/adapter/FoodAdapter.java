package com.example.brittanyjones.emeraldguide.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.brittanyjones.emeraldguide.R;
import com.example.brittanyjones.emeraldguide.model.Food;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {

    private ArrayList<Food> dataList;

    public FoodAdapter(ArrayList<Food> dataList) {
        this.dataList = dataList;
    }
    @Override
    public FoodViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_food, parent, false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FoodViewHolder holder, int position) {
        holder.txtFoodName.setText(dataList.get(position).getNameOfProgram());
        holder.txtFoodLocation.setText(dataList.get(position).getLocation());
        holder.txtFoodDayTime.setText(dataList.get(position).getDayTime());
        holder.txtFoodPeopleServed.setText(dataList.get(position).getPeopleServed());
        holder.txtFoodMealServed.setText(dataList.get(position).getMealServed());
    }
    @Override
    public int getItemCount() {
        return dataList.size();
    }
    class FoodViewHolder extends RecyclerView.ViewHolder {

        TextView txtFoodName, txtFoodLocation, txtFoodDayTime, txtFoodPeopleServed, txtFoodMealServed;

        FoodViewHolder(View itemView) {
            super(itemView);
            txtFoodName = (TextView) itemView.findViewById(R.id.txt_food_location_name);
            txtFoodLocation = (TextView) itemView.findViewById(R.id.txt_food_location);
            txtFoodDayTime = (TextView) itemView.findViewById(R.id.txt_food_time_served);
            txtFoodMealServed = (TextView) itemView.findViewById(R.id.txt_food_meal_served);
            txtFoodPeopleServed = (TextView) itemView.findViewById(R.id.txt_food_people_served);

        }
    }

}
