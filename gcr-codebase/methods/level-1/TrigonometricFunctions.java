import java.util.Scanner;

class TrigonometricFunctions {

    // Method to calculate sine cosine and tangent
    public static double[] calculateTrigonometricFunctions(double angle) {
        double[] result = new double[3];
        double radians = Math.toRadians(angle);

        result[0] = Math.sin(radians);
        result[1] = Math.cos(radians);
        result[2] = Math.tan(radians);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double angle = sc.nextDouble();

        double[] values = calculateTrigonometricFunctions(angle);

        // Printing Results
        System.out.println("Sine = " + values[0]);
        System.out.println("Cosine = " + values[1]);
        System.out.println("Tangent = " + values[2]);

        sc.close();
    }
}
