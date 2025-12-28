class ReverseVowels0345 {

    //Method to reverse vowels
    public static String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;

        while (i < j) {
            if (!isVowel(arr[i])) i++;
            else if (!isVowel(arr[j])) j--;
            else {
                char t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
                j--;
            }
        }
        return new String(arr);
    }

    static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }
}
