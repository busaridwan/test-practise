package com.busaridwan.testpractice.solid.liskovsubstitution.bad;

public interface SecureLoan extends LoanPayment {
    void foreCloseLoan();
}
