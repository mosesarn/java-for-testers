package com.serenitydojo.Lambdas;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class WhenUsingLambdas {
    List<String> colors = Arrays.asList("red","green","blue","gray-blue","gritty-white","purple","yellow","gray","pink");

    @Test
    public void printingOfColors(){
        List<String> colors = Arrays.asList("red","green","blue","purple","yellow");
        colors.forEach(
                c -> System.out.println("Color: "+c) // 1. this::printColorOf  2. C -> System.out.println("Color: "+color);
              //if the method is static then  WhenUsingLambdas :: printColorOf
        );
        //printColorOf(colors);
    }

//    private void printColorOf(String color) {
//            System.out.println("Color: "+color);
//
//    }
    @Test
    public void filteringColors(){
        colors.stream()
                .filter(color -> color.startsWith("b"))
                .forEach(color -> System.out.println(color));


    }
    @Test
    public void returnFilteredListOfColors(){
        //to return the list of filtered colors:
        List<String> filteredColors = colors.stream()
                .filter(color -> color.startsWith("g"))
                .map(color ->color.toUpperCase())//.map(string::Length) have to change the streams of Integer
                .sorted()
                .collect(Collectors.toList());
        System.out.println(filteredColors);
    }
    @Test
    public void optionalMinLength(){
        Optional<Integer> minLenght = colors.stream()
                .filter(color -> color.startsWith("z"))
                .map(String::length)//.map(string::Length) have to change the streams of Integer
                .sorted()
                .findFirst()
                ;
        System.out.println(minLenght.orElseGet(()->0));

        Integer minLenght1 = colors.stream()
                .filter(color -> color.startsWith("z"))
                .map(String::length)//.map(string::Length) have to change the streams of Integer
                .sorted()
                .findFirst()
                .orElse(0);
        System.out.println(minLenght1);
    }
    @Test
    public void lambdaTest(){
        List<String> filteredColors =  colors.stream()
                .sorted()
                //.forEach(color -> System.out.println(color));
               .map(color -> color.toUpperCase())

               .collect(Collectors.toList());

        System.out.println(filteredColors);
    }

}
