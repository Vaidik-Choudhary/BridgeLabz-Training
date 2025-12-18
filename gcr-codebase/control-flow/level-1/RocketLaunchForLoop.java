// Creating RocketLaunch class to run a countdown
import java.util.Scanner;

class RocketLaunchForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking user input
        System.out.print("Enter countdown time");
	int counter = sc.nextInt();

        // Running while loop
        for(int i = counter; i>=1; i--){
	    System.out.println(i);    
	}
	
	sc.close();

    }
}