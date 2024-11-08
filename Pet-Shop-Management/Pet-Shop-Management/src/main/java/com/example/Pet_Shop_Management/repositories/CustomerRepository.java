package com.example.Pet_Shop_Management.repositories;

import com.example.Pet_Shop_Management.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
    List<CustomerEntity> findByCustomerName(String customerName);
}
