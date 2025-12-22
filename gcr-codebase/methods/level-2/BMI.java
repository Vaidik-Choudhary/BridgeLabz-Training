import java.util.Scanner;

class BMI {

    //Method to calculate BMI for each person and store it in 3rd column
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeter = data[i][1] / 100;
            data[i][2] = weight / (heightInMeter * heightInMeter);
        }
    }

    //Method to determine BMI status of each person and return status array
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][3];

        //Taking user input
        for (int i = 0; i < data.length; i++) {
            System.out.println("Enter details for Person " + (i + 1));
            System.out.print("Enter weight in kg: ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height in cm: ");
            data[i][1] = sc.nextDouble();
        }

        calculateBMI(data);

        String[] status = determineBMIStatus(data);

        //Displaying result
        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t\t%s\n",
                    data[i][1], data[i][0], data[i][2], status[i]);
        }

        sc.close();
    }
}
