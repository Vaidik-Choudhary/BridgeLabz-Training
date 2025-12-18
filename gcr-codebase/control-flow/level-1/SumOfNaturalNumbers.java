// Creating SumOfNaturalNumbers class to check if the number is a natural number and finding the sum of natural numbers
import java.util.Scanner;

class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        // Checking if the number is a natural number
        if (number > 0) {
            System.out.println("The sum of"+ number + "natural numbers is " + (number * (number + 1)/2));
        } else { 
              System.out.print("The number" + number + "is not a natural number");
        }

        sc.close();
    }
}
