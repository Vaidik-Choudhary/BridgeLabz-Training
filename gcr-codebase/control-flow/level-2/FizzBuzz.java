// Creating FizzBuzz class to find if the number is divisible by 3 or 5
import java.util.Scanner;

class FizzBuzz {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking user input
        System.out.print("Enter your number : ");
        int number = sc.nextInt();

        // checking wether the number is natural or not
        if (number <= 0) {
            System.out.println("Please enter a natural number");
        } else {
              
              // Running for loop
              for (int i = 1; i <= number ;i++) {
                  if (i % 5 == 0 && i % 3 == 0) {
                      System.out.println("FizzBuzz");
                  } else if (i % 3 == 0) {
                        System.out.println("Fizz");
                  } else if (i % 5 == 0) {
                        System.out.println("Buzz");
                  } else {
                        System.out.println(i);
                  }
              }
         }
         sc.close();
    }
}