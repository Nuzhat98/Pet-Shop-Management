package com.example.Pet_Shop_Management.services;

import com.example.Pet_Shop_Management.dtos.DogRequestModel;
import com.example.Pet_Shop_Management.entities.DogEntity;
import com.example.Pet_Shop_Management.repositories.DogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogServiceImpl implements DogService {
    private final DogRepository dogRepository;

    public DogServiceImpl(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    @Override
    public DogEntity addDog(DogRequestModel dogRequestModel) {
        DogEntity dogEntity = new DogEntity(
                dogRequestModel.getDogName(),
                dogRequestModel.getDogBreed(),
                dogRequestModel.getDogAge(),
                dogRequestModel.getDogPrice()
        );
        return dogRepository.save(dogEntity);
    }

    @Override
    public void removeDogById(Long id) {
        dogRepository.deleteById(id);
    }

    @Override
    public List<DogEntity> findDogByName(String dogName) {
        return dogRepository.findByDogName(dogName);
    }

    @Override
    public DogEntity editDogById(Long dogId, DogRequestModel dogRequestModel) {
        return dogRepository.findById(dogId).map(existingDog -> {
            existingDog.setDogName(dogRequestModel.getDogName());
            existingDog.setDogBreed(dogRequestModel.getDogBreed());
            existingDog.setDogAge(dogRequestModel.getDogAge());
            existingDog.setDogPrice(dogRequestModel.getDogPrice());
            return dogRepository.save(existingDog);
        }).orElse(null);
    }
}
