package com.example.Pet_Shop_Management.services;

import com.example.Pet_Shop_Management.dtos.FoodRequestModel;
import com.example.Pet_Shop_Management.entities.FoodEntity;

import java.util.List;

public interface FoodService {
    FoodEntity addFood(FoodRequestModel foodRequestModel);

    void removeFoodById(Long foodId);

    List<FoodEntity> findFoodByName(String foodName);

    FoodEntity editFoodById(Long foodId, FoodRequestModel foodRequestModel);
}
