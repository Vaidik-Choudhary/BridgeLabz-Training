// Creating DivisibleByFive class to find the number divisible by five
import java.util.Scanner;

class DivisibleByFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        // Taking user input
        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        // If number % 5 == 0,Number is divisible by 5
        if(number%5==0) {
            System.out.print("Is the number"+ number +"divisible by 5? Yes");
        } else {
              System.out.print("Is the number"+ number +"divisible by 5? No");
        }

        sc.close();
    }
}