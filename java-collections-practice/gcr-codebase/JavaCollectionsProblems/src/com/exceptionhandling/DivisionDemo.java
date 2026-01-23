package com.exceptionhandling;

import java.util.*;

public class DivisionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            int a = sc.nextInt();

            System.out.print("Enter the second number: ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Result: " + result);

        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } 
        catch (InputMismatchException e) {
            System.out.println("Please enter numeric values ");
        }
        sc.close();
    }
}
