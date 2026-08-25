package com.fundoonotes.exception;

public class ResetTokenExpiredException extends RuntimeException {

    public ResetTokenExpiredException() {
        super("Recovery token has expired");
    }
}