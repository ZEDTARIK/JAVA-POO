package org.learn;

import org.learn.model.AccountBank;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        AccountBank account1;
        account1 = new AccountBank();

        account1.setBalance(5120);
        account1.setCurrency("MAD");
        displayAccount(account1);

        System.out.println("********************* List ************************");

        List<AccountBank> accountBanks = new ArrayList<>();
        accountBanks.add(new AccountBank(1500, "MAD"));
        accountBanks.add(new AccountBank(2540, "USD"));
        accountBanks.add(new AccountBank(8000, "EUR"));

        for (AccountBank c : accountBanks) displayAccount(c);

        System.out.println("*********************************************");

    }

    public  static  void displayAccount(AccountBank account) {
        System.out.println("*********************************************");

        System.out.println("Account Id => " + account.getAccountId());
        System.out.println("Status Account => " + account.getStatus());
        System.out.println("Balance => " + account.getBalance());
        System.out.println("Currency => " + account.getCurrency());
        System.out.println("*********************************************");

    }
}