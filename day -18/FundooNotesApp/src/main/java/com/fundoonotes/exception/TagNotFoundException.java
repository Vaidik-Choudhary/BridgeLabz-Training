package com.fundoonotes.exception;

public class TagNotFoundException extends RuntimeException {

    public TagNotFoundException(int tagId) {
        super("Tag not found: " + tagId);
    }
}