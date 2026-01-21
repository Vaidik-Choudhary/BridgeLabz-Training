package com.medwarehouse;

import java.util.Arrays;
import java.util.List;

public class MedWareHouseMain {

    public static void main(String[] args) {

        ExpiryMerger merger = new ExpiryMerger();

        List<Integer> branchA = Arrays.asList(2, 5, 9, 14);
        List<Integer> branchB = Arrays.asList(1, 6, 10, 20);

        List<Integer> finalExpiryList = merger.mergeExpiryLists(branchA, branchB);

        System.out.println("=== Medicine Expiry Schedule ===");
        for (int day : finalExpiryList) {
            System.out.println("Expires in Day: " + day);
        }
    }
}

