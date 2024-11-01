package com.example.Pet_Shop_Management.controllers;

import com.example.Pet_Shop_Management.dtos.BirdRequestModel;
import com.example.Pet_Shop_Management.entities.BirdEntity;
import com.example.Pet_Shop_Management.services.BirdService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bird-section")


public class BirdController {


    private final BirdService birdService;

    public BirdController( BirdService birdService) {
        this.birdService = birdService;
    }


    @GetMapping("/birds")
    public String greetBird(){
        return "Welcome to bird section";
    }


    @PostMapping("/add-bird")
    public BirdEntity addBird(@RequestBody BirdRequestModel birdRequestModel){
        return birdService.addBird(birdRequestModel);
    }

    @DeleteMapping("/remove-bird/{birdId}")
    public void removeBirdById(@PathVariable("birdId") Long birdId){
        birdService.removeBirdById(birdId);
    }

    @GetMapping("/find-bird")
    public List<BirdEntity> findBirdByName(@RequestParam("birdName") String birdName){
        return birdService.findBirdByName(birdName);
    }

    @PutMapping("/edit-bird/{birdId}")
    public BirdEntity editBirdById(@PathVariable("birdId") Long birdId, @RequestBody BirdRequestModel birdRequestModel){
        return birdService.editBirdById(birdId,birdRequestModel);
    }
}