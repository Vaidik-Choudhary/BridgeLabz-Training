// Creating FindSimpleInterest class to compute the simple interest
import java.util.Scanner;

class FindSimpleInterest {

    public static double CalculateSimpleInterest(double principal, double rate, double time) {
        double simpleInterest = (principal*rate*time)/100;
  
        return simpleInterest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the Principal amount : ");
        double principal = sc.nextDouble();
        System.out.print("Enter the Interest Rate : ");
        double rate = sc.nextDouble();
        System.out.print("Enter the Time period : ");
        double time = sc.nextDouble();

       // Calling the method to get the Simple interest
       double simpleInterest = FindSimpleInterest.CalculateSimpleInterest(principal, rate, time);

        // Printing results
        System.out.println("The Simple Interest is " + simpleInterest + " for principal " + principal + " Rate of interest " + rate + " and Time " + time);


        sc.close();
    }
}       