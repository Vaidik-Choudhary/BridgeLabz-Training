// Creating PositiveZeroNegative Class to determine what the number is
import java.util.Scanner;

class PositiveZeroNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        // Checking if the number is positive, Negative or zero
        if(number > 0) {
            System.out.print("Positive");
        } else if (number < 0) {
              System.out.print("negative");
        } else {
              System.out.print("Zero");
        }

        sc.close();
    }
}