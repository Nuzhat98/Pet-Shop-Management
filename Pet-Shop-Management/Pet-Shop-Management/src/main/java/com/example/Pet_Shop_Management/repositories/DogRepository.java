package com.example.Pet_Shop_Management.repositories;

import com.example.Pet_Shop_Management.entities.DogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DogRepository extends JpaRepository<DogEntity, Long> {
    List<DogEntity> findByName(String dogName);
}
