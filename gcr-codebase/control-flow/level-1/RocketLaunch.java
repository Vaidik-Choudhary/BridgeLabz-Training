// Creating RocketLaunch class to run a countdown
import java.util.Scanner;

class RocketLaunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking user input
        System.out.print("Enter countdown time");
	int counter = sc.nextInt();

        // Running while loop
        while(counter>=1){
	    System.out.println(counter--);    
	}
	
	sc.close();

    }
}