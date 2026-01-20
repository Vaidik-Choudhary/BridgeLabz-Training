package com.foodfest;

import java.util.ArrayList;
import java.util.List;

public class FootFall {

	public List<Integer> mergeZone(List<Integer> zoneA, List<Integer> zoneB) {
		
		List<Integer> footFallList = new ArrayList<>();
		
		int i = 0;
		int j = 0;
		
		while (i < zoneA.size() && j < zoneB.size()) {
			if (zoneA.get(i) <= zoneB.get(j)) {
				footFallList.add(zoneA.get(i));
				i++;
			} else {
				footFallList.add(zoneB.get(j));
				j++;
			}
		}
		while (i < zoneA.size()) {
			footFallList.add(zoneA.get(i));
			i++;
		}
		while (j < zoneB.size()) {
			footFallList.add(zoneB.get(j));
			j++;
		}
		return footFallList;
	}
}
