package org.learn;

import org.learn.model.AccountBank;

public class Main {
    public static void main(String[] args) {

        AccountBank account1;
        account1 = new AccountBank();

        account1.setBalance(5120);
        account1.setCurrency("MAD");
        displayAccount(account1);
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