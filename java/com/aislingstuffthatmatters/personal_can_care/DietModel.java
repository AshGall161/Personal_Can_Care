package com.aislingstuffthatmatters.personal_can_care;

public class DietModel {

    String diet;
    String dietLocation;
    String dietDescription;

    public DietModel(){

    }

    public DietModel(String diet, String dietLocation, String dietDescription) {
        this.diet = diet;
        this.dietLocation = dietLocation;
        this.dietDescription = dietDescription;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getDietLocation() {
        return dietLocation;
    }

    public void setDietLocation(String dietLocation) {
        this.dietLocation = dietLocation;
    }

    public String getDietDescription() {
        return dietDescription;
    }

    public void setDietDescription(String dietDescription) {
        this.dietDescription = dietDescription;
    }


}
