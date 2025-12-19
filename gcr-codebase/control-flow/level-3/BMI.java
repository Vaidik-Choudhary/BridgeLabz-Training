//creating BMI class BMI to determine the weight status of the person
import java.util.Scanner;

class BMI{
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	//Taking user input
	System.out.print("Enter the weight : ");
	double weight  = sc.nextDouble();
	System.out.print("Enter the height : ");
	double height= sc.nextDouble();
		
	//BMI calculation
	double 	bmiFormula = weight / (height * height / 10000);

	//printing the status depending on the bmi value
	if ( bmiFormula > 40.0) {
	    System.out.println("Obese");
	} else if ( bmiFormula > 25.0 && bmiFormula < 40.0) {
	      System.out.println("Overweight");
	} else if ( bmiFormula > 18.5 && bmiFormula < 25) {
	      System.out.println("Normal");
	} else if ( bmiFormula <= 18.4) {
	      System.out.println("Underweight");
        }
	sc.close();
    }
}

              