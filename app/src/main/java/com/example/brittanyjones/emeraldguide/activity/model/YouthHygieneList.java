package com.example.brittanyjones.emeraldguide.activity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class YouthHygieneList {
    @SerializedName("youthhygiene")
    @Expose
    private ArrayList<YouthHygiene> youthhygiene = null;

    public ArrayList<YouthHygiene> getYouthHygiene() { return youthhygiene; }

    public void setYouthHygiene(ArrayList<YouthHygiene> youthhygiene) {
        this.youthhygiene = youthhygiene;
    }
}
