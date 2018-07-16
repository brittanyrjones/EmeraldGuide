package com.example.brittanyjones.emeraldguide.activity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class EmergencyList {

        @SerializedName("emergency")
        @Expose
        private ArrayList<Emergency> emergency = null;

        public ArrayList<Emergency> getEmergency() {
            return emergency;
        }

        public void setResource(ArrayList<Emergency> resource) {
            this.emergency = emergency;
        }

    }

