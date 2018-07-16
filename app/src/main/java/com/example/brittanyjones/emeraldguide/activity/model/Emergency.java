package com.example.brittanyjones.emeraldguide.activity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Emergency {
    @SerializedName("Category")
    @Expose
    private String category;
    @SerializedName("Emergency Name")
    @Expose
    private String emergencyName;
    @SerializedName("Phone Number")
    @Expose
    private String phoneNumber;
    @SerializedName("Website")
    @Expose
    private String website;
    @SerializedName("Emergency Information")
    @Expose
    private String emergencyInformation;

    public Emergency(String category, String emergencyName, String phoneNumber, String website, String emergencyInformation) {
        super();
        this.category = category;
        this.emergencyName = emergencyName;
        this.phoneNumber = phoneNumber;
        this.website = website;
        this.emergencyInformation = emergencyInformation;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getEmergencyName() {
        return emergencyName;
    }

    public void setEmergencyName(String emergencyName) {
        this.emergencyName = emergencyName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getEmergencyInformation() {
        return emergencyInformation;
    }

    public void setEmergencyInformation(String emergencyInformation) {
        this.emergencyInformation = emergencyInformation;
    }

}
