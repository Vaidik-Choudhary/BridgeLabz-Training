//Creating BMIStatus class to calculate BMI and weight status of persons
import java.util.Scanner;

class BMIStatus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //taking user input for number of persons
        System.out.print("Enter number of persons : ");
        int n = sc.nextInt();

        //Creating arrays
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        //taking user input for weight and height
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight of person " + (i + 1) + " : ");
            weight[i] = sc.nextDouble();

            System.out.print("Enter height of person " + (i + 1) + " (in meters) : ");
            height[i] = sc.nextDouble();
        }

        //calculating bmi and weight status
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        //displaying result
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Height : " + height[i]);
            System.out.println("Weight : " + weight[i]);
            System.out.println("BMI : " + bmi[i]);
            System.out.println("Status : " + status[i]);
            System.out.println();
        }

        sc.close();
    }
}
