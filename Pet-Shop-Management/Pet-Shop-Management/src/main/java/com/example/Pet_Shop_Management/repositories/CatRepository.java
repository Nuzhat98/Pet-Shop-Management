package com.example.Pet_Shop_Management.repositories;

import com.example.Pet_Shop_Management.entities.CatEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CatRepository extends JpaRepository<CatEntity, Long> {
    List<CatEntity> findByCatName(String catName);
}
