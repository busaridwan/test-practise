package com.busaridwan.testpractice.solid.liskovsubstitution.bad;

import java.math.BigDecimal;

public class CreditCardLoan implements LoanPayment {
    @Override
    public void doPayment(BigDecimal amount) {

    }

    @Override
    public void doRepayment(BigDecimal amount) {

    }
}
