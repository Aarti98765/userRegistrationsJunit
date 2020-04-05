package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class TestUserRegistration {
        userRegistration obj = new userRegistration();

        @Test
        public void givenfirstName_whenValid_thenTrue() {
            boolean firstName = obj.checkName("Aarti");
            Assert.assertTrue(firstName);
        }

        @Test
        public void givenfirstName_whenInvalid_thenFalse() {
            boolean firstName = obj.checkName("Aa");
            Assert.assertFalse(firstName);
        }

       @Test
        public void givenLastName_whenValid_thenTrue() {
            boolean lastName = obj.checkName("Ahire");
            Assert.assertTrue(lastName);
        }

    @Test
    public void givenEmail_whenValid_thenTrue() {
        String array[]={"abc.xyz@bl.co.in","abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com",
                        "abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au",
                        "abc@gmail.com.com","abc+100@gmail.com"};
        for(int index=0;index<array.length;index++){
            boolean email=obj.checkEmail(array[index]);
            Assert.assertTrue(email);
        }
    }

    @Test
    public void givenEmail_whenInvalid_thenFalse() {
        String array1[]={"abc","abc()*@gmail.com","abc@.com.my","abc123@gmail.a",
                         "abc123@.com","abc123@.com.com",".abc@abc.com","abc()*@gmail.com",
                         "abc@%*.com","abc..2002@gmail.com","abc.@gmail.com","abc@abc@gmail.com",
                         "abc@gmail.com.1a","abc@gmail.com.aa.au"};
        for(int index1=0;index1<array1.length;index1++) {
            boolean Email = obj.checkEmail(array1[index1]);
            Assert.assertFalse(Email);
        }
    }

    @Test
    public void givenMobileNumber_whenValid_thenTrue() {
        boolean MobileNumber=obj.checkMobileNumber("91 1234567890");
        Assert.assertTrue(MobileNumber);
    }

    @Test
    public void givenMobileNumber_whenInvalid_thenFalse() {
        boolean MobileNumber=obj.checkMobileNumber("91 123456789");
        Assert.assertFalse(MobileNumber);
    }

    @Test
    public void givenPassword_whenRule1Valid_thenTrue() {
        boolean Password=obj.checkPasswordRule1("TYUhdsT75");
        Assert.assertTrue(Password);
    }

    @Test
    public void givenPassword_whenRule1Invalid_thenFalse() {
        boolean Password=obj.checkPasswordRule1("fgdfdfd");
        Assert.assertFalse(Password);
    }

    @Test
    public void givenPassword_whenRule2Valid_thenTrue() {
        boolean Password1=obj.checkPasswordRule2("ffa456fhjsYT");
        Assert.assertTrue(Password1);
    }

    @Test
    public void givenPassword_whenRule2Invalid_thenFalse() {
        boolean Password1=obj.checkPasswordRule2("djhsfdfg");
        Assert.assertFalse(Password1);
    }
}


