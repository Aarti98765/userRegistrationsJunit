package com.bridgelabz.userregistration;

import java.util.regex.Pattern;

public class userRegistration {
        String pattern1 ="^[A-Z][a-zA-Z]{2,}$";

        public static void main(String[] args) {
            System.out.println("Welcome to user registration");
        }
        public boolean checkName(String fname) {
            return Pattern.matches(pattern1,fname);
        }
}


