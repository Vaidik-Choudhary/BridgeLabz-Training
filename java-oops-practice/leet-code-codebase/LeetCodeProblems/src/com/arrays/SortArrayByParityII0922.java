package com.arrays;

class SortArrayByParityII0922 {

    //Method to sort array so even index has even and odd index has odd
    public static int[] sortArrayByParityII(int[] nums) {
        int[] result = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[evenIndex] = nums[i];
                evenIndex += 2;
            } else {
                result[oddIndex] = nums[i];
                oddIndex += 2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 5, 7};

        int[] result = sortArrayByParityII(nums);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

