package com.example.Pet_Shop_Management.controllers;

import com.example.Pet_Shop_Management.dtos.CustomerRequestModel;
import com.example.Pet_Shop_Management.entities.CustomerEntity;
import com.example.Pet_Shop_Management.services.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer-section")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @GetMapping("/customers")
    public String greetCustomer() {
        return "Welcome to customer section";
    }

    @PostMapping("/add-customer")
    public CustomerEntity addCustomer(@RequestBody CustomerRequestModel customerRequestModel) {
        return customerService.addCustomer(customerRequestModel);
    }

    @DeleteMapping("/remove-customer/{customerId}")
    public void removeCustomerById(@PathVariable("customerId") Long customerId) {
        customerService.removeCustomerById(customerId);
    }

    @GetMapping("/find-customer")
    public List<CustomerEntity> findCustomerByName(@RequestParam("customerName") String customerName) {
        return customerService.findCustomerByName(customerName);
    }

    @PutMapping("/edit-customer/{customerId}")
    public CustomerEntity editCustomerById(@PathVariable("customerId") Long customerId, @RequestBody CustomerRequestModel customerRequestModel) {
        return customerService.editCustomerById(customerId, customerRequestModel);
    }
}
