package com.eazybytes.customer.entity;

import jakarta.persistence.*;

@Entity
public class Customer extends BaseEntity {

    @Id
    @Column(name = "customer_id", length = 100)
    private String customerId;
    @Column(name = "name", length = 100, nullable = false)
    private String name;
    @Column(name = "email", length = 100, nullable = false)
    private String email;
    @Column(name = "mobile_number", length = 20, nullable = false)
    private String mobileNumber;
    @Column(name = "active_sw", nullable = false)
    private boolean activeSw = false;

    public Customer(){

    }

    public Customer(String customerId, String name, String email, String mobileNumber, boolean activeSw) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.activeSw = activeSw;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public boolean isActiveSw() {
        return activeSw;
    }

    public void setActiveSw(boolean activeSw) {
        this.activeSw = activeSw;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", activeSw=" + activeSw +
                '}';
    }
}
