import java.util.Scanner;

class MostFrequentChar {

    // Method to find most frequent character in string
    public static char mostFrequent(String input) {
        int[] freq = new int[256];

        for (int i = 0; i < input.length(); i++) {
            freq[input.charAt(i)]++;
        }

        char result = input.charAt(0);
        int max = freq[result];

        for (int i = 1; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (freq[ch] > max) {
                max = freq[ch];
                result = ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(mostFrequent(input));

        sc.close();
    }
}
