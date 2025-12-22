import java.util.Scanner;

class UnitConvertorYards {

    //Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    //Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    //Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    //Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    //Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double yards = sc.nextDouble();
        System.out.println(convertYardsToFeet(yards));
        double feet = sc.nextDouble();
        System.out.println(convertFeetToYards(feet));
        double meters = sc.nextDouble();
        System.out.println(convertMetersToInches(meters));
        double inches1 = sc.nextDouble();
        System.out.println(convertInchesToMeters(inches1));
        double inches2 = sc.nextDouble();
        System.out.println(convertInchesToCentimeters(inches2));

        sc.close();
    }
}
