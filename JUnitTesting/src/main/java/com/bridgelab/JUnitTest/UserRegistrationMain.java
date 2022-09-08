package com.bridgelab.JUnitTest;

import java.util.Scanner;

public class UserRegistrationMain {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("*** Welcome to User Registration problem ***");
        int choose;
        System.out.print("Press \n1.First Name\n2.Last Name\n3.Email id\n4.Phone number\n5.Password\n6.EXIT ");
        choose = sc.nextInt();
        switch (choose) {
                case 1:
                    UserRegistration.validFirstName("Hitesh");
                    break;
                case 2:
                    UserRegistration.validLastName("Meher");
                    break;
                case 3:
                    UserRegistration.validEmailAddress("hiteshmeher@gmail.com");
                    break;
                case 4:
                    UserRegistration.validMobileNumber("91 7008784018");
                    break;
                case 5:
                    UserRegistration.validPassword("Hitesh%meher678");
                    break;
                default:
                    System.out.println("Invalid: Enter valid details.");
            }
    }
}
