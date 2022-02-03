package com.serenitydojo.StringCalculator;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Calculator {

    private static final String WHITE_SPACES_OR_DOLLAR = "\\$|\\s";
    public Number evaluate(String stringNumericalExpression) {
       /*
       * 1. converted the string to integer using Integer.ParseInt(string).
       * removed the spaces from the stringExpression. -- NumberFormatException.
       *  String trimmedNumber = stringNumericalExpression.trim();
       * 2. split using the regular expression and using the streams arrays.stream().filter().collect to list
       * 3. can also be done by using replace(" ","").replace("$","");
       * 4. Add dependency group id org.apache.commons, artfact id : commons-lang3, version 3.10
       *     OR  List<String> tokens = Splitter.on(" ").splitToList(expression);
       * */
        List<String> tokens = Arrays.stream( stringNumericalExpression.split(WHITE_SPACES_OR_DOLLAR))
                .filter(element -> !element.isEmpty())
                .collect(Collectors.toList());

        List<String> tokenItems = new ArrayList<>();
                tokenItems.addAll(tokens);
        int runningTotal = 0;
        int plusOrMinusModifier = 1;
        for(String token : tokens){
            System.out.println("TOKEN =  "+token);

            if(token.equals("+")){
                plusOrMinusModifier = 1;
            }else if (token.equals("-")){
                plusOrMinusModifier = -1;
            }else if (token.equals("*")){
                return runningTotal = runningTotal * plusOrMinusModifier * Integer.parseInt(token);
            }
            if(StringUtils.isNumeric(token)){

                runningTotal = runningTotal + plusOrMinusModifier * Integer.parseInt(token);
            }
        }
        return runningTotal;
    }
}
