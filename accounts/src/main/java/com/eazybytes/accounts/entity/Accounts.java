package com.eazybytes.accounts.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Accounts extends BaseEntity {

    @Id
    private Long accountNumber;
    private String accountType;
    private String branchAddress;
    private String mobileNumber;
    private boolean activeSw;

    public Accounts() {}

    public Accounts(Long accountNumber, String accountType, String branchAddress, String mobileNumber, boolean activeSw) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.branchAddress = branchAddress;
        this.mobileNumber = mobileNumber;
        this.activeSw = activeSw;
    }

    public Long getAccountNumber() { return accountNumber; }
    public void setAccountNumber(Long accountNumber) { this.accountNumber = accountNumber; }
    
    public String getAccountType() { return accountType; }
    public void setAccountType(String accountType) { this.accountType = accountType; }
    
    public String getBranchAddress() { return branchAddress; }
    public void setBranchAddress(String branchAddress) { this.branchAddress = branchAddress; }
    
    public String getMobileNumber() { return mobileNumber; }
    public void setMobileNumber(String mobileNumber) { this.mobileNumber = mobileNumber; }
    
    public boolean isActiveSw() { return activeSw; }
    public void setActiveSw(boolean activeSw) { this.activeSw = activeSw; }
}
