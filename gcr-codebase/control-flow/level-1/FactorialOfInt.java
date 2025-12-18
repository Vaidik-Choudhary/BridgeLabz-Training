// Creating FactorialOfInt class to find the factorial of the integer
import java.util.Scanner;

class FactorialOfInt {
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
        
              // Running while loop
              while (number >= 1) {
                  factorial *= number;
                  number--;
              }

              // Printing Result
              System.out.println(factorial);
        }

        sc.close();
    }
}