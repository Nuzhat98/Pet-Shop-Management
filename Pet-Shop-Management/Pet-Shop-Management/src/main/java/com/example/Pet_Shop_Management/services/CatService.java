package com.example.Pet_Shop_Management.services;


import com.example.Pet_Shop_Management.dtos.CatRequestModel;
import com.example.Pet_Shop_Management.entities.CatEntity;

import java.util.List;

public interface CatService {

    CatEntity addcat(CatRequestModel catRequestModel);


    void removeCatById(Long id);


    List<CatEntity> findCatByName(String catName);

    CatEntity editCatById(Long catId, CatRequestModel catRequestModel);
}

