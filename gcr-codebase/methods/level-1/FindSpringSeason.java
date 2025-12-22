import java.util.Scanner;

class FindSpringSeason {
 
    // Method to find if the day falls in Spring season
    public static void calculateSpringSeason(int month,int day) {
       if (month ==3) {
	    if (day >= 20)
	        System.out.println("Its a Spring Season");
	     else 
	          System.out.println("Its not a Spring Season");
	 } else if(month == 4 || month == 5)
	       System.out.println("Its a Spring Season");
	 else if (month ==6){
	     if ( day <=20) {
	         System.out.println("Its a Spring Season"); 
	 } else {
	       System.out.println("Its not a Spring Season"); 
	 } }else {
               System.out.println("Its not a Spring Season");
         }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter month ");
	    int month = sc.nextInt();
	    System.out.print("Enter day ");
	    int day= sc.nextInt();


           // Calling the method
           FindSpringSeason.calculateSpringSeason(month,day);

        sc.close();
    }
}   