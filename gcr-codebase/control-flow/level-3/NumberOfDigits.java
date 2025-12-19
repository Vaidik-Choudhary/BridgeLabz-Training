//Creating NumberOfDigits class to count the number of digits in a number
import java.util.Scanner;

class NumberOfDigits{
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	//creating a variable and taking user's input
	System.out.print("Enter a number: ");
	int number = sc.nextInt();
	int originalNumber = number;
	
	//checking the total digit of the number
	int digitCount = 0;
	while(originalNumber!=0){
	    digitCount++;
	    originalNumber/=10;
	}

        // Printing results
        System.out.println( "The number of digits in " + number + " are " + digitCount);

        sc.close();
    }
}