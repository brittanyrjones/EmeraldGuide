package com.example.brittanyjones.emeraldguide.activity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Resource {
    @SerializedName("day_time")
    @Expose
    private String dayTime;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("meal_served")
    @Expose
    private String mealServed;
    @SerializedName("name_of_program")
    @Expose
    private String nameOfProgram;
    @SerializedName("people_served")
    @Expose
    private String peopleServed;

    public String getDayTime() {
        return dayTime;
    }

    public void setDayTime(String dayTime) {
        this.dayTime = dayTime;
    }

    public Resource withDayTime(String dayTime) {
        this.dayTime = dayTime;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Resource withLocation(String location) {
        this.location = location;
        return this;
    }

    public String getMealServed() {
        return mealServed;
    }

    public void setMealServed(String mealServed) {
        this.mealServed = mealServed;
    }

    public Resource withMealServed(String mealServed) {
        this.mealServed = mealServed;
        return this;
    }

    public String getNameOfProgram() {
        return nameOfProgram;
    }

    public void setNameOfProgram(String nameOfProgram) {
        this.nameOfProgram = nameOfProgram;
    }

    public Resource withNameOfProgram(String nameOfProgram) {
        this.nameOfProgram = nameOfProgram;
        return this;
    }

    public String getPeopleServed() {
        return peopleServed;
    }

    public void setPeopleServed(String peopleServed) {
        this.peopleServed = peopleServed;
    }

    public Resource withPeopleServed(String peopleServed) {
        this.peopleServed = peopleServed;
        return this;
    }

}

