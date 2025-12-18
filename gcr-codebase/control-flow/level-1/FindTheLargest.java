// Creating FindTheLargest class to find which element is the largest
import java.util.Scanner;

class FindTheLargest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the first number : ");
        int number1 = sc.nextInt();
        System.out.print("Enter the Second number : ");
        int number2 = sc.nextInt();
        System.out.print("Enter the Third number : ");
        int number3 = sc.nextInt();

        // Checking which number is the Largest
        if (number1>number2 && number1>number3) {
            System.out.println("Is the first number the largest? Yes");
            System.out.println("Is the second number the largest? No");
            System.out.println("Is the third number the largest? No");
        } else if (number2>number1 && number2>number3) {
              System.out.println("Is the first number the largest? No");
              System.out.println("Is the second number the largest? Yes");
              System.out.println("Is the third number the largest? No");
        } else {
              System.out.println("Is the first number the largest? No");
              System.out.println("Is the second number the largest? No");
              System.out.println("Is the third number the largest? Yes");
        }

        sc.close();
    }
}