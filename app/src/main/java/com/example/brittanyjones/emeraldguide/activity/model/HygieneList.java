package com.example.brittanyjones.emeraldguide.activity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class HygieneList {

    @SerializedName("hygiene")
    @Expose
    private ArrayList<Hygiene> hygiene = null;

    public ArrayList<Hygiene> getHygiene() { return hygiene; }

    public void setHygiene(ArrayList<Hygiene> hygiene) {
        this.hygiene = hygiene;
    }

}
