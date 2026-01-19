package com.eduresults;

import java.util.ArrayList;
import java.util.List;

public class RankMerger {

    public List<Integer> mergeDistrictRanks(List<Integer> districtA, List<Integer> districtB) {

        List<Integer> stateRankList = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < districtA.size() && j < districtB.size()) {
            if (districtA.get(i) <= districtB.get(j)) {
                stateRankList.add(districtA.get(i));
                i++;
            } else {
                stateRankList.add(districtB.get(j));
                j++;
            }
        }

        while (i < districtA.size()) {
            stateRankList.add(districtA.get(i));
            i++;
        }

        while (j < districtB.size()) {
            stateRankList.add(districtB.get(j));
            j++;
        }

        return stateRankList;
    }
}

