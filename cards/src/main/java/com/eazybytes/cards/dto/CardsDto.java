package com.eazybytes.cards.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

public class CardsDto {

    private Long cardNumber;

    @NotEmpty(message = "Mobile Number can not be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile Number must be 10 digits")
    private String mobileNumber;

    @NotEmpty(message = "CardType can not be a null or empty")
    private String cardType;

    @Positive(message = "Total card limit should be greater than zero")
    private int totalLimit;

    @PositiveOrZero(message = "Total amount used should be equal or greater than zero")
    private int amountUsed;

    @PositiveOrZero(message = "Total available amount should be equal or greater than zero")
    private int availableAmount;

    private boolean activeSw;

    public Long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public int getTotalLimit() {
        return totalLimit;
    }

    public void setTotalLimit(int totalLimit) {
        this.totalLimit = totalLimit;
    }

    public int getAmountUsed() {
        return amountUsed;
    }

    public void setAmountUsed(int amountUsed) {
        this.amountUsed = amountUsed;
    }

    public int getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(int availableAmount) {
        this.availableAmount = availableAmount;
    }

    public boolean isActiveSw() {
        return activeSw;
    }

    public void setActiveSw(boolean activeSw) {
        this.activeSw = activeSw;
    }
}
