package com.bl.pincod_validation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("welcome to the User registration Program");
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        UserRegistrationValidation userlastnamevalidation = new UserRegistrationValidation();
        UserRegistrationValidation userContactValidation = new UserRegistrationValidation();
        UserRegistrationValidation uservalidatepassword = new UserRegistrationValidation();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the First name of the user\n");
        String userName = scanner.next();
        boolean firstName = userRegistrationValidation.validateFirstName(userName);
        System.out.println("enter the last name of the user\n");
        String lastName = scanner.next();
        boolean userLastName = userlastnamevalidation.validateLastName(lastName);
        System.out.println("enter a user Contact Number");
        String userContact = scanner.next();
        boolean contactNumberValidation = userContactValidation.validateContact(userContact);
        System.out.println("enter a user password");
        String userPassword = scanner.next();
        boolean validateUserPassword = uservalidatepassword.validatePassword(userPassword);


        if(firstName == true)
            System.out.println("First name is validate successfully");
        else
            System.out.println("enter a first valid name");
        if(userLastName == true)
            System.out.println("Last Name Validate successfully");
        else
            System.out.println("enter valid last name");
        if(contactNumberValidation == true)
            System.out.println("Contact number validate Successfully");
        else
        System.out.println("enter valid Contact number");
        if(validateUserPassword == true)
            System.out.println("password validate password successfully");
        else
            System.out.println("enter a valid password");

    }
}


