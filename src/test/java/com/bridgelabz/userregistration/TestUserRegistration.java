package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class TestUserRegistration {
        userRegistration obj = new userRegistration();

        @Test
        public void givenfirstName_whenValid_thenTrue() {
            boolean firstName = obj.checkName("Capital");
            Assert.assertTrue(firstName);
        }

        @Test
        public void givenfirstName_whenInvalid_thenFalse() {
            boolean firstName = obj.checkName("Ca");
            Assert.assertFalse(firstName);
        }
}


