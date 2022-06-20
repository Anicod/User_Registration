package com.bl.pincod_validation;

@FunctionalInterface
public interface RegexPattern {
    boolean pattern(String inputDetails, String pattern);

}
