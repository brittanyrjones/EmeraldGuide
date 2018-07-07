package com.example.brittanyjones.emeraldguide.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.brittanyjones.emeraldguide.R;
import com.example.brittanyjones.emeraldguide.model.Resource;

import java.util.List;

public class ResourcesAdapter extends RecyclerView.Adapter<ResourcesAdapter.ResourceViewHolder> {

    private List<Resource> resources;
    private int rowLayout;
    private Context context;

    public ResourcesAdapter(Context context,List<Resource> dataList){
        this.context = context;
        this.dataList = dataList;
}

class ResourceViewHolder extends RecyclerView.ViewHolder {

    public final View mView;

    TextView txtTitle;
    private ImageView coverImage;

    ResourceViewHolder(View itemView) {
        super(itemView);
        mView = itemView;

        txtTitle = mView.findViewById(R.id.nameOfProgram);
        coverImage = mView.findViewById(R.id.coverImage);
    }
}

    @Override
    public ResourceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.custom_row, parent, false);
        return new ResourceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ResourceViewHolder holder, int position) {
        holder.txtTitle.setText(dataList.get(position).getTitle());

        Picasso.Builder builder = new Picasso.Builder(context);
        builder.downloader(new OkHttp3Downloader(context));
        builder.build().load(dataList.get(position).getThumbnailUrl())
                .placeholder((R.drawable.ic_launcher_background))
                .error(R.drawable.ic_launcher_background)
                .into(holder.coverImage);

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
