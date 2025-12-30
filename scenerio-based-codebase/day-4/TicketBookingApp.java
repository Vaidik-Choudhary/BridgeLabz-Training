/* 14. Movie Ticket Booking App 
  Ask users for movie type, seat type (gold/silver), and snacks.
  Use switch and if together.
  Loop through multiple customers.
  Clean structure and helpful variable names. */

import java.util.Scanner;

public class TicketBookingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int customerCount = 1;
        int choice;

        System.out.println("==== MOVIE TICKET BOOKING APP ====");

        while (true) {

            System.out.println("\nCustomer " + customerCount);

            System.out.println("1. Regular Movie");
            System.out.println("2. 3D Movie");
            System.out.println("0. Exit");
            System.out.print("Choose movie type: ");
            choice = sc.nextInt();

            if (choice == 0) {
                break;
            }

            int moviePrice = 0;

            switch (choice) {
                case 1 -> moviePrice = 150;
                case 2 -> moviePrice = 250;
                default -> {
                    System.out.println("Invalid movie type");
                    continue;
                }
            }

            System.out.print("Choose seat type (Gold/Silver): ");
            String seatType = sc.next();

            int seatPrice;

            if (seatType.equalsIgnoreCase("Gold")) {
                seatPrice = 300;
            } else {
                seatPrice = 200;
            }

            System.out.print("Add snacks? (Yes/No): ");
            String snacks = sc.next();

            int snackPrice = 0;
            if (snacks.equalsIgnoreCase("Yes")) {
                snackPrice = 100;
            }

            int totalBill = moviePrice + seatPrice + snackPrice;

            System.out.println("-------------------------------");
            System.out.println("Movie Price : " + moviePrice);
            System.out.println("Seat Price  : " + seatPrice);
            System.out.println("Snacks      : " + snackPrice);
            System.out.println("Total Bill  : " + totalBill);
            System.out.println("-------------------------------");

            customerCount++;
        }

        System.out.println("Thank you for booking");
        sc.close();
    }
}
