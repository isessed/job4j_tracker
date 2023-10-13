package ru.job4j.early;

public class PasswordValidator {

    private static final String[] FORBIDDEN = {"qwerty", "12345", "password", "admin", "user"};

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        boolean hasUpCase = false;
        for (char symbol : password.toCharArray()) {
            if (Character.isUpperCase(symbol)) {
                hasUpCase = true;
                break;
            }
        }
        if (!hasUpCase) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        boolean hasLowCase = false;
        for (char symbol : password.toCharArray()) {
            if (Character.isLowerCase(symbol)) {
                hasLowCase = true;
                break;
            }
        }
        if (!hasLowCase) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        boolean hasDigit = false;
        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                hasDigit = true;
                break;
            }
        }
        if (!hasDigit) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        boolean hasSpecial = false;
        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                hasSpecial = true;
                break;
            }
        }
        if (!hasSpecial) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        boolean containsCaseInsensitive = false;
        for (String forbidden : FORBIDDEN) {
            if (password.toLowerCase().contains(forbidden)) {
                containsCaseInsensitive = true;
                break;
            }
        }
        if (containsCaseInsensitive) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
        }
        return password;
    }
}