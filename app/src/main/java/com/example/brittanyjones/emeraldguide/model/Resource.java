package com.example.brittanyjones.emeraldguide.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Resource {
    @SerializedName("day_time")
    private String dayTime;

    @SerializedName("location")
    private String location;

    @SerializedName("meal_served")
    private String mealServed;

    @SerializedName("name_of_program")
    private String nameOfProgram;

    @SerializedName("people_served")
    private String peopleServed;

    public Resource(String dayTime, String location, String mealServed,
                    String nameOfProgram, String peopleServed) {
        this.dayTime = dayTime;
        this.location = location;
        this.mealServed = mealServed;
        this.nameOfProgram = nameOfProgram;
        this.peopleServed = peopleServed;
    }

    public String getDayTime() {
        return dayTime;
    }

    public void setDayTime(String dayTime){
        this.dayTime = dayTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMealServed() {
        return mealServed;
    }

    public void setMealServed(String mealServed) {
        this.mealServed = mealServed;
    }

    public String getNameOfProgram() {
        return nameOfProgram;
    }

    public void setNameOfProgram(String nameOfProgram) {
        this.nameOfProgram = nameOfProgram;
    }

    public String getPeopleServed() {
        return peopleServed;
    }

    public void setPeopleServed(String peopleServed) {
        this.peopleServed = peopleServed;
    }

}

