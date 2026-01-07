package com.loanbuddy;

public class PersonalLoan extends LoanApplication {

    public PersonalLoan(Applicant applicant, int term) {
        super(applicant, "Personal Loan", term, 14.0);
    }

    @Override
    public boolean approveLoan() {

        if (basicEligibilityCheck() &&
            applicant.getCreditScore() >= 680) {
            setApproved(true);
        } else {
            setApproved(false);
        }
        return isApproved();
    }

    @Override
    public double calculateEMI() {
        return emiFormula(1.2);
    }
}

