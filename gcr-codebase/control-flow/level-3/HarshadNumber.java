//Creating HarshadNumber class to check whether a number is Harshad number or not
import java.util.Scanner;

class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking user input
        System.out.print("Enter your Number : ");
        int number = sc.nextInt();
        int originalNumber = number;
        int sum = 0;

        //Running while loop to calculate sum of digits
        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }

        //Checking Harshad number condition
        if (originalNumber % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }

        sc.close();
    }
}
