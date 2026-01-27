package com.csvdata.countrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCSVRows {
    public static void main(String[] args) {
	String filePath = "samplefiles/countrows/employees.csv";
	int count = 0;

	try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	    String line;
	    boolean isHeader = true;

	    while ((line = reader.readLine()) != null) {
		if (isHeader) {
		    isHeader = false;
		    continue;
		}

		count++;
	    }
	    System.out.println("Total number of records: " + count);
	    
	} catch (IOException e) {
	    System.out.println("Error reading CSV file");
	}
    }
}