package com.example.Pet_Shop_Management.services;

import com.example.Pet_Shop_Management.dtos.BirdRequestModel;
import com.example.Pet_Shop_Management.entities.BirdEntity;
import com.example.Pet_Shop_Management.repositories.BirdRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BirdServiceImpl implements BirdService{

    private final BirdRepository birdRepository;

    public BirdServiceImpl(BirdRepository birdRepository) {
        this.birdRepository = birdRepository;
    }


    @Override
    public BirdEntity addBird(BirdRequestModel birdRequestModel) {
        BirdEntity birdEntity = new BirdEntity(birdRequestModel.getBirdName(),birdRequestModel.getBirdSpecies(),birdRequestModel.getBirdAge(),birdRequestModel.getBirdPrice());
        BirdEntity savedBirdEntity=birdRepository.save(birdEntity);
        return savedBirdEntity;
    }

    @Override
    public void removeBirdById(Long birdId) {
        birdRepository.deleteById(birdId);
    }

    @Override
    public List<BirdEntity> findBirdByName(String birdName) {
        return (List<BirdEntity>) birdRepository.findByName(birdName);
    }

    @Override
    public BirdEntity editBirdById(Long birdId, BirdRequestModel birdRequestModel) {
        return birdRepository.findById(birdId).map(existingBird -> {
            existingBird.setBirdName(birdRequestModel.getBirdName());
            existingBird.setBirdSpecies(birdRequestModel.getBirdSpecies());
            existingBird.setBirdAge(birdRequestModel.getBirdAge());
            existingBird.setBirdPrice(birdRequestModel.getBirdPrice());
            return birdRepository.save(existingBird);
        }).orElse(null);
    }
}
