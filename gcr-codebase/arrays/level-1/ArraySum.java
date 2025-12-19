//Creating ArraySum class to store values and find total
import java.util.Scanner;

class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        //Using infinite while loop
        while (true) {
            System.out.print("Enter a number : ");
            double value = sc.nextDouble();

            if (value <= 0 || index == 10) {
                break;
            }

            numbers[index] = value;
            index++;
        }

        //Calculating sum
        for (int i = 0; i < index; i++) {
            total = total + numbers[i];
        }

        //Printing result
        System.out.println("Sum of numbers : " + total);

        sc.close();
    }
}
