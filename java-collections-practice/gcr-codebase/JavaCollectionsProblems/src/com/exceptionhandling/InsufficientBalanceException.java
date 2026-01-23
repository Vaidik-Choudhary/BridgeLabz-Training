package com.exceptionhandling;

public class InsufficientBalanceException extends Exception {
	
    InsufficientBalanceException(String msg) {
    	
        super(msg);
    }
}