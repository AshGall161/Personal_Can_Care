package com.aislingstuffthatmatters.personal_can_care;

public class AccessoryModel {

    String accessoryName;
    String accessoryLocation;

    public AccessoryModel(){

    }

    public AccessoryModel(String accessoryName, String accessoryLocation){
        this.accessoryName = accessoryName;
        this.accessoryLocation = accessoryLocation;

    }

    public String getAccessoryName() {
        return accessoryName;
    }

    public void setAccessoryName(String accessoryName){
        this.accessoryName = accessoryName;
    }

    public String getAccessoryLocation() {
        return accessoryLocation;
    }

    public void setAccessoryLocation() {
        this.accessoryLocation = accessoryLocation;
    }

}
