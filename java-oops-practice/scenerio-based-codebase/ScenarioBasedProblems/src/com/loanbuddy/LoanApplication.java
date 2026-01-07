package com.loanbuddy;

public abstract class LoanApplication implements IApprovable {

    protected Applicant applicant;
    protected String loanType;
    protected int term;      
    protected double interestRate;

    private boolean approved;  

    public LoanApplication(Applicant applicant, String loanType, int term, double interestRate) {
        this.applicant = applicant;
        this.loanType = loanType;
        this.term = term;
        this.interestRate = interestRate;
    }

    protected void setApproved(boolean status) {
        this.approved = status;
    }

    public boolean isApproved() {
        return approved;
    }

    protected boolean basicEligibilityCheck() {
        return applicant.getCreditScore() >= 700 && applicant.getIncome() * 12 >= applicant.getLoanAmount();
    }

    protected double emiFormula(double rateMultiplier) {

        double P = applicant.getLoanAmount();
        double R = (interestRate * rateMultiplier) / (12 * 100);
        int N = term;

        return (P * R * Math.pow(1 + R, N)) /
               (Math.pow(1 + R, N) - 1);
    }
}
