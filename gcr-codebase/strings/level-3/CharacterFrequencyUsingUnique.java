import java.util.Scanner;

class CharacterFrequencyUsingUnique {

    // Method to find unique characters in a string using charAt() and nested loops
    public static char[] uniqueCharacters(String input) {

        int length = input.length();
        char[] temp = new char[length];
        int count = 0;

        for (int i = 0; i < length; i++) {
            char current = input.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (current == input.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique)
                temp[count++] = current;
        }

        char[] unique = new char[count];
        for (int i = 0; i < count; i++)
            unique[i] = temp[i];

        return unique;
    }

    // Method to find frequency of characters using unique characters and return 2D array
    public static String[][] findFrequencyUsingUnique(String input) {

        int[] frequency = new int[256];

        for (int i = 0; i < input.length(); i++)
            frequency[input.charAt(i)]++;

        char[] uniqueChars = uniqueCharacters(input);

        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String[][] frequencyResult = findFrequencyUsingUnique(input);

        System.out.println("Character\tFrequency");
        for (int i = 0; i < frequencyResult.length; i++)
            System.out.println(frequencyResult[i][0] + "\t\t" + frequencyResult[i][1]);

        sc.close();
    }
}
