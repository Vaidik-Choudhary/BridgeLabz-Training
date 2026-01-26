package com.examscanner;

import java.util.*;

public class ExamScannerMain {

    public static void main(String[] args) {

        try {
            List<String> key = Arrays.asList("A", "B", "C", "D", "A");

            ExamScanner<String> scanner = new ExamScanner<>(key);

            Map<String, Integer> result = scanner.evaluate("answers.csv");

            PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((a, b) ->b.getValue() - a.getValue());

            pq.addAll(result.entrySet());

            System.out.println("=== Rank List ===");
            while (!pq.isEmpty()) {
                var e = pq.poll();
                System.out.println(
                        e.getKey() + " → " + e.getValue());
            }

        } catch (Exception e) {
            System.out.println("ExamScanner failed");
        }
    }
}

