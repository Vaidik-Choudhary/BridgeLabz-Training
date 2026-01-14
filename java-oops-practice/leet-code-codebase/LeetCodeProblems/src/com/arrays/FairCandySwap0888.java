package com.arrays;

class FairCandySwap0888 {

    //Method to find fair candy swap
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice = 0;
        int sumBob = 0;

        for (int i = 0; i < aliceSizes.length; i++) {
            sumAlice += aliceSizes[i];
        }

        for (int i = 0; i < bobSizes.length; i++) {
            sumBob += bobSizes[i];
        }

        int diff = (sumBob - sumAlice) / 2;

        for (int i = 0; i < aliceSizes.length; i++) {
            for (int j = 0; j < bobSizes.length; j++) {
                if (bobSizes[j] - aliceSizes[i] == diff) {
                    return new int[]{aliceSizes[i], bobSizes[j]};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] alice = {1, 1};
        int[] bob = {2, 2};

        int[] result = fairCandySwap(alice, bob);
        System.out.println(result[0] + " " + result[1]);
    }
}

