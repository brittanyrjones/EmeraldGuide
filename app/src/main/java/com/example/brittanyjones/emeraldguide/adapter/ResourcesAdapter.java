package com.example.brittanyjones.emeraldguide.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.brittanyjones.emeraldguide.R;
import com.example.brittanyjones.emeraldguide.model.Resource;

import java.util.List;

public class ResourcesAdapter extends RecyclerView.Adapter<ResourcesAdapter.ResourceViewHolder> {

    private List<Resource> resources;
    private int rowLayout;
    private Context context;

    public static class ResourceViewHolder extends RecyclerView.ViewHolder {
        LinearLayout ResourcesLayout;
        TextView movieTitle;
        TextView data;
        TextView movieDescription;
        TextView rating;

        public ResourceViewHolder(View v) {
            super(v);
            resourcesLayout = (LinearLayout) v.findViewById(R.id.movies_layout);
            movieTitle = (TextView) v.findViewById(R.id.title);
            data = (TextView) v.findViewById(R.id.subtitle);
            movieDescription = (TextView) v.findViewById(R.id.description);
            rating = (TextView) v.findViewById(R.id.rating);
        }
    }
    public ResourcesAdapter(List<Resource> resources, int rowLayout, Context context) {
        this.resources = resources;
        this.rowLayout = rowLayout;
        this.context = context;
    }


    @Override
    public ResourcesAdapter.ResourceViewHolder onCreateViewHolder(ViewGroup parent,
                                                            int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new ResourceViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ResourceViewHolder holder, final int position) {
        holder.movieTitle.setText(resources.get(position).getNameOfProgram());
        holder.data.setText(resources.get(position).getLocation());
        holder.movieDescription.setText(resources.get(position).getDayTime());
        holder.rating.setText(resources.get(position).getMealServed());
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }
}

