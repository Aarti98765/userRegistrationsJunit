package com.bridgelabz.userregistration;

import java.util.regex.Pattern;

public class userRegistration {
        String pattern1 ="^[A-Z][a-zA-Z]{2,}$";
        String pattern2 ="^[a-zA-Z]+([+]?[-]?[.]?[_]?[a-zA-Z0-9]+)?[@]{1}[a-z]+[.]{1}[a-z]{2,}([.]?[a-z]+)?$";
        String pattern3="^[0-9]{2}[ ]{1}[0-9]{10}$";
        String pattern4="^[a-zA-Z0-9]{8,}$";
        String pattern5="^([a-zA-Z0-9]*[A-Z]+[a-zA-Z0-9]*)";
        String pattern6="^([a-zA-Z0-9]*[A-Z]+[a-zA-Z0-9]*[0-9]+[a-zA-Z0-9]*)|([a-zA-Z0-9]*[0-9]+[a-zA-Z0-9]*[A-Z]+[a-zA-Z0-9]*)$";
        public static void main(String[] args) {
            System.out.println("Welcome to user registration");
        }

        public boolean checkName(String userName) {
            return Pattern.matches(pattern1,userName);
        }

        public boolean checkEmail(String email) {
            return Pattern.matches(pattern2,email);
        }

        public boolean checkMobileNumber(String mobileNumber) {
            return Pattern.matches(pattern3,mobileNumber);
        }

        public boolean checkPasswordRule1(String password) {
            return Pattern.matches(pattern4,password);
        }

        public boolean checkPasswordRule2(String pass) {
        if(pass.length()>=8) {
            return (Pattern.matches(pattern5, pass));
        }
        else {
            return false;
        }

    }
    public boolean checkPasswordRule3(String pass) {
        if(pass.length()>=8) {
            return (Pattern.matches(pattern6,pass));
        }
        else {
            return false;
        }
    }
}


