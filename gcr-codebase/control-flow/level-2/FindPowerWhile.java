// Creating FindPowerWhile class to find the power of a number
import java.util.Scanner;

class FindPowerWhile {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking user input creating variable
        System.out.print("Enter your number : ");
        int number = sc.nextInt();
        System.out.print("Enter the power : ");
        int power = sc.nextInt();
        int result = 1;

        // Running While loop
        int i = 1;
        while (i<=power) {
            result *= number;
            i++;
        }

        // Printing Result
        System.out.println(result);

        sc.close();
    }
}