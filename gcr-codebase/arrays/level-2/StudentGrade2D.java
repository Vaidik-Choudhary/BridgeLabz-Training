//Creating StudentGrade2D class to calculate percentage and grade using 2D array
import java.util.Scanner;

public class StudentGrade2D {
    public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);

	//Taking input for number of students
	System.out.print("Enter number of students : ");
	int number = sc.nextInt();

	//2D array to store marks (Physics, Chemistry, Maths)
	int[][] marks = new int[number][3];

	//Arrays to store percentage and grade
	double[] percentage = new double[number];
	char[] grade = new char[number];

	//Taking input for marks
	for(int i = 0; i < number; i++)
	{
	System.out.println("Enter marks for Student " + (i + 1));

	System.out.print("Physics : ");
	marks[i][0] = sc.nextInt();

	System.out.print("Chemistry : ");
	marks[i][1] = sc.nextInt();

	System.out.print("Maths : ");
	marks[i][2] = sc.nextInt();

	//Checking for invalid (negative) marks
		if(marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0)
		{
		    System.out.println("Invalid marks. Enter positive values.");
		    i--;
		}
	}

	//Calculating percentage and grade
	    for(int i = 0; i < number; i++)
		{
		int total = marks[i][0] + marks[i][1] + marks[i][2];
		percentage[i] = total / 3.0;

		if(percentage[i] >= 80)
		    grade[i] = 'A';
		else if(percentage[i] >= 70)
		    grade[i] = 'B';
		else if(percentage[i] >= 60)
		    grade[i] = 'C';
		else if(percentage[i] >= 50)
		    grade[i] = 'D';
		else if(percentage[i] >= 40)
		    grade[i] = 'E';
		else
		    grade[i] = 'R';
		}

		//Displaying result
		for(int i = 0; i < number; i++)
		{
		    System.out.println("\nStudent " + (i + 1));
		    System.out.println("Physics : " + marks[i][0]);
		    System.out.println("Chemistry : " + marks[i][1]);
		    System.out.println("Maths : " + marks[i][2]);
		    System.out.println("Percentage : " + percentage[i]);
		    System.out.println("Grade : " + grade[i]);
		}

		sc.close();
	}
}
