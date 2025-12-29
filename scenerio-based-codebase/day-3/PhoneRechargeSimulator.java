/* 10. Phone Recharge Simulator Take the user's mobile operator and amount. 
    Use a switch to display offers. 
    Loop to allow repeated recharges. 
    Show balance after each recharge */

import java.util.Scanner;

public class PhoneRechargeSimulator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double jioBalance = 0;
        double airtelBalance = 0;
        double viBalance = 0;

        boolean jioUsed = false;
        boolean airtelUsed = false;
        boolean viUsed = false;

        int choice;

        System.out.println("==== PHONE RECHARGE SYSTEM ====");

        while (true) {

            System.out.println("\n1. Jio");
            System.out.println("2. Airtel");
            System.out.println("3. VI");
            System.out.println("0. Exit");
            System.out.print("Choose Operator: ");

            choice = sc.nextInt();

            if (choice == 0) {
                break;
            }

            System.out.print("Enter recharge amount: ");
            double amount = sc.nextDouble();

            switch (choice) {

                case 1:
                    jioBalance = jioBalance + amount;
                    jioUsed = true;
                    System.out.println("Jio Offer: Extra 1GB Data");
                    System.out.println("Jio Balance : " + jioBalance);
                    break;

                case 2:
                    airtelBalance = airtelBalance + amount;
                    airtelUsed = true;
                    System.out.println("Airtel Offer: Unlimited Calls");
                    System.out.println("Airtel Balance : " + airtelBalance);
                    break;

                case 3:
                    viBalance = viBalance + amount;
                    viUsed = true;
                    System.out.println("VI Offer: Night Data Free");
                    System.out.println("VI Balance : " + viBalance);
                    break;

                default:
                    System.out.println("Invalid Operator");
            }
        }

        System.out.println("-------------------------------");
        System.out.println("Final Balance");

        if (jioUsed) {
            System.out.println("Jio    : " + jioBalance);
        }
        if (airtelUsed) {
            System.out.println("Airtel : " + airtelBalance);
        }
        if (viUsed) {
            System.out.println("VI     : " + viBalance);
        }

        System.out.println("-------------------------------");
        System.out.println("Thank you for using Recharge System");

        sc.close();
    }
}

