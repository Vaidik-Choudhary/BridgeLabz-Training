package com.texteditor;

public class TextEditorMain {

    public static void main(String[] args) {

        TextEditor editor = new TextEditor();

        editor.insertText("Hello");
        editor.insertText(" World");
        editor.showContent();

        editor.deleteText(6);
        editor.showContent();

        editor.undo();
        editor.showContent();

        editor.redo();
        editor.showContent();
    }
}
