package com.example.brittanyjones.emeraldguide.activity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class YouthHygiene {
    @SerializedName("Area")
    @Expose
    private String area;
    @SerializedName("Hygiene Address")
    @Expose
    private String hygieneAddress;
    @SerializedName("Category")
    @Expose
    private String category;
    @SerializedName("Hygiene Name")
    @Expose
    private String hygieneName;
    @SerializedName("Phone Number")
    @Expose
    private String phoneNumber;
    @SerializedName("Website")
    @Expose
    private String website;
    @SerializedName("Hygiene Information")
    @Expose
    private String hygieneInformation;
    @SerializedName("Hygiene Hours")
    @Expose
    private String hygieneHours;

    public YouthHygiene(String area, String hygieneAddress, String category, String hygieneName, String phoneNumber, String website, String hygieneInformation, String hygieneHours) {
        super();
        this.area = area;
        this.hygieneAddress = hygieneAddress;
        this.category = category;
        this.hygieneName = hygieneName;
        this.phoneNumber = phoneNumber;
        this.website = website;
        this.hygieneInformation = hygieneInformation;
        this.hygieneHours = hygieneHours;
    }
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getHygieneAddress() {
        return hygieneAddress;
    }

    public void setHygieneAddress(String hygieneAddress) {
        this.hygieneAddress = hygieneAddress;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getHygieneName() {
        return hygieneName;
    }

    public void setHygieneName(String hygieneName) {
        this.hygieneName = hygieneName;
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

    public String getHygieneInformation() {
        return hygieneInformation;
    }

    public void setHygieneInformation(String hygieneInformation) {
        this.hygieneInformation = hygieneInformation;
    }

    public String getHygieneHours() {
        return hygieneHours;
    }

    public void setHygieneHours(String hygieneHours) {
        this.hygieneHours = hygieneHours;
    }


}
