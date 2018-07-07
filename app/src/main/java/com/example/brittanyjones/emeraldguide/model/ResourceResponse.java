package com.example.brittanyjones.emeraldguide.model;


import android.graphics.Movie;

import java.util.List;

public class ResourceResponse {
    @SerializedName("results")
    private List<Resource> results;
    @SerializedName("total_results")
    private int totalResults;


    public List<Resource> getResults() {
        return results;
    }

    public void setResults(List<Resource> results) {
        this.results = results;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

}
