package com.example.Pet_Shop_Management.controllers;

import com.example.Pet_Shop_Management.dtos.DogRequestModel;
import com.example.Pet_Shop_Management.entities.DogEntity;
import com.example.Pet_Shop_Management.services.DogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/dog-section")

public class DogController {


    private final DogService dogService;

    public DogController(DogService dogService) {
        this.dogService = dogService;
    }


    @GetMapping("/dogs")
    public String greetDog() {
        return "Welcome to dog section";
    }


    @PostMapping("/add-dog")
    public DogEntity addDog(@RequestBody DogRequestModel dogRequestModel) {
        return dogService.addDog(dogRequestModel);
    }

    @DeleteMapping("/remove-dog/{dogId}")
    public void removeDogById(@PathVariable("dogId") Long dogId) {
        dogService.removeDogById(dogId);
    }

    @GetMapping("/find-dog")
    public List<DogEntity> findDogByName(@RequestParam("dogName") String dogName) {
        return dogService.findDogByName(dogName);
    }

    @PutMapping("/edit-dog/{dogId}")
    public DogEntity editDogById(@PathVariable("dogId") Long dogId, @RequestBody DogRequestModel dogRequestModel) {
        return dogService.editDogById(dogId, dogRequestModel);
    }
}
