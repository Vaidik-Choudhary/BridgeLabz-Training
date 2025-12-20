//creating BMICalculationUsing2DArray class to calculate the bmi of people
import java.util.Scanner;

class BMICalculationUsing2DArray{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
	
	//System.out.print("Enter the no of people :");
        int number = sc.nextInt();
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

	//taking user input
        for(int index = 0; index < number; index++){
            personData[index][0] = sc.nextDouble(); 
            personData[index][1] = sc.nextDouble(); 

            personData[index][2] =
                personData[index][0] / (personData[index][1] * personData[index][1] / 10000);

            if(personData[index][2] < 18.5)
                weightStatus[index] = "Underweight";
            else if(personData[index][2] < 25)
                weightStatus[index] = "Normal";
            else if(personData[index][2] < 40)
                weightStatus[index] = "Overweight";
            else
                weightStatus[index] = "Obese";
        }
	
	//printing results
        for(int index = 0; index < number; index++){
            System.out.println(personData[index][1] + " " +
                               personData[index][0] + " " +
                               personData[index][2] + " " +
                               weightStatus[index]);
        }

        sc.close();
    }
}