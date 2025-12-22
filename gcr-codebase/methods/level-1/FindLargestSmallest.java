import java.util.Scanner;

class FindLargestSmallest {
 
    // Method to find the largest and smallest number
    public static int[] calculateLargestSmallest(int number1,int number2,int number3 ) {
          int[] arr = new int[2];

          if (number1 > number2 && number1 > number3) {
              arr[0]=number1;
              if (number2 < number3) arr[1]=number2;
              else arr[1]=number3;
          } else if (number2 > number1 && number2 > number3) {
              arr[0]=number2;
              if (number1 < number3) arr[1]=number1;
              else arr[1]=number3;
          } else if (number3 > number1 && number3 > number2) {
              arr[0]=number3;
              if (number1 < number2) arr[1]=number1;
              else arr[1]=number2;
          }  
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int number1 = sc.nextInt();
	    int number2 = sc.nextInt();
            int number3 = sc.nextInt();

            int[] arr = new int[2];

           // Calling the method
           arr = FindLargestSmallest.calculateLargestSmallest(number1, number2, number3);

           System.out.println("The largest number is : " + arr[0] + " The smallest number is : " + arr[1]);

        sc.close();
    }
}   