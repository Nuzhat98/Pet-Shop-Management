package com.example.Pet_Shop_Management.dtos;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CatRequestModel {
    private String catName;
    private String catBreed;
    private Integer catAge;
    private Long catPrice;

    public CatRequestModel() {
    }

    public CatRequestModel(String catName, String catBreed, Integer catAge, Long catPrice) {
        this.catName = catName;
        this.catBreed = catBreed;
        this.catAge = catAge;
        this.catPrice = catPrice;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatBreed() {
        return catBreed;
    }

    public void setCatBreed(String catBreed) {
        this.catBreed = catBreed;
    }

    public Integer getCatAge() {
        return catAge;
    }

    public void setCatAge(Integer catAge) {
        this.catAge = catAge;
    }

    public Long getCatPrice() {
        return catPrice;
    }

    public void setCatPrice(Long catPrice) {
        this.catPrice = catPrice;
    }

    @Override
    public String toString() {
        return "CatRequestModel{" +
                "catName='" + catName + '\'' +
                ", catBreed='" + catBreed + '\'' +
                ", catAge=" + catAge +
                ", catPrice=" + catPrice +
                '}';
    }
}
