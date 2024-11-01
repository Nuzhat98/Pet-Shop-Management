package com.example.Pet_Shop_Management.repositories;

import com.example.Pet_Shop_Management.entities.FoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface FoodRepository extends JpaRepository<FoodEntity, Long> {
    List<FoodEntity> findByName(String foodName);
}
