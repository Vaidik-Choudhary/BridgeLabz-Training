/* 18. Currency Exchange Kiosk 💱
Design a currency converter:
● Take INR amount and target currency.
● Use a switch to apply the correct rate.
● Ask if the user wants another conversion (do-while).*/

import java.util.Scanner;

public class CurrencyExchangeKiosk {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter amount in INR: ");
            double inr = sc.nextDouble();

            System.out.println("Choose currency:");
            System.out.println("1. USD");
            System.out.println("2. EUR");
            System.out.println("3. JPY");

            int option = sc.nextInt();
            double result = 0;

            switch (option) {
                case 1:
                    result = inr * 0.012;
                    System.out.println("Amount in USD: " + result);
                    break;

                case 2:
                    result = inr * 0.011;
                    System.out.println("Amount in EUR: " + result);
                    break;

                case 3:
                    result = inr * 1.80;
                    System.out.println("Amount in JPY: " + result);
                    break;

                default:
                    System.out.println("Invalid currency option");
            }

            System.out.print("Do you want another conversion? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Thank you for using Currency Kiosk");
        sc.close();
    }
}
