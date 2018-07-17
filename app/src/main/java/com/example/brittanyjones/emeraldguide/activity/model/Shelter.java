package com.example.brittanyjones.emeraldguide.activity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Shelter {
    @SerializedName("Area")
    @Expose
    private String area;
    @SerializedName("Shelter Address")
    @Expose
    private String shelterAddress;
    @SerializedName("Category")
    @Expose
    private String category;
    @SerializedName("Shelter Name")
    @Expose
    private String shelterName;
    @SerializedName("Phone Number")
    @Expose
    private String phoneNumber;
    @SerializedName("Website")
    @Expose
    private String website;
    @SerializedName("Shelter Information")
    @Expose
    private String shelterInformation;
    @SerializedName("Shelter Hours")
    @Expose
    private String shelterHours;
    @SerializedName("People Served")
    @Expose
    private String peopleServed;

    public Shelter(String area, String shelterAddress, String category, String shelterName, String phoneNumber, String website, String shelterInformation, String shelterHours, String peopleServed) {
        super();
        this.area = area;
        this.shelterAddress = shelterAddress;
        this.category = category;
        this.shelterName = shelterName;
        this.phoneNumber = phoneNumber;
        this.website = website;
        this.shelterInformation = shelterInformation;
        this.shelterHours = shelterHours;
        this.peopleServed = peopleServed;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getShelterAddress() {
        return shelterAddress;
    }

    public void setShelterAddress(String shelterAddress) {
        this.shelterAddress = shelterAddress;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getShelterName() {
        return shelterName;
    }

    public void setShelterName(String shelterName) {
        this.shelterName = shelterName;
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

    public String getShelterInformation() {
        return shelterInformation;
    }

    public void setShelterInformation(String shelterInformation) {
        this.shelterInformation = shelterInformation;
    }

    public String getShelterHours() {
        return shelterHours;
    }

    public void setShelterHours(String shelterHours) {
        this.shelterHours = shelterHours;
    }

    public String getPeopleServed() {
        return peopleServed;
    }

    public void setPeopleServed(String peopleServed) {
        this.peopleServed = peopleServed;
    }












}
