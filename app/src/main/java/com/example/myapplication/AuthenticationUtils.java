package com.example.myapplication;

import android.view.View;

import java.util.HashMap;
import java.util.Map;

public class AuthenticationUtils {

    public static Map<String, Boolean> validatePassword(String password) {


        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;

        Map<String, Boolean> validateMap = new HashMap<>();

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isLowerCase(c)) {
                hasLowercase = true;
            }
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }
        validateMap.put("LOWER", hasLowercase);
        validateMap.put("UPPER", hasUppercase);
        validateMap.put("DIGIT", hasDigit);


        return validateMap;
    }

}
