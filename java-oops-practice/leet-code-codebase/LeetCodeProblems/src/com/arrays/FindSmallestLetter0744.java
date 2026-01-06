package com.arrays;

class FindSmallestLetter0744 {

    //Method to find the smallest letter greater than target
    public static char nextGreatestLetter(char[] letters, char target) {
        char result = letters[0];

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target) {
                return letters[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'd';

        System.out.println(nextGreatestLetter(letters, target));
    }
}

