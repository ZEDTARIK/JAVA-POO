package org.learn.model;

import java.util.UUID;

public class AccountBank {

    private String accountId;
    private double balance;

    private  ListStatus status;
    private String currency;

    public AccountBank() {
        this.accountId = UUID.randomUUID().toString();
        status = ListStatus.CREATED;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public ListStatus getStatus() {
        return status;
    }

    public void setStatus(ListStatus status) {
        this.status = status;
    }
}
