class LongestPalindrome0409 {

    //Method to find longest palindrome length
    public static int longestPalindrome(String s) {
        int[] count = new int[128];
        int len = 0;

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }

        for (int c : count) {
            len += (c / 2) * 2;
        }

        if (len < s.length()) len++;
        return len;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }
}
