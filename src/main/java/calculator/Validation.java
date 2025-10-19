package calculator;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Validation {
    public static int validate(String userInput, String delimiter, String delimPattern) {



        if(Character.isDigit(userInput.charAt(0)) && userInput.matches("^["+delimiter+"0-9"+"]+$")) {

            return 1;
        }

        else if(userInput.charAt(0)=='/' && userInput.matches(delimPattern)) {

            return 2;
        }

        else {

            return 0;
        }

    }
}

