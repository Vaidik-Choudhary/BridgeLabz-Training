package com.coderepocleaner;

import java.io.IOException;

public class CodeRepoCleanerMain {
    public static void main(String[] args) {
        CodeRepoCleaner cleaner = new CodeRepoCleaner();

        String sourceFolder = "samplefiles/myrepo";
        String outputBase = "samplefiles/myrepocleaned";

        try {
            cleaner.cleanRepo(sourceFolder, outputBase);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
