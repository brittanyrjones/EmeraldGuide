package com.example.brittanyjones.emeraldguide.activity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class BaseResource {

    @SerializedName("resources")
    @Expose
    private ArrayList<Resource> resource = null;

    public ArrayList<Resource> getResource() {
        return resource;
    }

    public void setResource(ArrayList<Resource> resource) {
        this.resource = resource;
    }

}
