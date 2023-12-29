package com.busaridwan.testpractice.dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void deposit() {
//        fail("Not implemented yet");
        BankAccount account = new BankAccount("Ridwan", "Busari", 1_000.00, BankAccount.CHECKING);
        double balance = account.deposit(200.00, true);
        assertEquals(1_200.00, balance, 0);
    }

    @Test
    void withdraw() {
//        fail("Not implemented yet");
        BankAccount account = new BankAccount("Ridwan", "Busari", 1_000.00, BankAccount.CHECKING);
        double balance = account.withdraw(200.00, true);
        assertEquals(800.00, balance, 0);
        assertEquals(800.00, account.getBalance(), 0);

    }

    @Test
    void getBalance() {
//        fail("Not implemented yet");
        BankAccount account = new BankAccount("Ridwan", "Busari", 1_000.00, BankAccount.CHECKING);
        account.deposit(200.00, true);
        assertEquals(1_200.00, account.getBalance(), 0);
    }

    @Test
    void isChecking() {
//        fail("Not implemented yet");
        BankAccount account = new BankAccount("Ridwan", "Busari", 1_000.00, BankAccount.CHECKING);
        assertTrue(account.isChecking());
    }
    @Test
    void isSavings() {
//        fail("Not implemented yet");
        BankAccount account = new BankAccount("Ridwan", "Busari", 1_000.00, BankAccount.SAVINGS);
        assertFalse(account.isChecking());
    }
    @Test
    void dummyTest(){
        double actual = 19.00 + 2.00;
        double expected = 21.00;
        assertEquals(expected, actual);
    }
}