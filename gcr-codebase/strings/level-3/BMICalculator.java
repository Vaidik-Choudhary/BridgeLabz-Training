import java.util.Scanner;

class BMICalculator {

    // Method to calculate BMI and status for a person and return as String array
    public static String[] calculateBMIAndStatus(double weightKg, double heightCm) {
        double heightMeter = heightCm / 100;
        double bmi = weightKg / (heightMeter * heightMeter);

        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[] {
            String.format("%.2f", bmi),
            status
        };
    }

    // Method to compute BMI details for all persons and return 2D String array
    public static String[][] computeBMIDetails(double[][] data) {
        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height = data[i][1];

            String[] bmiData = calculateBMIAndStatus(weight, height);

            result[i][0] = String.valueOf(height);
            result[i][1] = String.valueOf(weight);
            result[i][2] = bmiData[0];
            result[i][3] = bmiData[1];
        }
        return result;
    }

    // Method to display BMI details in tabular format
    public static void displayBMIReport(String[][] report) {
        System.out.println("Height(cm)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < report.length; i++) {
            System.out.println(
                report[i][0] + "\t\t" +
                report[i][1] + "\t\t" +
                report[i][2] + "\t\t" +
                report[i][3]
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] inputData = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            inputData[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            inputData[i][1] = sc.nextDouble();
        }

        String[][] bmiReport = computeBMIDetails(inputData);
        displayBMIReport(bmiReport);

        sc.close();
    }
}
