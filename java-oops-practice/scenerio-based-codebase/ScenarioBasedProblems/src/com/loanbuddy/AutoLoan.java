package com.loanbuddy;

public class AutoLoan extends LoanApplication {

    public AutoLoan(Applicant applicant, int term) {
        super(applicant, "Auto Loan", term, 10.0);
    }

    @Override
    public boolean approveLoan() {

        if (basicEligibilityCheck() && applicant.getCreditScore() >= 650) {
            setApproved(true);
        } else {
            setApproved(false);
        }
        return isApproved();
    }

    @Override
    public double calculateEMI() {
        return emiFormula(1.1); 
    }
}

