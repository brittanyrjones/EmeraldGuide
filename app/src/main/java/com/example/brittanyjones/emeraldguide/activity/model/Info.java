package com.example.brittanyjones.emeraldguide.activity.model;//package com.example.brittanyjones.emeraldguide.activity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Info{
    @SerializedName("Geographic Area")
    @Expose
    private String geographicArea;
    @SerializedName("Program Name")
    @Expose
    private String programName;
    @SerializedName("Location")
    @Expose
    private String location;
    @SerializedName("Phone Number")
    @Expose
    private String phoneNumber;
    @SerializedName("Website")
    @Expose
    private String website;
    @SerializedName("Meal Information")
    @Expose
    private String mealInformation;

    public Info(String geographicArea, String programName, String location, String phoneNumber, String website, String mealInformation) {
        super();
        this.geographicArea = geographicArea;
        this.programName = programName;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.website = website;
        this.mealInformation = mealInformation;
    }

    public String getGeographicArea() {
        return geographicArea;
    }

    public void setGeographicArea(String geographicArea) {
        this.geographicArea = geographicArea;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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

    public String getMealInformation() {
        return mealInformation;
    }

    public void setMealInformation(String mealInformation) {
        this.mealInformation = mealInformation;
    }

}