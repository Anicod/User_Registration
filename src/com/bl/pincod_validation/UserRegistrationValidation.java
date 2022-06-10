package com.bl.pincod_validation;
import java.util.regex.Pattern;

public class UserRegistrationValidation {
    String userNameValidation = "[A-Z][a-z]{4,}";
    String userLastName = "[A-Z][a-z]{2,}";
    String contactValidation = "^(91)[0-9]{10}$ ";

    boolean validateFirstName;
    boolean validateLastname;
    boolean validateContact;
    boolean validateFirstName(String name){
        validateFirstName = Pattern.matches(userNameValidation, name);
        return validateFirstName;
    }
    boolean validateLastName(String lastName){
        validateLastname = Pattern.matches(userLastName, lastName);
        return validateLastname;
    }
    boolean validateContact(String contactNumber){
        validateContact = Pattern.matches(contactValidation, contactNumber);
        return validateContact;
    }


}
