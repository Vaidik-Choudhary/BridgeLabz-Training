// creating BasicCalculator class to perform arithmetic operations
import java.util.Scanner;

class BasicCalculator {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Taking user input
    float number1 = sc.nextFloat();
    float number2 = sc.nextFloat();

    // Calculating values after calculation
    float addition = number1 + number2;
    float subtraction = number1 - number2;
    float multiplication = number1 * number2;
    float division = number1 / number2;

    // Printing the result
    System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division);


sc.close();
    }
}