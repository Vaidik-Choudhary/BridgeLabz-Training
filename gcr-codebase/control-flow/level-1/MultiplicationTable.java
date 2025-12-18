// Creating MultiplicationTable class to find the Multiplication of the integer fron six to nine
import java.util.Scanner;

class MultiplicationTable {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking user input
        System.out.print("Enter your number : ");
        int number = sc.nextInt();

        // Running For loop
        for (int i = 6; i <=9 ;i++) {
            System.out.println(number + " * " + i + " = " + (number*i));
        }
 
        sc.close();
    }
}
