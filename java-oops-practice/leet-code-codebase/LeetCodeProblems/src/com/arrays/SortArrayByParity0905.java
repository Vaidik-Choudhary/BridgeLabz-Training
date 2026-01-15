package com.arrays;

class SortArrayByParity0905 {

    //Method to sort array by parity
    public static int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[index] = nums[i];
                index++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                result[index] = nums[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};

        int[] result = sortArrayByParity(nums);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

