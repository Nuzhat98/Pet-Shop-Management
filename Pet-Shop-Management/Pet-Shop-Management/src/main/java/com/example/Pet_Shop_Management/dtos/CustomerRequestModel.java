package com.example.Pet_Shop_Management.dtos;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class CustomerRequestModel {
    private String customerName;
    private String purchaseType;
    private LocalDate purchaseDate;
    private Long customerContact;

    public CustomerRequestModel() {
    }

    public CustomerRequestModel(String customerName, String purchaseType, LocalDate purchaseDate, Long customerContact) {
        this.customerName = customerName;
        this.purchaseType = purchaseType;
        this.purchaseDate = purchaseDate;
        this.customerContact = customerContact;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Long getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact(Long customerContact) {
        this.customerContact = customerContact;
    }

    @Override
    public String toString() {
        return "CustomerRequestModel{" +
                "customerName='" + customerName + '\'' +
                ", purchaseType='" + purchaseType + '\'' +
                ", purchaseDate=" + purchaseDate +
                ", customerContact=" + customerContact +
                '}';
    }
}
