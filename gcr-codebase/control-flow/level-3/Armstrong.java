//Creating Armstrong class to check whether a number is Armstrong or not
import java.util.Scanner;

class Armstrong{
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	//creating a variable and taking user's input
	System.out.print("Enter a number: ");
	int number = sc.nextInt();
	int sum = 0;
	int originalNumber = number;
	

	//checking the total digit of the number
	int digitCount = 0;
	while(originalNumber!=0){
	    digitCount++;
	    originalNumber/=10;
	}
	originalNumber = number;
	
	// running while loop
	while (originalNumber != 0){
	    int reminder = originalNumber % 10;
	    sum  += (Math.pow(reminder, digitCount));
	    originalNumber/=10;
	}
	
	//printing result 
	if ( sum == number )
	    System.out.println( "Is Armstrong Number ");
	else 
	    System.out.println(" Not Armstrong");
	
	
	sc.close();
    }
}