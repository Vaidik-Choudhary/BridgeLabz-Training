//Creating AbundantNumber class to check whether a number is Abundant number or not
import java.util.Scanner;

class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking user input
        System.out.print("Enter your Number : ");
        int number = sc.nextInt();
        int sum = 0;

        //Running for loop
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        //Checking Abundant number condition
        if (sum > number) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not an Abundant Number");
        }

        sc.close();
    }
}
