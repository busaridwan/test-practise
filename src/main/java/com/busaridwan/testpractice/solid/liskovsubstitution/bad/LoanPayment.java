package com.busaridwan.testpractice.solid.liskovsubstitution.bad;

import java.math.BigDecimal;

public interface LoanPayment {
    void doPayment(BigDecimal amount);
    void doRepayment(BigDecimal amount);

}
