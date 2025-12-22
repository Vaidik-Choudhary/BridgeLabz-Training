import java.util.Scanner;

class UnitConvertorMetric {

    //Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    //Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    //Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    //Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double km = sc.nextDouble();
        System.out.println(convertKmToMiles(km));
        double miles = sc.nextDouble();
        System.out.println(convertMilesToKm(miles));
        double meters = sc.nextDouble();
        System.out.println(convertMetersToFeet(meters));
        double feet = sc.nextDouble();
        System.out.println(convertFeetToMeters(feet));

        sc.close();
    }
}
