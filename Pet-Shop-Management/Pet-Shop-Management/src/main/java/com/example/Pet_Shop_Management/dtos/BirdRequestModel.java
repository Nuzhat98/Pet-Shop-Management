package com.example.Pet_Shop_Management.dtos;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BirdRequestModel {
    private String birdName;
    private String birdSpecies;
    private Integer birdAge;
    private Long birdPrice;

    public BirdRequestModel() {
    }

    public BirdRequestModel(String birdName, String birdSpecies, Integer birdAge, Long birdPrice) {
        this.birdName = birdName;
        this.birdSpecies = birdSpecies;
        this.birdAge = birdAge;
        this.birdPrice = birdPrice;
    }

    public String getBirdName() {
        return birdName;
    }

    public void setBirdName(String birdName) {
        this.birdName = birdName;
    }

    public String getBirdSpecies() {
        return birdSpecies;
    }

    public void setBirdSpecies(String birdSpecies) {
        this.birdSpecies = birdSpecies;
    }

    public Integer getBirdAge() {
        return birdAge;
    }

    public void setBirdAge(Integer birdAge) {
        this.birdAge = birdAge;
    }

    public Long getBirdPrice() {
        return birdPrice;
    }

    public void setBirdPrice(Long birdPrice) {
        this.birdPrice = birdPrice;
    }

    @Override
    public String toString() {
        return "BirdRequestModel{" +
                "birdName='" + birdName + '\'' +
                ", birdSpecies='" + birdSpecies + '\'' +
                ", birdAge=" + birdAge +
                ", birdPrice=" + birdPrice +
                '}';
    }
}
