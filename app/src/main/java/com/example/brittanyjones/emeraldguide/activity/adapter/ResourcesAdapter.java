package com.example.brittanyjones.emeraldguide.activity.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.brittanyjones.emeraldguide.R;
import com.example.brittanyjones.emeraldguide.activity.model.Resource;

import java.util.List;

public class ResourcesAdapter extends RecyclerView.Adapter<ResourcesAdapter.CustomViewHolder> {
        private List<Resource> resources;

        public ResourcesAdapter(List<Resource> resources) {
            this.resources = resources;
        }

        @Override
        public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.resource_list, parent, false);

            return new CustomViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(CustomViewHolder holder, int position) {
            Resource resource = resources.get(position);
            holder.nameOfProgram.setText(resource.getNameOfProgram());
            holder.location.setText(resource.getLocation());
            holder.peopleServed.setText(resource.getPeopleServed());
            holder.mealServed.setText(resource.getMealServed());
            holder.dayTime.setText(resource.getDayTime());

        }

        @Override
        public int getItemCount() {
            return resources.size();
        }

        public class CustomViewHolder extends RecyclerView.ViewHolder {
            public TextView nameOfProgram, location, peopleServed, mealServed, dayTime;

            public CustomViewHolder(View view) {
                super(view);
                nameOfProgram = (TextView) view.findViewById(R.id.nameOfProgram);
                location = (TextView) view.findViewById(R.id.location);
                peopleServed = (TextView) view.findViewById(R.id.peopleServed);
                mealServed = (TextView) view.findViewById(R.id.mealServed);
                dayTime = (TextView) view.findViewById(R.id.dayTime);
            }
        }
    }

