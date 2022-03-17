package com.serenitydojo;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class WhenWorkingWithArrays {
    @Test
    public void listOfColors() {
        String[] color = {"red", "green", "blue", "white"};

        String[] moreColors = new String[3];
        moreColors[0] = "yellow";
        moreColors[1] = "purple";
        moreColors[2] = "black";
        System.out.println("Before Sorting Color:  "+color);


        for (int i = 0; i < moreColors.length; i++) {
            System.out.println("more colors:  "+moreColors[i]);
        }
        // sequence of objects you need to maintain and allow duplicate use List.
        // collection of objects without duplicates and sequence is not needed then use set.

        //List<String> myColors = new ArrayList<String>();
        Set<String> myColors = new HashSet<>();
        //Alt+Shift+Enter for import
        myColors.add("Purple");
        myColors.add("White");
        myColors.add("OliveGreen");
        myColors.add("Purple");
        for (String someColor : myColors) {
            System.out.println(someColor);
        }
    }
}