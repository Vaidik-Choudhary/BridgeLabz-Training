//Creating PrimeNumber class to find if the given number is prime or not
import java.util.Scanner;

class PrimeNumber {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking user input
        System.out.print("Enter your Number : ");
        int number = sc.nextInt();
        Boolean isPrime = true;

       // Running for loop
       for (int i=2; i<number-1 ; i++) {
           if (number % i == 0) {
               isPrime = false;
               break;
           }
       }
       
       //Printing Results
       if(isPrime) {
           System.out.println("Is a prime number");
       } else {
             System.out.println("Is not a prime number");
       }

       sc.close();
    }
}
