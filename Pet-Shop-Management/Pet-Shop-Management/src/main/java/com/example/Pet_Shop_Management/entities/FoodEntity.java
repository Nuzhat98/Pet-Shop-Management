package com.example.Pet_Shop_Management.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name="foods")
@Data
@Builder
public class FoodEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long foodId;
    private String foodName;
    private String foodType;
    private String foodBrand;
    private Long foodPrice;
    private Boolean foodAvailability;

    public FoodEntity() {
    }

    public FoodEntity(String foodName, String foodType, String foodBrand, Long foodPrice, Boolean foodAvailability) {
        this.foodName = foodName;
        this.foodType = foodType;
        this.foodBrand = foodBrand;
        this.foodPrice = foodPrice;
        this.foodAvailability = foodAvailability;
    }

    public FoodEntity(Long foodId, String foodName, String foodType, String foodBrand, Long foodPrice, Boolean foodAvailability) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodType = foodType;
        this.foodBrand = foodBrand;
        this.foodPrice = foodPrice;
        this.foodAvailability = foodAvailability;
    }

    public Long getFoodId() {
        return foodId;
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
        return "FoodEntity{" +
                "foodName='" + foodName + '\'' +
                ", foodType='" + foodType + '\'' +
                ", foodBrand='" + foodBrand + '\'' +
                ", foodPrice=" + foodPrice +
                ", foodAvailability=" + foodAvailability +
                '}';
    }
}
