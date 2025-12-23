import java.util.Scanner;

class BasicCalculator {

    // Method for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public static double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        int choice = sc.nextInt();

        if (choice == 1) System.out.println(add(a, b));
        else if (choice == 2) System.out.println(subtract(a, b));
        else if (choice == 3) System.out.println(multiply(a, b));
        else if (choice == 4) System.out.println(divide(a, b));


        sc.close();
    }
}
