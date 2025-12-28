class WordPattern0290 {

    //Method to check word pattern
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length) return false;

        for (int i = 0; i < pattern.length(); i++) {
            for (int j = i + 1; j < pattern.length(); j++) {
                if (pattern.charAt(i) == pattern.charAt(j) &&
                    !words[i].equals(words[j])) return false;

                if (pattern.charAt(i) != pattern.charAt(j) &&
                    words[i].equals(words[j])) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
    }
}
