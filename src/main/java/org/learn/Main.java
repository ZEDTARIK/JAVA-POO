package org.learn;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.learn.model.AccountBank;
import org.learn.model.SavingAccount;

import java.util.*;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {

        AccountBank account1;
        account1 = new SavingAccount(15, "USD", 417);

        account1.setBalance(5120);
        account1.setCurrency("MAD");
        displayAccount(account1);

        System.out.println("********************* List ************************");

        List<AccountBank> accountBanks = new ArrayList<>();
        accountBanks.add(new SavingAccount(1500, "MAD", 52));
        accountBanks.add(new SavingAccount(2540, "USD", 417));
        accountBanks.add(new SavingAccount(8000, "EUR", 66));

        for (AccountBank c : accountBanks) displayAccount(c);

        System.out.println("*********************************************");

        System.out.println("********************* Map ************************");

        Map<String, AccountBank> accountBankMap = new HashMap<>();
        accountBankMap.put("compte1", new SavingAccount(150, "USD", 51));
        accountBankMap.put("compte2", new SavingAccount(500, "MAD", 61));
        accountBankMap.put("compte3", new SavingAccount(800, "EUR", 59));

        AccountBank cc = accountBankMap.get("compte2");
        System.out.println(toJson(cc));
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

    public  static  String toJson(Object obj) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
    }
}