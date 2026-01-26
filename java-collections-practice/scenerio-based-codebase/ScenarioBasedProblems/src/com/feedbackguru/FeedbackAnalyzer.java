package com.feedbackguru;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class FeedbackAnalyzer<T> {
    private Map<FeedbackCategory, List<String>> categorizedFeedback;

 
    public FeedbackAnalyzer() {
        categorizedFeedback = new HashMap<>();

        for (FeedbackCategory c : FeedbackCategory.values()) {
            categorizedFeedback.put(c, new ArrayList<>());
        }
    }

    public void analyzeFolder(String folderPath) {
        File folder = new File(folderPath);
        File[] files = folder.listFiles();

        if (files == null || files.length == 0) {
            System.out.println("No files found in folder");
            return;
        }

        for (File file : files) {
            if (file.isFile() && file.getName().toLowerCase().endsWith(".txt")) {
                readFeedbackFile(file);
            }
        }
    }

    private void readFeedbackFile(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

                processLine(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file " + file.getName() + ": " + e.getMessage());
        }
    }

 
    private void processLine(String line) {
        try {
           
            Integer rating = extractRating(line);

            if (rating == null) {
            
                addToCategory(FeedbackCategory.NEUTRAL, line);
                return;
            }

        
            FeedbackCategory category = getCategory(rating);
            addToCategory(category, line);

        } catch (Exception e) {
        
            System.out.println("Skipped invalid line: " + line);
        }
    }

    private Integer extractRating(String line) {
        Pattern pattern = Pattern.compile("\\b(\\d{1,2})/10\\b");
        Matcher matcher = pattern.matcher(line);

        if (matcher.find()) {
            try {
                int score = Integer.parseInt(matcher.group(1));
                if (score >= 0 && score <= 10) {
                    return score;
                }
            } catch (NumberFormatException e) {
          
            }
        }
        return null;
    }

    private FeedbackCategory getCategory(int rating) {
        if (rating >= 8) {
            return FeedbackCategory.POSITIVE;
        } else if (rating >= 5) {
            return FeedbackCategory.NEUTRAL;
        } else {
            return FeedbackCategory.NEGATIVE;
        }
    }

    private void addToCategory(FeedbackCategory category, String feedback) {
        categorizedFeedback.get(category).add(feedback);
    }

    public void printSummary() {
    	System.out.println("--------------------------------------------------------------------------");
        System.out.println("Feedback Summary:");
        System.out.println("--------------------------------------------------------------------------");

        for (FeedbackCategory category : FeedbackCategory.values()) {
            List<String> list = categorizedFeedback.get(category);
            System.out.println(category + ": " + list.size() + " entries");

            int count = Math.min(3, list.size());
            for (int i = 0; i < count; i++) {
                System.out.println("  - " + list.get(i));
            }
            if (list.size() > 3) {
                System.out.println("  ... and " + (list.size() - 3) + " more");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------------------");
    }

    public int getTotalFeedback() {
        int total = 0;
        for (List<String> list : categorizedFeedback.values()) {
            total += list.size();
        }
        return total;
    }
}
