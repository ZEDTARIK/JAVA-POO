package org.learn.services;

import org.learn.model.AccountBank;

import java.util.List;

public class AccountBankServiceImp implements  AccountBankService{
    @Override
    public AccountBank addAccountBank(AccountBank account) {
        return null;
    }

    @Override
    public List<AccountBank> getAllAccountBank() {
        return null;
    }

    @Override
    public AccountBank getAccountBankById(String id) {
        return null;
    }

    @Override
    public void addRandomData(int size) {

    }

    @Override
    public void credit(String accountId, double amount) {

    }

    @Override
    public void debit(String accountId, double amount) {

    }

    @Override
    public void transferSold(String accountSource, String accountDestination, double amount) {

    }
}
