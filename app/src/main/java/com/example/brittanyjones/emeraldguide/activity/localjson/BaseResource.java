package com.example.brittanyjones.emeraldguide.activity.localjson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class BaseResource {



        @SerializedName("resources")
        @Expose
        private List<Resource> resources = new ArrayList<>();

        public List<Resource> getResources() {
            return resources;
        }

        public void setResources(List<Resource> resources) {
            this.resources = resources;
        }
    }

