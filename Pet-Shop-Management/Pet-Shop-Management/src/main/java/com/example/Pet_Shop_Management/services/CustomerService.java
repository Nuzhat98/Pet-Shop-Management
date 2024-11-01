package com.example.Pet_Shop_Management.services;

import com.example.Pet_Shop_Management.dtos.CustomerRequestModel;
import com.example.Pet_Shop_Management.entities.CustomerEntity;

import java.util.List;

public interface CustomerService {
    CustomerEntity addCustomer(CustomerRequestModel customerRequestModel);

    void removeCustomerById(Long customerId);

    List<CustomerEntity> findCustomerByName(String customerName);

    CustomerEntity editCustomerById(Long customerId, CustomerRequestModel customerRequestModel);
}
