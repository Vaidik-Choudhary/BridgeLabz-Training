import java.util.Scanner;

class ReplaceWord {

    // Method to replace a word with another word
    public static String replaceWord(String input, String oldWord, String newWord) {
        String result = "";
        String word = "";

        for (int i = 0; i <= input.length(); i++) {
            if (i == input.length() || input.charAt(i) == ' ') {
                if (word.equals(oldWord))
                    result += newWord;
                else
                    result += word;

                if (i != input.length()) result += " ";
                word = "";
            } else {
                word += input.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String oldWord = sc.next();
        String newWord = sc.next();

        System.out.println(replaceWord(input, oldWord, newWord));

        sc.close();
    }
}
