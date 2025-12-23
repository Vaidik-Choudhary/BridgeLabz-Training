import java.util.Scanner;

class CharacterFrequency {

    // Method to find frequency of characters using charAt() and return result in a 2D array
    public static String[][] findCharacterFrequency(String input) {

        int[] frequency = new int[256];

        for (int i = 0; i < input.length(); i++)
            frequency[input.charAt(i)]++;

        int count = 0;
        for (int i = 0; i < input.length(); i++)
            if (frequency[input.charAt(i)] != 0)
                count++;

        String[][] result = new String[count][2];
        int index = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (frequency[ch] != 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(frequency[ch]);
                index++;
                frequency[ch] = 0;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String[][] frequencyResult = findCharacterFrequency(input);

        System.out.println("Character\tFrequency");
        for (int i = 0; i < frequencyResult.length; i++)
            System.out.println(frequencyResult[i][0] + "\t\t" + frequencyResult[i][1]);

        sc.close();
    }
}
