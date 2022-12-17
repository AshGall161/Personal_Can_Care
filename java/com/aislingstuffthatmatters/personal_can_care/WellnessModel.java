package com.aislingstuffthatmatters.personal_can_care;

public class WellnessModel {

    String what;
    String where;
    String description;

    public WellnessModel() {

    }

    public WellnessModel(String what, String where, String description) {
        this.what = what;
        this.where = where;
        this.description = description;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
