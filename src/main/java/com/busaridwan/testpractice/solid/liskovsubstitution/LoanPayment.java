package com.busaridwan.testpractice.solid.liskovsubstitution;

import java.math.BigDecimal;

public interface LoanPayment {
    void doPayment(BigDecimal amount);
    void foreCloseLoan();
    void doRepayment(BigDecimal amount);

}
