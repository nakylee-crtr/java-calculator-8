package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {


        String delimiter= ",:";
        String delimPattern= "//(.*)\\\\n(.*)";
        System.out.print("덧셈할 문자열을 입력해 주세요 : ");
        String userInput = Console.readLine();
        int calcResult = Calculation.calculate(userInput, delimiter, delimPattern);
        System.out.println("결과 : "+calcResult);
    }
}