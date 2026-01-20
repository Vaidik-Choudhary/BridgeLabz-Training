package com.foodfest;

import java.util.Arrays;
import java.util.List;

public class FoodFestMain {

	public static void main(String[] args) {
		
		FootFall footFall = new FootFall();
		
		List<Integer> zoneA = Arrays.asList(55, 68, 72, 90, 95);
		List<Integer> zoneB = Arrays.asList(60, 70, 85, 92, 98);
		
		List<Integer> finalFootFall = footFall.mergeZone (zoneA, zoneB);
		
		System.out.println("=== Zone-wise Foot-Fall list ===\n");
		for (int foot : finalFootFall) {
			System.out.println("FootFall : " + foot);
		}
	}
}
