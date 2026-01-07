package com.loanbuddy;

import java.util.Scanner;

public class LoanBuddyApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter applicant name: ");
        String name = sc.nextLine();

        System.out.print("Enter credit score: ");
        int creditScore = sc.nextInt();

        System.out.print("Enter monthly income: ");
        double income = sc.nextDouble();

        System.out.print("Enter loan amount: ");
        double loanAmount = sc.nextDouble();

        Applicant applicant = new Applicant(name, creditScore, income, loanAmount);

        System.out.print("Choose loan type (1.Home 2.Auto 3.Personal): ");
        int choice = sc.nextInt();

        System.out.print("Enter loan term (months): ");
        int term = sc.nextInt();

        LoanApplication loan;

        if (choice == 1)
            loan = new HomeLoan(applicant, term);
        else if (choice == 2)
            loan = new AutoLoan(applicant, term);
        else
            loan = new PersonalLoan(applicant, term);

        if (loan.approveLoan()) {
            System.out.println("\nLoan Approved!");
            System.out.println("Monthly EMI: " + loan.calculateEMI());
        } else {
            System.out.println("\nLoan Rejected!");
        }

        sc.close();
    }
}

