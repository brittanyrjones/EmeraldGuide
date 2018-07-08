package com.example.brittanyjones.emeraldguide.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class FoodList {
    @SerializedName("foodList")
    private ArrayList<Food> foodList;

    public ArrayList<Food> getFoodArrayList() {
        return foodList;
    }

    public void setFoodArrayList(ArrayList<Food> foodArrayList) {
        this.foodList = foodArrayList;
    }
}
