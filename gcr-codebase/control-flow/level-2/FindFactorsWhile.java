// Creating FindFactorsWhile class to find the factors of a number
import java.util.Scanner;

class FindFactorsWhile {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking user input
        System.out.print("Enter your number : ");
        int number = sc.nextInt();

        // checking wether the number is positive integer or not
        if (number < 0) {
            System.out.println("Please enter a positive number");
        } else {

                // Running While loop
                int i = 1; 
                while (i <= number) {
                    if (number % i == 0) {
                        System.out.println(i);
                    }
                        i++;
                 }
        }
        sc.close();
    }
}