package com.example.Pet_Shop_Management.services;

import com.example.Pet_Shop_Management.dtos.CustomerRequestModel;
import com.example.Pet_Shop_Management.entities.CustomerEntity;
import com.example.Pet_Shop_Management.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public CustomerEntity addCustomer(CustomerRequestModel customerRequestModel) {
        CustomerEntity customerEntity = new CustomerEntity(
                customerRequestModel.getCustomerName(),
                customerRequestModel.getPurchaseType(),
                customerRequestModel.getPurchaseDate(),
                customerRequestModel.getCustomerContact()
        );
        return customerRepository.save(customerEntity);
    }

    @Override
    public void removeCustomerById(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public List<CustomerEntity> findCustomerByName(String customerName) {
        return customerRepository.findByCustomerName(customerName);
    }

    @Override
    public CustomerEntity editCustomerById(Long customerId, CustomerRequestModel customerRequestModel) {
        return customerRepository.findById(customerId).map(existingCustomer -> {
            existingCustomer.setCustomerName(customerRequestModel.getCustomerName());
            existingCustomer.setPurchaseType(customerRequestModel.getPurchaseType());
            existingCustomer.setPurchaseDate(customerRequestModel.getPurchaseDate());
            existingCustomer.setCustomerContact(customerRequestModel.getCustomerContact());
            return customerRepository.save(existingCustomer);
        }).orElse(null);
    }
}
