import java.util.Scanner;
class CompareString {
	
    // checking if the strings are same or not
    public static Boolean CheckingString (String s1, String s2) {
	Boolean isSameUsingCharAt = true;
	
	if ( s1.length() != s2.length()) {
	    isSameUsingCharAt = false;
	}
	else {
	    for ( int i = 0 ; i < s1.length() ; i++) {
 		if ( s1.charAt(i) != s2.charAt(i) ) {
		    isSameUsingCharAt = false;
		    break;
		}
		
	    } 
	}
        return isSameUsingCharAt;
    }

	
    public static void main (){
	Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a String ");
	    String input1 = sc.next();
	    System.out.print("Enter another String ");
	    String input2 = sc.next();

	    Boolean isSameUsingCharAt = CheckingString ( input1 , input2);
	    System.out.println(" Using Manual way :" + isSameUsingCharAt);
	    System.out.println(" Using in-build methods :" + input1.equals(input2));
	    System.out.println("Same String ->" + (isSameUsingCharAt == input1.equals(input2)));
	
	
	
	sc.close();
    }
}