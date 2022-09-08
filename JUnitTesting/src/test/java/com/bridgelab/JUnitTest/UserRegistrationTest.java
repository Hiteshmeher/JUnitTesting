package com.bridgelab.JUnitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result = UserRegistration.validFirstName("Hitesh");
        System.out.println(result);
        Assertions.assertTrue(result);
    }
    @Test
    public void givenFirstName_WhenProper_ShouldReturnFalse() {
        boolean result = UserRegistration.validFirstName("hitesh");
        System.out.println(result);
        Assertions.assertFalse(result);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean result = UserRegistration.validLastName("Meher");
        System.out.println(result);
        Assertions.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnFalse() {
        boolean result = UserRegistration.validLastName("meher");
        System.out.println(result);
        Assertions.assertFalse(result);
    }
    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        boolean result = UserRegistration.validEmailAddress("hiteshmeher@gmail.com");
        System.out.println(result);
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnFalse() {
        boolean result = UserRegistration.validEmailAddress("hitesh");
        System.out.println(result);
        Assertions.assertFalse(result);
    }
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        boolean result = UserRegistration.validMobileNumber("91 7008784018");
        System.out.println(result);
        Assertions.assertTrue(result);
    }
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnFalse() {
        boolean result = UserRegistration.validMobileNumber("91 890675");
        System.out.println(result);
        Assertions.assertFalse(result);
    }
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        boolean result = UserRegistration.validPassword("Hitesh%meher678");
        System.out.println(result);
        Assertions.assertTrue(result);
    }
    //Sad test case for Password
    @Test
    public void givenPassword_WhenProper_ShouldReturnFalse() {
        boolean result = UserRegistration.validPassword("hitesh0op0");
        System.out.println(result);
        Assertions.assertFalse(result);
    }
}