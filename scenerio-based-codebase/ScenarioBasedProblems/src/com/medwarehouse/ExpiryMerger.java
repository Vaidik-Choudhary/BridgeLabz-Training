package com.medwarehouse;

import java.util.ArrayList;
import java.util.List;

public class ExpiryMerger {

    public List<Integer> mergeExpiryLists(List<Integer> branchA, List<Integer> branchB) {

        List<Integer> masterList = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < branchA.size() && j < branchB.size()) {

            if (branchA.get(i) <= branchB.get(j)) {
                masterList.add(branchA.get(i));
                i++;
            } else {
                masterList.add(branchB.get(j));
                j++;
            }
        }

        while (i < branchA.size()) {
            masterList.add(branchA.get(i));
            i++;
        }

        while (j < branchB.size()) {
            masterList.add(branchB.get(j));
            j++;
        }

        return masterList;
    }
}

