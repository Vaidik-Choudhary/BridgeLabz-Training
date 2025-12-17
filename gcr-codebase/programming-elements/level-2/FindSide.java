//create  FindSide class to find the size of the side of a square
import java.util.Scanner;
class FindSide{
    public static void main(String [] args){
        Scanner sc  = new Scanner(System.in);
    
        //creating variable and taking input
        double perimeter = sc.nextDouble();

        //finding size of the square
        double size = perimeter/4;

        //Printing the result
        System.out.println("The length of the side is"+ perimeter + " whose perimeter is " + size);  
 

sc.close();
    }
}