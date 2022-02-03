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

        /*if(tokenItems.contains("*")){
            int indexOfStarIcon = tokenItems.lastIndexOf("*"); // int indexOfStarIcon = tokenItems.indexOf("*");
            String lastBeforeValueOfStar = tokenItems.get(indexOfStarIcon-2);
            if(lastBeforeValueOfStar.equals("*")){

            }
            String leftValueOfStar = tokenItems.get(indexOfStarIcon-1);
            String rightValueOfStar = tokenItems.get(indexOfStarIcon+1);
            runningTotal = runningTotal + Integer.parseInt(leftValueOfStar) * Integer.parseInt(rightValueOfStar);
            tokenItems.remove(indexOfStarIcon);
            tokenItems.remove(indexOfStarIcon);
            tokenItems.remove(indexOfStarIcon -1);
        }*/
        for(String tokenItem : tokenItems){
           //check for the order of Precedence * mltiply , / div , then + add - substract
            // Code for the Single 1 + 2 * 2 -2
            /*if(tokenItems.contains("*")){
                int indexOfStarIcon = tokenItems.indexOf("*");
                String leftValueOfStar = tokenItems.get(indexOfStarIcon-1);
                String rightValueOfStar = tokenItems.get(indexOfStarIcon+1);
                runningTotal = runningTotal + Integer.parseInt(leftValueOfStar) * Integer.parseInt(rightValueOfStar);
                tokenItems.remove(indexOfStarIcon);
                tokenItems.remove(indexOfStarIcon);
                tokenItems.remove(indexOfStarIcon -1);
            }*/
            if(tokenItem.equals("+")){
                plusOrMinusModifier = 1;
               // runningTotal = runningTotal + isPositiveNumber * Integer.parseInt(tokenItem);
            }else if(tokenItem.equals("-")){
                plusOrMinusModifier = -1;
               // runningTotal = runningTotal + isPositiveNumber * Integer.parseInt(tokenItem);
            }else if(tokenItem.contains("*")){

                List<String> multiplyTokens = List.of(tokenItem.split("\\*"));
                for (String multiToken : multiplyTokens){
                        runningTotal1 = runningTotal1 * Integer.parseInt(multiToken);
                }
                runningTotal = runningTotal + runningTotal1;
                runningTotal1 = 1;
            }
            if(StringUtils.isNumeric(tokenItem)){

                runningTotal = runningTotal + plusOrMinusModifier * Integer.parseInt(tokenItem);
            }
        }
        return runningTotal;

    }//endofevalCalculate








}// endof StrCalculator class
