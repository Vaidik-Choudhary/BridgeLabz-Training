package com.arrays;

class DegreeOfArray0697 {

    //Method to find the length of shortest subarray with same degree
    public static int findShortestSubArray(int[] nums) {
        int degree = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count > degree) {
                degree = count;
            }
        }

        int minLength = nums.length;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            int first = -1;
            int last = -1;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                    if (first == -1) {
                        first = j;
                    }
                    last = j;
                }
            }

            if (count == degree) {
                int length = last - first + 1;
                if (length < minLength) {
                    minLength = length;
                }
            }
        }
        return minLength;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1, 4, 2};
        System.out.println(findShortestSubArray(nums));
    }
}
