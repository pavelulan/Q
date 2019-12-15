package com.ulan.cube.validator;

import java.util.regex.Pattern;

public class ValueValidator {
    private static final String ISNOTWRONG = "((\\d+)+(\\s+)+" +
            "([+-]?((\\d+)+(\\.?)+(\\d+)?))+(\\s+)+" +
            "([+-]?((\\d+)+(\\.?)+(\\d+)?))+(\\s+)+" +
            "([+-]?((\\d+)+(\\.?)+(\\d+)?))+(\\s+)+" +
            "((\\d+)+(\\.?)+(\\d+)?))";
    /*private static final String ISNOTWRONG = "\\d+"+
            "\\s+"+"\\[+-]?((\\d+)+(\\.?)+(\\d+)?"+
            "\\s+"+"\\[+-]?((\\d+)+(\\.?)+(\\d+)?"+
            "\\s+"+"\\[+-]?((\\d+)+(\\.?)+(\\d+)?"+
            "\\s+"+"((\\d+)+(\\.?)+(\\d+)?)";*/

    public boolean valueIsNotWrong (String value){
        return Pattern.matches(ISNOTWRONG, value);
    }
}
