package com.eduresults;

import java.util.Arrays;
import java.util.List;

public class EduResultsMain {

    public static void main(String[] args) {

        RankMerger merger = new RankMerger();

        List<Integer> districtA = Arrays.asList(55, 68, 72, 90, 95);
        List<Integer> districtB = Arrays.asList(60, 70, 85, 92, 98);

        List<Integer> finalRankList =
                merger.mergeDistrictRanks(districtA, districtB);

        System.out.println("=== State-Wise Rank List ===\n");
        for (int score : finalRankList) {
            System.out.println("Score: " + score);
        }
    }
}

