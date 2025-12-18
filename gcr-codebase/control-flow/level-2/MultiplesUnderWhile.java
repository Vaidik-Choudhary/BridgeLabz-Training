// Creating MultiplesUnderWhile class to find the multiples of a number under 100 
import java.util.Scanner;

class MultiplesUnderWhile {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking user input
        System.out.print("Enter your number : ");
        int number = sc.nextInt();

        // checking wether the number is positive integer or not
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive under hundred number");
        } else {

                // Running While loop
                int i = 100; 
                while (i >= 1) {
                    if (i % number == 0) {
                        System.out.println(i);
                    }
                       i--;
                 }
        }
        sc.close();
    }
}