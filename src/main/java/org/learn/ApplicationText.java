package org.learn;

import org.learn.model.AccountBank;
import org.learn.model.SavingAccount;
import org.learn.services.AccountBankService;
import org.learn.services.AccountBankServiceImp;

import java.util.ArrayList;
import java.util.List;

public class ApplicationText {
    public static void main(String[] args) {

        AccountBankService accountBankService = new AccountBankServiceImp();

        accountBankService.addAccountBank(new SavingAccount(1000, "MAD", 10));
        accountBankService.addAccountBank(new SavingAccount(2000, "USD", 20));
        accountBankService.addAccountBank(new SavingAccount(3000, "MAD", 30));

        List<AccountBank> allAccountBank = accountBankService.getAllAccountBank();

        for (int i = 0; i < allAccountBank.size(); i++) {

            System.out.println(allAccountBank.get(i).toString());
        }

        // or using this for

        System.out.println("\n");
        for (AccountBank account: allAccountBank) {
        System.out.println(account);
        }

    }
}
