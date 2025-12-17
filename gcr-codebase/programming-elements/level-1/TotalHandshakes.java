//creating TotalHandshakes class to compute the maximum number of handshakes
import java.util.Scanner;
class TotalHandshakes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

	//creating varible  and taking user value
	int numberOfStudents  = sc.nextInt();

	//calculating total handshakes
	int totalHandshakes = (numberOfStudents*(numberOfStudents-1))/2;

	//Printing total handshakes
	System.out.println("Total number of handshakes are " + totalHandshakes);


sc.close();
    }
}