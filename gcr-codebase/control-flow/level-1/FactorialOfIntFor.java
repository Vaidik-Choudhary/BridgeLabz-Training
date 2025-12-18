// Creating FactorialOfIntFor class to find the factorial of the integer 
import java.util.Scanner;

class FactorialOfIntFor {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking user input
        System.out.print("Enter your number : ");
        int number = sc.nextInt();
        int factorial = 1;

        // checking wether the number is natural or not
        if (number <= 0) {
            System.out.println("Please enter a natural number");
        } else {

              // Running for loop
              for (int i = 1; i<= number; i++) {
                  factorial *= i;
              }

              // Printing Result
              System.out.println(factorial);
        }

        sc.close();
    }
}