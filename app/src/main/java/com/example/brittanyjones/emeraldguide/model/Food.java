package com.example.brittanyjones.emeraldguide.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Food {
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

    public Food withDayTime(String dayTime) {
        this.dayTime = dayTime;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Food withLocation(String location) {
        this.location = location;
        return this;
    }

    public String getMealServed() {
        return mealServed;
    }

    public void setMealServed(String mealServed) {
        this.mealServed = mealServed;
    }

    public Food withMealServed(String mealServed) {
        this.mealServed = mealServed;
        return this;
    }

    public String getNameOfProgram() {
        return nameOfProgram;
    }

    public void setNameOfProgram(String nameOfProgram) {
        this.nameOfProgram = nameOfProgram;
    }

    public Food withNameOfProgram(String nameOfProgram) {
        this.nameOfProgram = nameOfProgram;
        return this;
    }

    public String getPeopleServed() {
        return peopleServed;
    }

    public void setPeopleServed(String peopleServed) {
        this.peopleServed = peopleServed;
    }

    public Food withPeopleServed(String peopleServed) {
        this.peopleServed = peopleServed;
        return this;
    }

}
