package com.arrays;

class ReverseOnlyLetters0917 {

    //Method to reverse only letters
    public static String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (!isLetter(arr[left])) {
                left++;
            } else if (!isLetter(arr[right])) {
                right--;
            } else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }

    public static boolean isLetter(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    public static void main(String[] args) {
        String input = "a-bC-dEf-ghIj";
        System.out.println(reverseOnlyLetters(input));
    }
}

