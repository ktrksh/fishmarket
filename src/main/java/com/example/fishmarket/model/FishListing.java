package com.example.fishmarket.model;

public class FishListing {
    private String fishType;
    private String quantity;
    private String price;
    private String sellerName;
    private String description;

    // GetterとSetter（IDEで自動生成できます）

    public String getFishType() {
        return fishType;
    }

    public void setFishType(String fishType) {
        this.fishType = fishType;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "FishListing{" +
                "fishType='" + fishType + '\'' +
                ", quantity='" + quantity + '\'' +
                ", price='" + price + '\'' +
                ", sellerName='" + sellerName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}