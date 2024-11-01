package com.example.Pet_Shop_Management.controllers;


import com.example.Pet_Shop_Management.dtos.CatRequestModel;
import com.example.Pet_Shop_Management.entities.CatEntity;
import com.example.Pet_Shop_Management.services.CatService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cat-section")

public class CatController {



    private final CatService catService;

    public CatController( CatService catService) {
        this.catService = catService;
    }


    @GetMapping("/cats")
    public String greetCat(){
        return "Welcome to cat section";
    }


    @PostMapping("/add-cat")
    public CatEntity addCat(@RequestBody CatRequestModel catRequestModel){
        return catService.addcat(catRequestModel);
    }

    @DeleteMapping("/remove-cat/{catId}")
    public void removeCatById(@PathVariable("catId") Long catId){
        catService.removeCatById(catId);
    }

    @GetMapping("/find-cat")
    public List<CatEntity> findCatByName(@RequestParam("catName") String catName){
        return catService.findCatByName(catName);
    }

    @PutMapping("/edit-cat/{catId}")
    public CatEntity editCatById(@PathVariable("catId") Long catId, @RequestBody CatRequestModel catRequestModel){
        return catService.editCatById(catId,catRequestModel);
    }
}



