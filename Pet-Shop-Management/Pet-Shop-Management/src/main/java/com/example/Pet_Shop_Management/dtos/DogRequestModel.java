package com.example.Pet_Shop_Management.dtos;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DogRequestModel {
    private String dogName;
    private String dogBreed;
    private Integer dogAge;
    private Long dogPrice;

    public DogRequestModel() {
    }

    public DogRequestModel(String dogName, String dogBreed, Integer dogAge, Long dogPrice) {
        this.dogName = dogName;
        this.dogBreed = dogBreed;
        this.dogAge = dogAge;
        this.dogPrice = dogPrice;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public Integer getDogAge() {
        return dogAge;
    }

    public void setDogAge(Integer dogAge) {
        this.dogAge = dogAge;
    }

    public Long getDogPrice() {
        return dogPrice;
    }

    public void setDogPrice(Long dogPrice) {
        this.dogPrice = dogPrice;
    }

    @Override
    public String toString() {
        return "DogRequestModel{" +
                "dogName='" + dogName + '\'' +
                ", dogBreed='" + dogBreed + '\'' +
                ", dogAge=" + dogAge +
                ", dogPrice=" + dogPrice +
                '}';
    }
}
