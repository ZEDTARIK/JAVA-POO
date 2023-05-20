package org.learn.services;

import org.learn.model.AccountBank;

import java.util.List;

public interface AccountBankService {
    AccountBank addAccountBank(AccountBank account);
    List<AccountBank> getAllAccountBank();
    AccountBank getAccountBankById(String id);
    void addRandomData(int size);
    void credit(String accountId, double amount);
    void debit(String accountId, double amount);
    void  transferSold(String accountSource, String accountDestination, double amount);
}
