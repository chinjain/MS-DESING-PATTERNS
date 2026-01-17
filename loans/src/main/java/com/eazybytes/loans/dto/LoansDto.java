package com.eazybytes.loans.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;


public class LoansDto {

    private Long loanNumber;

    @NotEmpty(message = "Mobile Number can not be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile Number must be 10 digits")
    private String mobileNumber;

    @NotEmpty(message = "LoanType can not be a null or empty")
    private String loanType;

    @Positive(message = "Total loan amount should be greater than zero")
    private int totalLoan;

    @PositiveOrZero(message = "Total loan amount paid should be equal or greater than zero")
    private int amountPaid;

    @PositiveOrZero(message = "Total outstanding amount should be equal or greater than zero")
    private int outstandingAmount;

    private boolean activeSw;

    public LoansDto() {
    }

    public LoansDto(Long loanNumber, String mobileNumber, String loanType, int totalLoan, int amountPaid, int outstandingAmount, boolean activeSw) {
        this.loanNumber = loanNumber;
        this.mobileNumber = mobileNumber;
        this.loanType = loanType;
        this.totalLoan = totalLoan;
        this.amountPaid = amountPaid;
        this.outstandingAmount = outstandingAmount;
        this.activeSw = activeSw;
    }

    public Long getLoanNumber() {
        return loanNumber;
    }

    public void setLoanNumber(Long loanNumber) {
        this.loanNumber = loanNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public int getTotalLoan() {
        return totalLoan;
    }

    public void setTotalLoan(int totalLoan) {
        this.totalLoan = totalLoan;
    }

    public int getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(int amountPaid) {
        this.amountPaid = amountPaid;
    }

    public int getOutstandingAmount() {
        return outstandingAmount;
    }

    public void setOutstandingAmount(int outstandingAmount) {
        this.outstandingAmount = outstandingAmount;
    }

    public boolean isActiveSw() {
        return activeSw;
    }

    public void setActiveSw(boolean activeSw) {
        this.activeSw = activeSw;
    }
}
