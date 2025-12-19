//Creating DayOfWeek class to purpose is to prints the day of the week that the date falls on.
//import java.util.Scanner;

public class DayOfWeek {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);

	//Creating a int vairable name with month, day and year.
	int month, day, year;

	//With the help of command line arguments.
	month = Integer.parseInt(args[0]);
	day = Integer.parseInt(args[1]);
	year = Integer.parseInt(args[2]);

	//Using formula to find the day of the week it falls on.
	int years = year - ( 14 - month ) / 12;      			
	int x = years + ( years / 4 ) - ( years / 100 ) + ( years / 400 );
	int months = month + 12 * ( ( 14 - month ) / 12 ) - 2;
	int days = ( day + x + 31 * months / 12 ) % 7;

	//Printing Result
	System.out.println("The day of the week is: " + dayZ);

	sc.close();
    }
}