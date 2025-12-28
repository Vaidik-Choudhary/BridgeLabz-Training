class FirstUniqueCharacter0387 {

    //Method to find first unique character
    public static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            boolean unique = true;

            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if (unique) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
}
