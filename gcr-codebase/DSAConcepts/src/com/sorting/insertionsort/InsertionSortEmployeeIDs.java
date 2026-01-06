package com.sorting.insertionsort;

import java.util.Arrays;

public class InsertionSortEmployeeIDs {

    public static void main(String[] args) {

        int[] employeeIds1 = {105, 101, 104, 102, 103};

        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(employeeIds1));

        InsertionSort.sort(employeeIds1);

        System.out.println("After Sorting (ascending)");
        System.out.println(Arrays.toString(employeeIds1));

    }
}
