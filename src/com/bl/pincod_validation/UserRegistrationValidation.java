package com.bl.pincod_validation;
import java.util.regex.Pattern;

public class UserRegistrationValidation {
    String userNameValidation = "[A-Z][a-z]{4,}";
    String userLastName = "[A-Z][a-z]{2,}";
    boolean validateFirstName;
    boolean validateLastname;
    boolean validateFirstName(String name){
        validateFirstName = Pattern.matches(userNameValidation, name);
        return validateFirstName;
    }
    boolean validateLastName(String lastName){
        validateLastname = Pattern.matches(userLastName, lastName);
        return validateLastname;
    }

}
