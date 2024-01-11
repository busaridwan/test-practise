package com.busaridwan.testpractice.solid.liskovsubstitution.bad;

public class LoanClosureService {
    private SecureLoan secureLoan;

    public LoanClosureService(SecureLoan secureLoan) {
        this.secureLoan = secureLoan;
    }
    public void foreCloseLoan(){
        secureLoan.foreCloseLoan();
    }
}
