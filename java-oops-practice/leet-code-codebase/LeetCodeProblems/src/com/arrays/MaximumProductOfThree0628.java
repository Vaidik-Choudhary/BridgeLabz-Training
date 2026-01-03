package com.arrays;

class MaximumProductOfThree0628 {

    //Method to find maximum product of three numbers
    public static int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];

            if (n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max3 = max2;
                max2 = n;
            } else if (n > max3) {
                max3 = n;
            }

            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n < min2) {
                min2 = n;
            }
        }

        int product1 = max1 * max2 * max3;
        int product2 = max1 * min1 * min2;

        return product1 > product2 ? product1 : product2;
    }

    public static void main(String[] args) {
        int[] nums = {-10, -10, 5, 2};
        System.out.println(maximumProduct(nums));
    }
}
