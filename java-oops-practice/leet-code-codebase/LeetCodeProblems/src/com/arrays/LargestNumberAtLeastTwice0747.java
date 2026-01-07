package com.arrays;

class LargestNumberAtLeastTwice0747 {

    //Method to find index of largest number if it is at least twice of others
    public static int dominantIndex(int[] nums) {
        int max = nums[0];
        int index = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i != index && max < 2 * nums[i]) {
                return -1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {3, 6, 1, 0};
        System.out.println(dominantIndex(nums));
    }
}

