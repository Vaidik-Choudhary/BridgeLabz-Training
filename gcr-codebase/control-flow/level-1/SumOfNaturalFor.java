//creating a class SumOfNaturalFor to find the sum of first natural numbers
import java.util.Scanner;

class  SumOfNaturalFor{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	//creating variables and taking user input
	System.out.print("Enter the number :");
	int number = sc.nextInt();
	int duplicateNumber = number;
	int sumFor= 0;
	int sumFormula = 0;
	
	//Running for loop
	for ( int i = number ; i > 0; i--){
	    sumFor =  sumFor + i;
	}
		
	//calculating sum using formula
	sumFormula = (duplicateNumber *(duplicateNumber + 1))/2;

	//Printing results
	System.out.println("The sum using for loop " + sumFor);
	System.out.println("The sum using Formula " + sumFormula);

	sc.close();

    }
}