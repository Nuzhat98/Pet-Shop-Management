package com.example.Pet_Shop_Management.services;

import com.example.Pet_Shop_Management.dtos.DogRequestModel;
import com.example.Pet_Shop_Management.entities.DogEntity;

import java.util.List;

public interface DogService {
    DogEntity addDog(DogRequestModel dogRequestModel);

    void removeDogById(Long dogId);

    List<DogEntity> findDogByName(String dogName);

    DogEntity editDogById(Long dogId, DogRequestModel dogRequestModel);
}
