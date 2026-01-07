package com.loanbuddy;

public class HomeLoan extends LoanApplication {

    public HomeLoan(Applicant applicant, int term) {
        super(applicant, "Home Loan", term, 8.5);
    }

    @Override
    public boolean approveLoan() {

        if (basicEligibilityCheck() &&
            applicant.getCreditScore() >= 700) {
            setApproved(true);
        } else {
            setApproved(false);
        }
        return isApproved();
    }

    @Override
    public double calculateEMI() {
        return emiFormula(1.0);
    }
}

