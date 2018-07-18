package com.example.brittanyjones.emeraldguide.activity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class YouthShelterList {
    @SerializedName("youthshelter")
    @Expose
    private ArrayList<YouthShelter> youthshelter = null;

    public ArrayList<YouthShelter> getYouthShelter() {
        return youthshelter;
    }

    public void setYouthShelter(ArrayList<YouthShelter> youthshelter) {
        this.youthshelter = youthshelter;
    }
}
