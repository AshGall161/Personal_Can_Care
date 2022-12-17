package com.aislingstuffthatmatters.personal_can_care;

public class NecessarySvcsModel {

    String necessarySvcsName;
    String necessarySvcsLocation;
    String necessarySvcsDescription;

    public NecessarySvcsModel() {

    }

    public NecessarySvcsModel(String necessarySvcsName, String necessarySvcsLocation, String necessarySvcsDescription) {
        this.necessarySvcsName = necessarySvcsName;
        this.necessarySvcsLocation = necessarySvcsLocation;
        this.necessarySvcsDescription = necessarySvcsDescription;
    }

    public String getNecessarySvcsName() {
        return necessarySvcsName;
    }

    public void setNecessarySvcsName(String necessarySvcsName) {
        this.necessarySvcsName = necessarySvcsName;
    }

    public String getNecessarySvcsLocation() {
        return necessarySvcsLocation;
    }

    public void setNecessarySvcsLocation(String necessarySvcsLocation) {
        this.necessarySvcsLocation = necessarySvcsLocation;
    }

    public String getNecessarySvcsDescription() {
        return necessarySvcsDescription;
    }

    public void setNecessarySvcsDescription(String necessarySvcsDescription) {
        this.necessarySvcsDescription = necessarySvcsDescription;
    }

}