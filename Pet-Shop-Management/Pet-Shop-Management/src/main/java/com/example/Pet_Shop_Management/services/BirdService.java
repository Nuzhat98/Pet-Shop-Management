package com.example.Pet_Shop_Management.services;

import com.example.Pet_Shop_Management.dtos.BirdRequestModel;
import com.example.Pet_Shop_Management.entities.BirdEntity;

import java.util.List;

public interface BirdService {
    BirdEntity addBird(BirdRequestModel birdRequestModel);

    void removeBirdById(Long birdId);

    List<BirdEntity> findBirdByName(String birdName);

    BirdEntity editBirdById(Long birdId, BirdRequestModel birdRequestModel);
}
