package com.busaridwan.testpractice.solid.singleresponsibility;

import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class AccountOperations {
    Map<String, Account> accountMap = new TreeMap<>();
    public Account addAccount(Account account){
        accountMap.put(account.getAccountNumber(), account);
        return accountMap.get(account.getAccountNumber());
    }
    public Account getAccount(String accountNumber){
        return accountMap.getOrDefault(accountNumber, new Account());
    }
    public BigDecimal getBalance(String accountNumber){
        return accountMap.getOrDefault(accountNumber, new Account()).getBalance();
    }
    public boolean isChecked(String accountNumber){
        return accountMap.getOrDefault(accountNumber, new Account()).isChecked();
    }
}
