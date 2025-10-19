package calculator;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Calculation {
    public static int calculate(String userInput, String delimiter, String delimPattern) {

        int result = 0;

        // 빈 문자열
        if (userInput == null || userInput.isEmpty()) {
            result += 0;
        }

        // 기본 구분자 포함 문자열
        else if (Validation.validate(userInput, delimiter, delimPattern) == 1 ) {

            String[] intStr = userInput.split("[" + delimiter + "]");

            for (int i = 0; i < intStr.length; i++) {

                if (intStr[i] == "") {
                    result += 0;
                }

                else {
                    result += Integer.parseInt(intStr[i]);
                }
            }
        }


// 커스텀 구분자 포함 문자열
        else if(Validation.validate(userInput, delimiter, delimPattern) == 2 ) {

            Pattern pattern = Pattern.compile(delimPattern);
            Matcher matcher = pattern.matcher(userInput);

            if (matcher.find()) {

                String customDelimiter = matcher.group(1);
                String customInput = matcher.group(2);


                if(customInput.matches("^["+customDelimiter+ "0-9"+"]+$")) {

                    String[] intStr = customInput.split(customDelimiter);

                    for (int i = 0; i < intStr.length; i++) {

                        if (intStr[i] == "") {
                            result += 0;
                        } else {
                            result += Integer.parseInt(intStr[i]);
                        }
                    }

                }
        }


        }


        return result;

    }
}