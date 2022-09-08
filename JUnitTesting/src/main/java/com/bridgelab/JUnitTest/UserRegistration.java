package com.bridgelab.JUnitTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    /**
     *
     * @param firstName
     * @return
     */
    public static boolean validFirstName(String firstName) {
        String regex = "^[A-Z][a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(firstName);
        boolean result = match.matches();
        return result;
    }

    /**
     *
     * @param nameLast
     * @return
     */
    public static boolean validLastName(String nameLast) {
        String regex = "^[A-Z][a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(nameLast);
        boolean result = m.matches();
        return result;
    }

    /**
     *
     * @param emailId
     * @return
     */
    public static boolean validEmailAddress(String emailId){
        String regex = "[A-z0-9]*(?=.*?[A-z])(?=.*\\W).*$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(emailId);
        boolean result = m.matches();
        return result;
    }

    /**
     *
     * @param mobNumber
     * @return
     */
    public static boolean validMobileNumber(String mobNumber) {
        String regex = "^\\d{2}\\s?\\d{10,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobNumber);
        boolean result = matcher.matches();
        return result;
    }

    /**
     *
     * @param password
     * @return
     */
    public static boolean validPassword(String password){
        String regex = "^(?=.*[A-z])(?=.*\\d)(?=.*[@#$%^&*()-+=])([a-zA-Z\\d@._-]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        boolean result = matcher.matches();
        return result;
    }

}