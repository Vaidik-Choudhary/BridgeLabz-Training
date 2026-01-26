package com.resumeanalyzer;

public class ResumeData {
	String email;
	String phone;
	int matchCount;
	String fileName;

	public ResumeData(String email, String phone, int matchCount, String fileName) {
		this.email = email;
		this.phone = phone;
		this.matchCount = matchCount;
		this.fileName = fileName;
	}

	public String toString() {
		return email + " | " + phone + " | " + matchCount + "      | " + fileName;
	}

	public int getMatchCount() {
		return matchCount;
	}
}
