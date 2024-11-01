package com.example.Pet_Shop_Management.dtos;


public class FoodRequestModel {
    private String foodName;
    private String foodType;
    private String foodBrand;
    private Long foodPrice;
    private Boolean foodAvailability;

    public FoodRequestModel() {
    }

    public FoodRequestModel(String foodName, String foodType, String foodBrand, Long foodPrice, Boolean foodAvailability) {
        this.foodName = foodName;
        this.foodType = foodType;
        this.foodBrand = foodBrand;
        this.foodPrice = foodPrice;
        this.foodAvailability = foodAvailability;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getFoodBrand() {
        return foodBrand;
    }

    public void setFoodBrand(String foodBrand) {
        this.foodBrand = foodBrand;
    }

    public Long getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(Long foodPrice) {
        this.foodPrice = foodPrice;
    }

    public Boolean getFoodAvailability() {
        return foodAvailability;
    }

    public void setFoodAvailability(Boolean foodAvailability) {
        this.foodAvailability = foodAvailability;
    }

    @Override
    public String toString() {
        return "FoodRequestModel{" +
                "foodName='" + foodName + '\'' +
                ", foodType='" + foodType + '\'' +
                ", foodBrand='" + foodBrand + '\'' +
                ", foodPrice=" + foodPrice +
                ", foodAvailability=" + foodAvailability +
                '}';
    }
}
