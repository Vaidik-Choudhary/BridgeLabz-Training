//Creating Calculator class to perform basic arithmetic operations using switch case
import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking user input
        System.out.print("Enter first number : ");
        double first = sc.nextDouble();
        System.out.print("Enter second number : ");
        double second = sc.nextDouble();
        System.out.print("Enter operator : ");
        String op = sc.next();

        //Using switch case to perform operation
        switch (op) {
            case "+":
                System.out.println("Result : " + (first + second));
                break;

            case "-":
                System.out.println("Result : " + (first - second));
                break;

            case "*":
                System.out.println("Result : " + (first * second));
                break;

            case "/":
                if (second != 0) {
                    System.out.println("Result : " + (first / second));
                } else {
                    System.out.println("Division by zero not allowed");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }

        sc.close();
    }
}
