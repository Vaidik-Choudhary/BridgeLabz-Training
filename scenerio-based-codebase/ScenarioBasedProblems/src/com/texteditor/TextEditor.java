package com.texteditor;

import java.util.Stack;

public class TextEditor {

    private Stack<Action> undoStack;
    private Stack<Action> redoStack;
    private String content;

    public TextEditor() {
        undoStack = new Stack<>();
        redoStack = new Stack<>();
        content = "";
    }

    public void insertText(String text) {

        content += text;
        undoStack.push(new Action("INSERT", text));
        redoStack.clear();

        System.out.println("Inserted: " + text);
    }

    public void deleteText(int length) {

        if (length > content.length()) {
            length = content.length();
        }

        String deletedText = content.substring(content.length() - length);
        content = content.substring(0, content.length() - length);

        undoStack.push(new Action("DELETE", deletedText));
        redoStack.clear();

        System.out.println("Deleted: " + deletedText);
    }

    public void undo() {

        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo.");
            return;
        }

        Action action = undoStack.pop();

        if (action.getType().equals("INSERT")) {
            content = content.substring(0,
                    content.length() - action.getText().length());
        } else if (action.getType().equals("DELETE")) {
            content += action.getText();
        }

        redoStack.push(action);
        System.out.println("Undo performed.");
    }

    public void redo() {

        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo.");
            return;
        }

        Action action = redoStack.pop();

        if (action.getType().equals("INSERT")) {
            content += action.getText();
        } else if (action.getType().equals("DELETE")) {
            content = content.substring(0,
                    content.length() - action.getText().length());
        }

        undoStack.push(action);
        System.out.println("Redo performed.");
    }

    public void showContent() {
        System.out.println("Current Content: " + content);
    }
}
