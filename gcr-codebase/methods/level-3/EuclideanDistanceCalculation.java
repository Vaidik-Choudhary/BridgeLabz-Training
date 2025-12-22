import java.util.Scanner;

class EuclideanDistanceCalculation {

    // Method to find Euclidean distance between two points
    public static double findDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to find slope and y-intercept of a line
    public static double[] findSlopeInterception(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);  // slope
        double b = y1 - m * x1;             // y-intercept

        double[] result = {m, b};
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance = findDistance(x1, y1, x2, y2);

        double[] line = findSlopeInterception(x1, y1, x2, y2);

        System.out.println("Euclidean Distance: " + distance);
        System.out.println("Equation of Line: y = " + line[0] + "x + " + line[1]);

        sc.close();
    }
}
