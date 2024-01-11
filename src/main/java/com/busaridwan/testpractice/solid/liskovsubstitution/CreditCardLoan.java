package com.busaridwan.testpractice.solid.liskovsubstitution;

import java.math.BigDecimal;

public class CreditCardLoan implements LoanPayment{
    @Override
    public void doPayment(BigDecimal amount) {

    }

    @Override
    public void foreCloseLoan() {
        throw new UnsupportedOperationException("Fore Close Loan is not allowed");
    }

    @Override
    public void doRepayment(BigDecimal amount) {

    }
}
