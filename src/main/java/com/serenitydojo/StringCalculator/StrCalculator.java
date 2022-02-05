package com.serenitydojo.StringCalculator;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class StrCalculator {

    public int evalCalculate(String expression) {
        if(expression.isEmpty()){
            return 0;
        }
        List<String> tokens = List.of(expression.split("\\s| +| -"));
        List<String> tokenItems = new ArrayList<>();
        tokenItems.addAll(tokens);

        int runningTotal = 0;
        int runningTotal1 = 1;
        int plusOrMinusModifier = 1;
                boolean firstMultiply = true;
        if(tokenItems.contains("*")){
            int indexOfStarIcon = tokenItems.lastIndexOf("*"); // int indexOfStarIcon = tokenItems.indexOf("*");
            String lastBeforeValueOfStar = tokenItems.get(indexOfStarIcon-2);
            int i =0;
            int j =1;
            do {
                if (firstMultiply) {
                    String leftValueOfStar = tokenItems.get(indexOfStarIcon - 1);
                    String rightValueOfStar = tokenItems.get(indexOfStarIcon + 1);
                    runningTotal = runningTotal + Integer.parseInt(leftValueOfStar) * Integer.parseInt(rightValueOfStar);
                    firstMultiply = false;
                    tokenItems.remove(indexOfStarIcon +j);
                    tokenItems.remove(indexOfStarIcon);
                    tokenItems.remove(indexOfStarIcon-j);
                    j=j+1;
                }else{
                    runningTotal = runningTotal * Integer.parseInt(tokenItems.get(indexOfStarIcon - i - 1));
                    tokenItems.remove(indexOfStarIcon -j);
                    tokenItems.remove(indexOfStarIcon -j -1);
                }
                i=i+2;
            }while ((tokenItems.get(indexOfStarIcon-i).equals("*")));

        }
        for(String tokenItem : tokenItems){
           //check for the order of Precedence * mltiply , / div , then + add - substract
            // Code for the Single 1 + 2 * 2 -2
            // boolean firstTwoDigitMultiply = true;
            /*if(tokenItems.contains("*")){
              if(firstTwoDigitMultiply){
                int indexOfStarIcon = tokenItems.indexOf("*");
                String leftValueOfStar = tokenItems.get(indexOfStarIcon-1);
                String rightValueOfStar = tokenItems.get(indexOfStarIcon+1);
                runningTotal = runningTotal + Integer.parseInt(leftValueOfStar) * Integer.parseInt(rightValueOfStar);
                firstTwoDigitMultiply = false;
                }else {
                Do{
                runningTotal = runningTotal * Integer.parseInt(leftValueOfStar-2);
                While(tokenItems.get(indexOfStarIcon-1)!="*");
                }
//                tokenItems.remove(indexOfStarIcon);
//                tokenItems.remove(indexOfStarIcon);
//                tokenItems.remove(indexOfStarIcon -1);
            }*/
            if(tokenItem.equals("+")){
                plusOrMinusModifier = 1;
               // runningTotal = runningTotal + isPositiveNumber * Integer.parseInt(tokenItem);
            }else if(tokenItem.equals("-")){
                plusOrMinusModifier = -1;
               // runningTotal = runningTotal + isPositiveNumber * Integer.parseInt(tokenItem);
            }else if(tokenItem.contains("*")){

//                List<String> multiplyTokens = List.of(tokenItem.split("\\*"));
//                for (String multiToken : multiplyTokens){
//                        runningTotal1 = runningTotal1 * Integer.parseInt(multiToken);
//                }
//                runningTotal = runningTotal + runningTotal1;
//                runningTotal1 = 1;
            }
            if(StringUtils.isNumeric(tokenItem)){
                runningTotal = runningTotal + plusOrMinusModifier * Integer.parseInt(tokenItem);
            }
        }
        return runningTotal;

    }//endofevalCalculate








}// endof StrCalculator class
