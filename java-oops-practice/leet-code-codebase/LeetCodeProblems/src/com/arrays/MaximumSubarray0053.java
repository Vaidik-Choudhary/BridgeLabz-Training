package com.arrays;

class MaximumSubarray0053 {

    //Method to find maximum sub-array sum
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;

            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
