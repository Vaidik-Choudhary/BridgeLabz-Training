/* 11. Temperature Logger 
Record temperatures over 7 days.
Use an array and a for-loop.
Find the average and max temperature.
Use if for comparisons. Maintain readable naming and modular code blocks.
import java.util.Scanner; */

class TemperatureLogger {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double [] week = new double[7];
        double sum = 0;
        double highest = 0;

        for (int i = 0; i < week.length; i++ ) {
            System.out.print("Enter Temperature of day " + (i+1) + " (in degree Celsius) : ");
            week[i] = sc.nextDouble();
            System.out.println("----------------------------------------------------");
            sum = sum + week[i];
            if (highest <= week[i]) highest = week[i];   
        }
        for (int i = 0; i < week.length; i++ ) {
            System.out.println("\n\nTemperature on day " + (i+1) +" was : " + week[i]);
            System.out.println("----------------------------------------------------");
        }
        System.out.println("\nThe Average Temperature was : " + (sum/7.0));
        System.out.println("The Highest Temperature was : " + highest);
        System.out.println("====================================================");
       sc.close();
    }
}
        