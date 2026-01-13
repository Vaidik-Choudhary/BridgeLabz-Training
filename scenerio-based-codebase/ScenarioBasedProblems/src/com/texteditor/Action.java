package com.texteditor;

public class Action {

    private String type;
    private String text;

    public Action(String type, String text) {
        this.type = type;
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public String getText() {
        return text;
    }
}

