package com.example.Pet_Shop_Management.services;

import com.example.Pet_Shop_Management.dtos.CatRequestModel;
import com.example.Pet_Shop_Management.entities.CatEntity;
import com.example.Pet_Shop_Management.repositories.CatRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CatServiceImpl implements CatService{
    private final CatRepository catRepository;

    public CatServiceImpl(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    @Override
    public CatEntity addcat(CatRequestModel catRequestModel) {

        CatEntity catEntity = new CatEntity(catRequestModel.getCatName(),catRequestModel.getCatBreed(),catRequestModel.getCatAge(),catRequestModel.getCatPrice());
        CatEntity savedCatEntity=catRepository.save(catEntity);
        return savedCatEntity;
    }

    @Override
    public void removeCatById(Long id) {
        catRepository.deleteById(id);
    }

    @Override
    public List<CatEntity> findCatByName(String catName) {
        return (List<CatEntity>) catRepository.findByName(catName);
    }

    @Override
    public CatEntity editCatById(Long catId, CatRequestModel catRequestModel) {
        return catRepository.findById(catId).map(existingCat -> {
            existingCat.setCatName(catRequestModel.getCatName());
            existingCat.setCatBreed(catRequestModel.getCatBreed());
            existingCat.setCatAge(catRequestModel.getCatAge());
            existingCat.setCatPrice(catRequestModel.getCatPrice());
            return catRepository.save(existingCat);
        }).orElse(null);

    }


}

