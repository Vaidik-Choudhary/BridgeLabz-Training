// creating FeetToYardsMiles class to convert distance
import java.util.Scanner;

class FeetToYardsMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for distance in feet
        double distanceInFeet = sc.nextDouble();

        // Converting feet to yards (1 yard = 3 feet)
        double distanceInYards = distanceInFeet / 3;

        // Converting yards to miles (1 mile = 1760 yards)
        double distanceInMiles = distanceInYards / 1760;

        // Printing the result
        System.out.println("The distance in yards is " + distanceInYards + " and in miles is " + distanceInMiles);

sc.close();
    }
}