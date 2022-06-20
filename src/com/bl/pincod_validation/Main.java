package com.bl.pincod_validation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    static final String NAME_PATTERN = "[A-Z][a-z]{2,}";
    static final String CONTACT_NUMBER_PATTERN = "[0-9]{2}\\s[1-9][0-9]{9}$";

    public static void main(String[] args) {
        RegexPattern firstName = ((inputDetails, pattern) -> Pattern.matches(inputDetails, pattern));
        RegexPattern lastName = ((inputDetails, pattern) -> Pattern.matches(inputDetails, pattern));
        RegexPattern contactNumber = ((inputDetails, pattern) -> Pattern.matches(inputDetails, pattern));
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first name");
        String inputFirstName = scanner.next();
        System.out.println("enter last name");
        String inputLastName = scanner.next();
        System.out.println("enter contact number");
        String inputContactNumber = scanner.next();
        if (firstName.pattern(NAME_PATTERN, inputFirstName))
            System.out.println("first name is validate successfully");
        else
            System.out.println("enter valid input");
        if (lastName.pattern(NAME_PATTERN, inputLastName))
            System.out.println("last name validate successfully");
        else
            System.out.println("enter valid last name");
        if (contactNumber.pattern(CONTACT_NUMBER_PATTERN, inputContactNumber))
            System.out.println("contact number validate succcessfully");
        else
            System.out.println("enter valid contact number");
    }
}
