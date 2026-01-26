package com.examscanner;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamScanner<T> {

    private List<String> key;
    private Pattern validLine = Pattern.compile("^[A-Za-z ]+(,[A-D])+$");

    public ExamScanner(List<String> key) {
        this.key = key;
    }

    public Map<String, Integer> evaluate(String file) {

        Map<String, Integer> scores = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;
            while ((line = br.readLine()) != null) {

                if (!validLine.matcher(line).matches())
                    continue;

                String[] parts = line.split(",");
                int score = 0;

                for (int i = 1; i < parts.length && i <= key.size(); i++) {
                    if (parts[i].equals(key.get(i - 1)))
                        score++;
                }

                scores.put(parts[0], score);
            }

        } catch (Exception e) {
            System.out.println("Exam read error");
        }
        return scores;
    }
}

