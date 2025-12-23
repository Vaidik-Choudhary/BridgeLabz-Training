import java.util.Scanner;

class TemperatureConverter {

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temp = sc.nextDouble();
        int choice = sc.nextInt();

        if (choice == 1)
            System.out.println(celsiusToFahrenheit(temp));
        else
            System.out.println(fahrenheitToCelsius(temp));  


        sc.close();
    }
}
