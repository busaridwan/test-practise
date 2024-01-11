package com.busaridwan.testpractice.solid.liskovsubstitution;

public class LoanClosureService {
    private LoanPayment loanPayment;

    public LoanClosureService(LoanPayment loanPayment) {
        this.loanPayment = loanPayment;
    }

    public void foreCloseLoan(){
        loanPayment.foreCloseLoan();
    }
}
