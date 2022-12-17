package com.aislingstuffthatmatters.personal_can_care;

public class AccessoryReading {

    private String accessoryName;
    private String accessoryLocation;

    public AccessoryReading() {

    }

    public AccessoryReading(String accessoryName, String accessoryLocation) {
        this.accessoryName = accessoryName;
        this.accessoryLocation = accessoryLocation;
    }

    public String getAccessoryName() {
        return accessoryName;
    }

    public void setAccessoryName(String accessoryName) {
        this.accessoryName = accessoryName;
    }

    public String getAccessoryLocation() {
        return accessoryLocation;
    }

    public void setAccessoryLocation(String accessoryLocation) {
        this.accessoryLocation = accessoryLocation;
    }

}
