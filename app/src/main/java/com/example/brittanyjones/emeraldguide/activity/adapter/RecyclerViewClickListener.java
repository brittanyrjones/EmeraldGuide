package com.example.brittanyjones.emeraldguide.activity.adapter;


import android.view.View;

public interface RecyclerViewClickListener {
    void onClick(View view, int position);

    void onLongClick(View view, int position);
}