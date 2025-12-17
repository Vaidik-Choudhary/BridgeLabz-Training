// Creating KilometersToMiles class to convert kilometres to miles from user input
import java.util.Scanner;

class KilometersToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating variable 
        double km;

        // Taking input from user
        System.out.print("Enter distance in kilometers: ");
        km = sc.nextDouble();

        // Creating variable
        double miles = km / 1.6;

        // Printing miles and kilometres
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");


sc.close();
    }
}