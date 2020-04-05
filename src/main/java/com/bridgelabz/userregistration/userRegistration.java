package com.bridgelabz.userregistration;

import java.util.regex.Pattern;

public class userRegistration {
        String pattern1 ="^[A-Z][a-zA-Z]{2,}$";
        String pattern2 ="^[a-zA-Z]+([+]?[-]?[.]?[_]?[a-zA-Z0-9]+)?[@]{1}[a-z]+[.]{1}[a-z]{2,}([.]?[a-z]+)?$";
        String pattern3="^[0-9]{2}[ ]{1}[0-9]{10}$";

        public static void main(String[] args) {
            System.out.println("Welcome to user registration");
        }

        public boolean checkName(String fname) {
            return Pattern.matches(pattern1,fname);
        }

        public boolean checkEmail(String email) {
        return Pattern.matches(pattern2,email);
    }

    public boolean checkMobileNumber(String number) {
        return Pattern.matches(pattern3,number);
    }

}


