package com.busaridwan.testpractice.dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void deposit() {
//        fail("Not implemented yet");
        BankAccount account = new BankAccount("Ridwan", "Busari", 1_000.00);
        double balance = account.deposit(200.00, true);
        assertEquals(1_200.00, balance);
    }

    @Test
    void withdraw() {
        fail("Not implemented yet");
    }

    @Test
    void getBalance() {
        fail("Not implemented yet");
    }
    @Test
    void dummyTest(){
        assertEquals(20, 21);
    }
}