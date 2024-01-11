package com.busaridwan.testpractice.solid.liskovsubstitution.bad;

import java.math.BigDecimal;

public class HomeLoan implements SecureLoan {
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
