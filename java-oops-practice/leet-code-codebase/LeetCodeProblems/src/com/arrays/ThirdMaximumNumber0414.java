package com.arrays;

class ThirdMaximumNumber0414 {

    //Method to find the third maximum number
    public static int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (num == first || num == second || num == third) {
                continue;
            }

            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                third = second;
                second = num;
            } else if (num > third) {
                third = num;
            }
        }

        if (third == Long.MIN_VALUE) {
            return (int) first;
        }
        return (int) third;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 1};
        System.out.println(thirdMax(nums));
    }
}
