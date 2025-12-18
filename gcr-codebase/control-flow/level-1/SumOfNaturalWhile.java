//creating SumOfNaturalWhile class to find the sum of first natural numbers
import java.util.Scanner;

class  SumOfNaturalWhile{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	//creating variables and taking user input
	System.out.print("Enter the number :");
	int number = sc.nextInt();
	int duplicateNumber = number;
	int sumWhile = 0;
	int sumFormula = 0;
	
	//Running while loop
	while (number!=0){
	    sumWhile+=number;
	    number--;
	}

	//calculating sum of using formula
	sumFormula = (duplicateNumber *(duplicateNumber + 1))/2;

	//Printing results
	System.out.println("The sum using while loop " + sumWhile);
	System.out.println("The sum using Formula " + sumFormula);

	sc.close();

    }
}