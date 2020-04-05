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

}


