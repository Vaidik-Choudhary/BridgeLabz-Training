package com.coderepocleaner;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class CodeRepoCleaner {

    private static final String VALID = "Valid";
    private static final String WARNINGS = "Warnings";
    private static final String ERRORS = "Errors";

    public void cleanRepo(String sourceFolder, String outputBase) throws IOException {
        Path src = Paths.get(sourceFolder);
        Path out = Paths.get(outputBase);

        createCategoryFolders(out);

        List<Path> javaFiles = Files.walk(src)
                .filter(Files::isRegularFile)
                .filter(p -> p.toString().toLowerCase().endsWith(".java"))
                .collect(Collectors.toList());

        System.out.println("Found " + javaFiles.size() + " .java files");

        Map<String, List<Path>> categorized = new HashMap<>();
        categorized.put(VALID, new ArrayList<>());
        categorized.put(WARNINGS, new ArrayList<>());
        categorized.put(ERRORS, new ArrayList<>());

        Set<String> usedImports = new HashSet<>();

        for (Path file : javaFiles) {
            try {
                String content = Files.readString(file);

                int issueCount = 0;

                issueCount += checkMethodNames(content);

                int importCount = countImports(content);
                if (importCount > 0) {
                    issueCount += checkUnusedImports(content);
                }

                String category;
                if (issueCount == 0) {
                    category = VALID;
                } else if (issueCount <= 2) {
                    category = WARNINGS;
                } else {
                    category = ERRORS;
                }

                categorized.get(category).add(file);

            } catch (Exception e) {
                System.out.println("Error reading " + file + ": " + e.getMessage());
                categorized.get(ERRORS).add(file);
            }
        }

        moveFiles(categorized, out);

        printSummary(categorized);
    }

    private void createCategoryFolders(Path base) throws IOException {
        for (String cat : new String[]{VALID, WARNINGS, ERRORS}) {
            Path dir = base.resolve(cat);
            Files.createDirectories(dir);
        }
    }

    private int checkMethodNames(String content) {

        Pattern p = Pattern.compile("(public|private|protected)\\s+(static\\s+)?\\w+\\s+([A-Z]\\w*)\\s*\\(");
        Matcher m = p.matcher(content);
        int bad = 0;
        while (m.find()) {
            bad++;
            System.out.println("Bad method name: " + m.group(3));
        }
        return bad;
    }

    private int countImports(String content) {
        Pattern p = Pattern.compile("^import\\s+.*;");
        return (int) content.lines().filter(line -> p.matcher(line.trim()).matches()).count();
    }

    private int checkUnusedImports(String content) {
        
        return 0;
    }

    private void moveFiles(Map<String, List<Path>> categorized, Path base) throws IOException {
        for (Map.Entry<String, List<Path>> entry : categorized.entrySet()) {
            String cat = entry.getKey();
            List<Path> files = entry.getValue();

            Path targetDir = base.resolve(cat);

            for (Path src : files) {
                Path target = targetDir.resolve(src.getFileName());
                try {
                    Files.move(src, target, StandardCopyOption.REPLACE_EXISTING);
                } catch (Exception e) {
                    System.out.println("Failed to move " + src + " to " + target);
                }
            }
        }
    }

    private void printSummary(Map<String, List<Path>> categorized) {
        System.out.println("\nSummary:");
        System.out.println("--------------------------------------------------------------------");
        for (String cat : new String[]{VALID, WARNINGS, ERRORS}) {
            System.out.println(cat + ": " + categorized.get(cat).size() + " files");
        }
        System.out.println("--------------------------------------------------------------------");
    }

    public List<Path> getLargeFiles(String folder, long minBytes) throws IOException {
        return Files.walk(Paths.get(folder))
                .filter(Files::isRegularFile)
                .filter(p -> p.toString().endsWith(".java"))
                .filter(p -> {
                    try {
                        return Files.size(p) > minBytes;
                    } catch (IOException e) {
                        return false;
                    }
                })
                .collect(Collectors.toList());
    }

    public List<Path> getRecentFiles(String folder, long daysAgo) throws IOException {
        long cutoff = System.currentTimeMillis() - (daysAgo * 24 * 60 * 60 * 1000);
        return Files.walk(Paths.get(folder))
                .filter(Files::isRegularFile)
                .filter(p -> p.toString().endsWith(".java"))
                .filter(p -> {
                    try {
                        return Files.getLastModifiedTime(p).toMillis() > cutoff;
                    } catch (IOException e) {
                        return false;
                    }
                })
                .collect(Collectors.toList());
    }
}
