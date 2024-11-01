package com.example.Pet_Shop_Management.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name="birds")
@Data
@Builder
public class BirdEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long birdId;
    private String birdName;
    private String birdSpecies;
    private Integer birdAge;
    private Long birdPrice;

    public BirdEntity() {
    }

    public BirdEntity(String birdName, String birdSpecies, Integer birdAge, Long birdPrice) {
        this.birdName = birdName;
        this.birdSpecies = birdSpecies;
        this.birdAge = birdAge;
        this.birdPrice = birdPrice;
    }

    public BirdEntity(Long birdId, String birdName, String birdSpecies, Integer birdAge, Long birdPrice) {
        this.birdId = birdId;
        this.birdName = birdName;
        this.birdSpecies = birdSpecies;
        this.birdAge = birdAge;
        this.birdPrice = birdPrice;
    }

    public Long getBirdId() {
        return birdId;
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
        return "BirdEntity{" +
                "birdId=" + birdId +
                ", birdName='" + birdName + '\'' +
                ", birdSpecies='" + birdSpecies + '\'' +
                ", birdAge=" + birdAge +
                ", birdPrice=" + birdPrice +
                '}';
    }
}
