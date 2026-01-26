package com.junit.testingpasswordstrengthvalidator;

public class PasswordValidator {

    // Returns true if password is strong
    public boolean isValid(String password) {

        if (password == null) {
            return false;
        }

        // Rule 1: Minimum length
        if (password.length() < 8) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasDigit = false;

        // Check each character
        for (char ch : password.toCharArray()) {

            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            }

            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        return hasUppercase && hasDigit;
    }
}

