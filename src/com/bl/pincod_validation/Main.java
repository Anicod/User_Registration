package com.bl.pincod_validation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("welcome to the User registration Program");
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        UserRegistrationValidation userlastnamevalidation = new UserRegistrationValidation();
        UserRegistrationValidation userContactValidation = new UserRegistrationValidation();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the First name of the user\n");
        String userName = scanner.next();
        boolean firstName = userRegistrationValidation.validateFirstName(userName);
        System.out.println("enter the last name of the user\n");
        String lastName = scanner.next();
        boolean userLastName = userlastnamevalidation.validateLastName(lastName);


        if(firstName == true)
            System.out.println("First name is validate successfully");
        else
            System.out.println("enter a first valid name");
        if(userLastName == true)
            System.out.println("Last Name Validate successfully");
        else
            System.out.println("enter valid last name");

    }
}


