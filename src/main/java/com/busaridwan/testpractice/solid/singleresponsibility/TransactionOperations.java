package com.busaridwan.testpractice.solid.singleresponsibility;

import java.math.BigDecimal;

public class TransactionOperations {
    public BigDecimal deposit(String accountNumber, BigDecimal amount){
        AccountOperations accountOperations = new AccountOperations();
        Account account = accountOperations.getAccount(accountNumber);
        account.setBalance(account.getBalance().add(amount));
        accountOperations.addAccount(account);
        return account.getBalance();
    }
    public BigDecimal withdraw(String accountNumber, BigDecimal amount){
        AccountOperations accountOperations = new AccountOperations();
        Account account = accountOperations.getAccount(accountNumber);
        account.setBalance(account.getBalance().subtract(amount));
        accountOperations.addAccount(account);
        return account.getBalance();
    }
}
