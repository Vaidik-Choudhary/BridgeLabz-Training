import java.util.Scanner;

class LongestWord {

    // Method to find the longest word in a sentence or quote
    public static String findLongestWord(String input) {
        String word = "";
        String longest = "";

        for (int i = 0; i <= input.length(); i++) {
            if (i == input.length() || input.charAt(i) == ' ') {
                if (word.length() > longest.length()) {
                    longest = word;
                }
                word = "";
            } else {
                word += input.charAt(i);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(findLongestWord(input));

        sc.close();
    }
}
