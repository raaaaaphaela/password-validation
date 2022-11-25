package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {

    public static String[] badPasswords = {"passwort", "12345878", "geheim123"};

    public static boolean isValidPassword(String password) {
        String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!]).{8,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return checkForBadPasswords(password) && matcher.matches();
    }

    public static boolean checkForBadPasswords(String pwd) {
        for (String badPwd : badPasswords) {
            return !badPwd.equals(pwd);
        }
        return true;
    }
}