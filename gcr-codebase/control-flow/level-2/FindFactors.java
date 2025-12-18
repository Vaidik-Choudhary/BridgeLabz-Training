// Creating FindFactors class to find the factors of a number
import java.util.Scanner;

class FindFactors {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking user input
        System.out.print("Enter your number : ");
        int number = sc.nextInt();

        // checking wether the number is positive integer or not
        if (number < 0) {
            System.out.println("Please enter a positive number");
        } else {

                // Running for loop
                for (int i = 1; i <= number ;i++) {
                    if (number % i == 0) {
                        System.out.println(i);
                    }
                 }
        }
        sc.close();
    }
}
              