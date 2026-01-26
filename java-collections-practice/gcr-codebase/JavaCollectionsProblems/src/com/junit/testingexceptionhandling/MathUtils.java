package com.junit.testingexceptionhandling;

public class MathUtils {

    // Divides two integers
    public int divide(int a, int b) {

        // Explicit exception handling
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }

        return a / b;
    }
}

