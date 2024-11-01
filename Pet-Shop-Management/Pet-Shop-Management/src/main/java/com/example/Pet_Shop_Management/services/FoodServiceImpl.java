package com.example.Pet_Shop_Management.services;

import com.example.Pet_Shop_Management.dtos.FoodRequestModel;
import com.example.Pet_Shop_Management.entities.FoodEntity;
import com.example.Pet_Shop_Management.repositories.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {
    private final FoodRepository foodRepository;

    public FoodServiceImpl(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    @Override
    public FoodEntity addFood(FoodRequestModel foodRequestModel) {
        FoodEntity foodEntity = new FoodEntity(
                foodRequestModel.getFoodName(),
                foodRequestModel.getFoodType(),
                foodRequestModel.getFoodBrand(),
                foodRequestModel.getFoodPrice(),
                foodRequestModel.getFoodAvailability()
        );
        return foodRepository.save(foodEntity);
    }

    @Override
    public void removeFoodById(Long id) {
        foodRepository.deleteById(id);
    }

    @Override
    public List<FoodEntity> findFoodByName(String foodName) {
        return foodRepository.findByName(foodName);
    }

    @Override
    public FoodEntity editFoodById(Long foodId, FoodRequestModel foodRequestModel) {
        return foodRepository.findById(foodId).map(existingFood -> {
            existingFood.setFoodName(foodRequestModel.getFoodName());
            existingFood.setFoodType(foodRequestModel.getFoodType());
            existingFood.setFoodBrand(foodRequestModel.getFoodBrand());
            existingFood.setFoodPrice(foodRequestModel.getFoodPrice());
            existingFood.setFoodAvailability(foodRequestModel.getFoodAvailability());
            return foodRepository.save(existingFood);
        }).orElse(null);
    }
}
