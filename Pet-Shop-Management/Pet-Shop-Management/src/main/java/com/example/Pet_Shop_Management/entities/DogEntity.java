package com.example.Pet_Shop_Management.entities;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name="dogs")
@Data
@Builder
public class DogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dogId;
    private String dogName;
    private String dogBreed;
    private Integer dogAge;
    private Long dogPrice;

    public DogEntity() {
    }

    public DogEntity(String dogName, String dogBreed, Integer dogAge, Long dogPrice) {
        this.dogName = dogName;
        this.dogBreed = dogBreed;
        this.dogAge = dogAge;
        this.dogPrice = dogPrice;
    }

    public DogEntity(Long dogId, String dogName, String dogBreed, Integer dogAge, Long dogPrice) {
        this.dogId = dogId;
        this.dogName = dogName;
        this.dogBreed = dogBreed;
        this.dogAge = dogAge;
        this.dogPrice = dogPrice;
    }

    public Long getDogId() {
        return dogId;
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
        return "DogEntity{" +
                "dogId=" + dogId +
                ", dogName='" + dogName + '\'' +
                ", dogBreed='" + dogBreed + '\'' +
                ", dogAge=" + dogAge +
                ", dogPrice=" + dogPrice +
                '}';
    }
}

