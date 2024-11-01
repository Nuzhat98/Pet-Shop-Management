package com.example.Pet_Shop_Management.controllers;

import com.example.Pet_Shop_Management.dtos.FoodRequestModel;
import com.example.Pet_Shop_Management.entities.FoodEntity;
import com.example.Pet_Shop_Management.services.FoodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food-section")
public class FoodController {

    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping("/foods")
    public String greetFood() {
        return "Welcome to food section";
    }

    @PostMapping("/add-food")
    public FoodEntity addFood(@RequestBody FoodRequestModel foodRequestModel) {
        return foodService.addFood(foodRequestModel);
    }

    @DeleteMapping("/remove-food/{foodId}")
    public void removeFoodById(@PathVariable("foodId") Long foodId) {
        foodService.removeFoodById(foodId);
    }

    @GetMapping("/find-food")
    public List<FoodEntity> findFoodByName(@RequestParam("foodName") String foodName) {
        return foodService.findFoodByName(foodName);
    }

    @PutMapping("/edit-food/{foodId}")
    public FoodEntity editFoodById(@PathVariable("foodId") Long foodId, @RequestBody FoodRequestModel foodRequestModel) {
        return foodService.editFoodById(foodId, foodRequestModel);
    }
}
