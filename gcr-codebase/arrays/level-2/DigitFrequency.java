//Creating DigitFrequency class to find frequency of digits in a number
import java.util.Scanner;

public class DigitFrequency {
    public static void main(String args[]){
	Scanner sc = new Scanner(System.in);

	//Taking input for the number
	System.out.print("Enter a number : ");
	int number = sc.nextInt();

	int temp = number;
	int count = 0;

	//Finding number of digits
	while(temp != 0)
	{
		count++;
		temp = temp / 10;
	}

	//Array to store digits
	int[] digits = new int[count];
	int index = 0;

	//Storing digits in array
	while(number != 0)
	{
		digits[index] = number % 10;
		number = number / 10;
		index++;
	}

	//Frequency array for digits 0–9
	int[] frequency = new int[10];

	//Finding frequency of each digit
	for(int i = 0; i < digits.length; i++)
	{
		frequency[digits[i]]++;
	}

	//Displaying frequency
	System.out.println("Digit Frequency:");
	for(int i = 0; i < frequency.length; i++)
	{
		if(frequency[i] > 0)
		System.out.println("Digit " + i + " = " + frequency[i]);
	}

	sc.close();
	}
}
