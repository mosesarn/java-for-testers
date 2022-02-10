package com.serenitydojo.strings;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WhenWorkingWithStrings {

    /**
     *
     * Adding Strings together
     *  by using + operator can add two strings.
     */
    @Test
    public void addingStringsTogether(){
        var colorA = "red";
        var colorB = "green";
        var colorC = "blue";
       var result = colorA + "," + colorB +","+ colorC;
       var result1 = String.format("%s,%s,%s", colorA,colorB,colorC);
        Assertions.assertThat(result).isEqualTo("red,green,blue");
        Assertions.assertThat(result1).isEqualTo("red,green,blue");
    }
    @Test
    public void reverseAPairOfString(){
        String[] names = {"Duck","Orange"};
        var result1 = reverse(names);
        Assertions.assertThat(result1).isEqualTo("Orange Duck");
    }

    private String reverse(String... values){
        int indexOfLastValue = values.length -1;
       // method 1:-  String result = "";
        //Method 2:- StringBuilder
        StringBuilder builder = new StringBuilder();
        for(int index = indexOfLastValue;index>=0;index--){
           // result = result +values[index] + " ";
            builder.append(values[index]).append(" ");
        }
        //return result.trim();
        return builder.toString().trim();
    }

    @Test
    public void reverseAListOfStrings(){
        var result = reverseList("Duck","Orange");
        Assertions.assertThat(result).containsExactly("Orange","Duck");

    }

    private List<String> reverseList(String... values) {
        /*
         * We can not add elements to the List. As Arrays.asList is constant.
         *  List<String> reversed = Arrays.asList(values);
         *         Collections.reverse(reversed);
         *         return reversed;
         */
        List<String> reversed = Arrays.asList(values);
        Collections.reverse(reversed);
        /*
         *
         * List<String> reversed = new ArrayList<>();
         *         for(int index= values.length-1;index>=0;index--){
         *             reversed.add(values[index]);
         *         }
         *
         */
        return reversed;
    }
    @Test
    public void capitalizedWord(){
        var result = capitalized("RED","green","blue");
        System.out.println(result);
        Assertions.assertThat(result).isEqualTo("Red Green Blue");
    }

    private String capitalized(String... words) {
        StringBuilder result = new StringBuilder();
        for (String word : words){
            var upperCaseFirstLetter = word.substring(0, 1).toUpperCase();
            var lowerCaseEnding = word.substring(1).toLowerCase();
            var capitalizedWord = upperCaseFirstLetter + lowerCaseEnding;
            result.append(capitalizedWord).append(" ");
        }

        return result.toString().trim();
    }
    @Test
    public void colorSwitch(){
        List<String> coloredShirts = List.of("red shirt", "light red shirt","blue shirt","green shirt","light yellow shirt","white shirt");
        List<String> updatedShirt = new ArrayList<>();
        for (String shirt : coloredShirts){
            var switchedShirt = shirt.replace("red", "olive green");
            updatedShirt.add(switchedShirt);
        }
          Assertions.assertThat(updatedShirt).containsExactly("olive green shirt", "light olive green shirt","blue shirt","green shirt","light yellow shirt","white shirt");
    }
    @Test
    public void sortingElementsInAList(){

    }
}
