package com.browserbuddy;

public class BrowserBuddyMain {
    public static void main(String[] args) {

        BrowserBuddy browser = new BrowserBuddy();

        browser.visit("google.com");
        browser.visit("github.com");
        browser.visit("geeksforgeeks.com");

        browser.back();
        browser.forward();

        browser.closeTab();
        browser.restoreTab();
    }
}

