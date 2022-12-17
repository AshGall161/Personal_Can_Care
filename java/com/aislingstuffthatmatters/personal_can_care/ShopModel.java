package com.aislingstuffthatmatters.personal_can_care;

public class ShopModel {

    String shopName;
    String shopLocation;
    String shopDescription;

    public ShopModel(){

    }

    public ShopModel(String shopName, String shopLocation, String shopDescription){
        this.shopName = shopName;
        this.shopLocation = shopLocation;
        this.shopDescription = shopDescription;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopLocation() {
        return shopLocation;
    }

    public void setShopLocation(String shopLocation) {
        this.shopLocation = shopLocation;
    }

    public String getShopDescription() {
        return shopDescription;
    }

    public void setShopDescription(String shopDescription) {
        this.shopDescription = shopDescription;
    }

}
