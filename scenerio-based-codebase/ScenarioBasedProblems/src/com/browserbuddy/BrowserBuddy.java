package com.browserbuddy;

import java.util.Stack;

public class BrowserBuddy {

    private static class Node {
        private String url;
        private Node prev;
        private Node next;

        private Node(String url) {
            this.url = url;
        }
    }

    private Node current;
    private Stack<String> closedTabs;

    public BrowserBuddy() {
        closedTabs = new Stack<>();
    }

    public void visit(String url) {
        Node newNode = new Node(url);

        if (current != null) {
            current.next = newNode;
            newNode.prev = current;
        }

        current = newNode;
        System.out.println("Visited: " + url);
    }

    public void back() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Back to: " + current.url);
        }
    }

    public void forward() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Forward to: " + current.url);
        }
    }

    public void closeTab() {
        if (current != null) {
            closedTabs.push(current.url);
            System.out.println("Closed: " + current.url);
            current = current.prev;
        }
    }

    public void restoreTab() {
        if (!closedTabs.isEmpty()) {
            visit(closedTabs.pop());
        }
    }
}
