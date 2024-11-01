package com.example.Pet_Shop_Management.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name="customers")
@Data
@Builder
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String customerName;
    private String purchaseType;
    private LocalDate purchaseDate;
    private Long customerContact;

    public CustomerEntity() {
    }

    public CustomerEntity(String customerName, String purchaseType, LocalDate purchaseDate, Long customerContact) {
        this.customerName = customerName;
        this.purchaseType = purchaseType;
        this.purchaseDate = purchaseDate;
        this.customerContact = customerContact;
    }

    public CustomerEntity(Long customerId, String customerName, String purchaseType, LocalDate purchaseDate, Long customerContact) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.purchaseType = purchaseType;
        this.purchaseDate = purchaseDate;
        this.customerContact = customerContact;
    }

    public Long getCustomerId() {
        return customerId;
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
        return "CustomerEntity{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", purchaseType='" + purchaseType + '\'' +
                ", purchaseDate=" + purchaseDate +
                ", customerContact=" + customerContact +
                '}';
    }
}
