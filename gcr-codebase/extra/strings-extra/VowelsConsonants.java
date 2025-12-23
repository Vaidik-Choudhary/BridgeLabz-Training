import java.util.Scanner;

public class VowelsConsonants {

    public static int findVowelsConsonants (String input) {
        int countVowel = 0;
        input = input.toLowerCase();
        for (int i = 0; i < input.length();i++ ) {
            if (input.charAt(i) == 'a'|| input.charAt(i) == 'e'|| input.charAt(i) == 'i'|| input.charAt(i) == 'o'|| input.charAt(i) == 'u') countVowel++;
        }
        return countVowel;     
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        String input = sc.next();
        
        int vowel = findVowelsConsonants(input);

        System.out.println("The number of vowels = " + vowel + " and the number of Consonants = " + (input.length()-vowel) );

        sc.close();
    }
}