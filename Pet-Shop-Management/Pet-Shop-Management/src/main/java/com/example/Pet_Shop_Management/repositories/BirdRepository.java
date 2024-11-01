package com.example.Pet_Shop_Management.repositories;

import com.example.Pet_Shop_Management.entities.BirdEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BirdRepository extends JpaRepository<BirdEntity,Long> {
    List<BirdEntity> findByName(String birdName);
}
