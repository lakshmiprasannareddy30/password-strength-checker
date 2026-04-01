package com.example;

public class PasswordChecker {

    public static String checkStrength(String password) {
        int score = 0;

        if (password.length() >= 8) score++;
        if (password.matches(".*[A-Z].*")) score++;
        if (password.matches(".*[a-z].*")) score++;
        if (password.matches(".*[0-9].*")) score++;
        if (password.matches(".*[!@#$%^&*()].*")) score++;

        if (score <= 2) return "Weak";
        else if (score == 3 || score == 4) return "Medium";
        else return "Strong";
    }

    public static void main(String[] args) {
        String password = "Test@123";
        System.out.println("Password Strength: " + checkStrength(password));
    }
}
