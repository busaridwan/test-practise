package com.busaridwan.testpractice.solid.liskovsubstitution;

import java.math.BigDecimal;

public class HomeLoan implements LoanPayment{
    @Override
    public void doPayment(BigDecimal amount) {

    }

    @Override
    public void foreCloseLoan() {

    }

    @Override
    public void doRepayment(BigDecimal amount) {

    }
}
