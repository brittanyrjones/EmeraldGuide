package com.example.brittanyjones.emeraldguide.activity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Abhi on 06 Sep 2017 006.
 */

public class ResourceList {

    @SerializedName("resource")
    @Expose
    private ArrayList<Resource> resource = null;

    public ArrayList<Resource> getResource() {
        return resource;
    }

    public void setResource(ArrayList<Resource> resource) {
        this.resource = resource;
    }

}