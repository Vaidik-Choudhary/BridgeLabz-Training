// Creating GreatestFactorOfNumberWhile class to find the Greatest factors of a number
import java.util.Scanner;

class GreatestFactorOfNumberWhile {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking user input
        System.out.print("Enter your number : ");
        int number = sc.nextInt();
        int greatestFactor = 1;

        // checking wether the number is positive integer or not
        if (number < 0) {
            System.out.println("Please enter a positive number");
        } else {

                // Running while loop
                int i = number-1;
                while ( i >= 1 ) {
                    if (number % i == 0) {
                        greatestFactor = i;
                        System.out.println(greatestFactor);
                        break;
                    }
                        i--;
                 }
        }
        sc.close();
    }
}