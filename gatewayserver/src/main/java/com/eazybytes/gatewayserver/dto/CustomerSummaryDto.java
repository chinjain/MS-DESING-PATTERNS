package com.eazybytes.gatewayserver.dto;

public class CustomerSummaryDto {

    private CustomerDto customer;
    private AccountsDto account;
    private LoansDto loan;
    private CardsDto card;

    public CustomerSummaryDto(CustomerDto customer, AccountsDto account, LoansDto loan, CardsDto card) {
        this.customer = customer;
        this.account = account;
        this.loan = loan;
        this.card = card;
    }

    public CustomerDto getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDto customer) {
        this.customer = customer;
    }

    public AccountsDto getAccount() {
        return account;
    }

    public void setAccount(AccountsDto account) {
        this.account = account;
    }

    public LoansDto getLoan() {
        return loan;
    }

    public void setLoan(LoansDto loan) {
        this.loan = loan;
    }

    public CardsDto getCard() {
        return card;
    }

    public void setCard(CardsDto card) {
        this.card = card;
    }
}
