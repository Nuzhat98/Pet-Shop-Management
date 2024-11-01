package com.example.Pet_Shop_Management.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name="cats")
@Data
@Builder
public class CatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long catId;
    private String catName;
    private String catBreed;
    private Integer catAge;
    private Long catPrice;

    public CatEntity() {
    }

    public CatEntity(String catName, String catBreed, Integer catAge, Long catPrice) {
        this.catName = catName;
        this.catBreed = catBreed;
        this.catAge = catAge;
        this.catPrice = catPrice;
    }

    public CatEntity(Long catId, String catName, String catBreed, Integer catAge, Long catPrice) {
        this.catId = catId;
        this.catName = catName;
        this.catBreed = catBreed;
        this.catAge = catAge;
        this.catPrice = catPrice;
    }

    public Long getCatId() {
        return catId;
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
        return "CatEntity{" +
                "catId=" + catId +
                ", catName='" + catName + '\'' +
                ", catBreed='" + catBreed + '\'' +
                ", catAge=" + catAge +
                ", catPrice=" + catPrice +
                '}';
    }
}
