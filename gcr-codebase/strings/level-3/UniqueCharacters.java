import java.util.Scanner;

class UniqueCharacters {

    // Method to find length of the text without using length() method
    public static int findLength(String input) {
        int count = 0;
        while (true) {
            try {
                input.charAt(count);
                count++;
            } catch (Exception e) {
                break;
            }
        }
        return count;
    }

    // Method to find unique characters in a string using charAt() method
    public static char[] findUniqueCharacters(String input) {
        int length = findLength(input);
        char[] temp = new char[length];
        int index = 0;

        for (int i = 0; i < length; i++) {
            char current = input.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (current == input.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[index] = current;
                index++;
            }
        }

        char[] unique = new char[index];
        for (int i = 0; i < index; i++)
            unique[i] = temp[i];

        return unique;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        char[] uniqueChars = findUniqueCharacters(input);

        System.out.print("Unique Characters: ");
        for (int i = 0; i < uniqueChars.length; i++)
            System.out.print(uniqueChars[i] + " ");

        sc.close();
    }
}
