package com.example.brittanyjones.emeraldguide.activity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ShelterList {
    @SerializedName("shelter")
    @Expose
    private ArrayList<Shelter> shelter = null;

    public ArrayList<Shelter> getShelter() {
        return shelter;
    }

    public void setShelter(ArrayList<Shelter> shelter) {
        this.shelter = shelter;
    }
}
