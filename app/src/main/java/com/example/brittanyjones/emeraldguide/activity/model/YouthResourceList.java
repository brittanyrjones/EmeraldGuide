package com.example.brittanyjones.emeraldguide.activity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class YouthResourceList {

    @SerializedName("youthresource")
    @Expose
    private ArrayList<YouthResource> youthresource = null;
    public ArrayList<YouthResource> getYouthresource() {
        return youthresource;
    }
    public void setYouthResource(ArrayList<YouthResource> youthresource) {
        this.youthresource = youthresource;
    }
}


