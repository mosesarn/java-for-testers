package com.serenitydojo.StringCalculator;

public class StringCalExpression {


    public Integer calculateStringExpression(String expression) {
       //12 + 2 * 2 * 2 *2 -8
        String input = expression.replace(" ", "");
        int len = input.length();
        for (int i=0;i<=len;i++){
            if ((input.charAt(i) != '+')|| (input.charAt(i) != '-') || (input.charAt(i) != '*')){
                  do{
                      String temp = "";
                      temp = temp + input.charAt(i)+ input.charAt(i+1);

                  }while((input.charAt(i+1) == '+')|| (input.charAt(i+1) == '-') || (input.charAt(i+1) == '*'));
//                   int nuber = Integer.parseInt(temp);
//                   temp = "";
            }
        }

        return 1;
    }
}
