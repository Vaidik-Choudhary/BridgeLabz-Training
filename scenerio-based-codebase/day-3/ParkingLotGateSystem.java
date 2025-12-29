/* 6. Parking Lot Gate System 
   Develop a smart parking system.
   Options: Park, Exit, Show Occupancy
   Use switch-case for the menu.
   while loop to continue until the parking lot is full or the user exits. */

import java.util.Scanner;

public class ParkingLotGateSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int capacity = 5; 
        int parked = 0;     
        int choice;

        while (true) {

            if (parked == capacity) {
                System.out.println("Parking Lot Full!");
                break;
            }

            System.out.println("Enter your choice: ");
            System.out.println("1. Park");
            System.out.println("2. Exit");
            System.out.println("3. Show Occupancy");
            System.out.println("0. Exit System");

            choice = sc.nextInt();

            switch (choice) {
                
                 case 0:
                    System.out.println("Exiting System");
                    sc.close();
                    return;

                case 1:
                    parked++;
                    System.out.println("Car Parked Successfully");
                    break;

                case 2:
                    if (parked > 0) {
                        parked--;
                        System.out.println("Car Exited Successfully");
                    } else {
                        System.out.println("No cars to exit");
                    }
                    break;

                case 3:
                    System.out.println("Empty Slots: " + (capacity - parked));
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }

        System.out.println("Thank you for visiting");
        sc.close();
    }
}
