package org.learn.services;

import org.learn.model.AccountBank;

import java.util.ArrayList;
import java.util.List;

public class AccountBankServiceImp implements  AccountBankService{

    List<AccountBank> accountBankList = new ArrayList<>();
    @Override
    public AccountBank addAccountBank(AccountBank account) {
        accountBankList.add(account);
        return account;
    }

    @Override
    public List<AccountBank> getAllAccountBank() {
        return accountBankList;
    }

    @Override
    public AccountBank getAccountBankById(String id) {
        for(AccountBank account: accountBankList) {
            if(account.getAccountId().equals(id)) {
                return  account;
            }
        }
        throw  new RuntimeException("Account Not Found");
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
