package com.example.brittanyjones.emeraldguide.activity.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Resource {
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

    public Resource(String geographicArea, String programName, String location, String phoneNumber, String website, String mealInformation) {
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
























//    private String name_of_program;
//    private String meal_served;
//    private String location;
//    private String people_served;
//    private String day_time;
//
//    public Resource(String name_of_program, String meal_served, String location, String people_served, String day_time) {
//
//        this.name_of_program = name_of_program;
//        this.meal_served = meal_served;
//        this.location = location;
//        this.people_served = people_served;
//        this.day_time = day_time;
//
//    }
//
//    public String getName_Of_Program() {
//        return name_of_program;
//    }
//
//    public void setName_Of_Program(String name_of_program) {
//        this.name_of_program = name_of_program;
//    }
//
//    public String getMeal_Served() {
//        return meal_served;
//    }
//
//    public void setMeal_Served(String meal_served) {
//        this.meal_served = meal_served;
//    }
//
//    public String getLocation() {
//        return location;
//    }
//
//    public void setLocation(String location) {
//        this.location = location;
//    }
//    public String getPeopleServed() {
//        return people_served;
//    }
//
//    public void setPeopleServed(String people_served) {
//        this.people_served = people_served;
//    }
//    public String getDayTime() {
//        return day_time;
//    }
//
//    public void setDaytime(String day_time) {
//        this.day_time = day_time;
//    }










//public class Resource {
//    @SerializedName("day_time")
//    @Expose
//    private String dayTime;
//    @SerializedName("location")
//    @Expose
//    private String location;
//    @SerializedName("meal_served")
//    @Expose
//    private String mealServed;
//    @SerializedName("name_of_program")
//    @Expose
//    private String nameOfProgram;
//    @SerializedName("people_served")
//    @Expose
//    private String peopleServed;
//
//    public String getDayTime() {
//        return dayTime;
//    }
//
//    public void setDayTime(String dayTime) {
//        this.dayTime = dayTime;
//    }
//
//    public Resource withDayTime(String dayTime) {
//        this.dayTime = dayTime;
//        return this;
//    }
//
//    public String getLocation() {
//        return location;
//    }
//
//    public void setLocation(String location) {
//        this.location = location;
//    }
//
//    public Resource withLocation(String location) {
//        this.location = location;
//        return this;
//    }
//
//    public String getMealServed() {
//        return mealServed;
//    }
//
//    public void setMealServed(String mealServed) {
//        this.mealServed = mealServed;
//    }
//
//    public Resource withMealServed(String mealServed) {
//        this.mealServed = mealServed;
//        return this;
//    }
//
//    public String getNameOfProgram() {
//        return nameOfProgram;
//    }
//
//    public void setNameOfProgram(String nameOfProgram) {
//        this.nameOfProgram = nameOfProgram;
//    }
//
//    public Resource withNameOfProgram(String nameOfProgram) {
//        this.nameOfProgram = nameOfProgram;
//        return this;
//    }
//
//    public String getPeopleServed() {
//        return peopleServed;
//    }
//
//    public void setPeopleServed(String peopleServed) {
//        this.peopleServed = peopleServed;
//    }
//
//    public Resource withPeopleServed(String peopleServed) {
//        this.peopleServed = peopleServed;
//        return this;
//    }
//
//}
//
