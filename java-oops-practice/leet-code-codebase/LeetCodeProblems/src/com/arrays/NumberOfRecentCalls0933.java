package com.arrays;

class NumberOfRecentCalls0933 {

    static int[] calls = new int[10000];
    static int size = 0;

    //Method to record ping and return recent calls count
    public static int ping(int t) {
        calls[size] = t;
        size++;

        int count = 0;

        for (int i = 0; i < size; i++) {
            if (calls[i] >= t - 3000 && calls[i] <= t) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(ping(1));
        System.out.println(ping(100));
        System.out.println(ping(3001));
        System.out.println(ping(3002));
    }
}
