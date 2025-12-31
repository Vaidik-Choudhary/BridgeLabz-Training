/*19. Bus Route Distance Tracker 🚌
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation.*/

import java.util.Scanner;

public class BusRouteDistanceTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalDistance = 0;

        while (true) {

            System.out.print("Enter distance of next stop (km): ");
            int distance = sc.nextInt();
            totalDistance += distance;

            System.out.println("Total distance covered: " + totalDistance + " km");

            System.out.print("Do you want to get off? (yes/no): ");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Journey ended");
        System.out.println("Final distance: " + totalDistance + " km");

        sc.close();
    }
}
