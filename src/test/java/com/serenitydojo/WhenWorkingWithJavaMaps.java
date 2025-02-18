package com.serenitydojo;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WhenWorkingWithJavaMaps {

    @Test
    public void creatingAMap(){
        Map<String, Integer> numberOfBallsByColor = new HashMap<>(); // OR  TreeMap<>();
        numberOfBallsByColor.put("red",3);
        numberOfBallsByColor.put("green",6);
        numberOfBallsByColor.put("blue",5);
        numberOfBallsByColor.put("white",7);
//        numberOfBallsByColor.entrySet();
//        numberOfBallsByColor.keySet();
//        numberOfBallsByColor.putAll();
//        numberOfBallsByColor.clear();
//        numberOfBallsByColor.size();
//        numberOfBallsByColor.compute();
//        numberOfBallsByColor.computeIfAbsent();
//        numberOfBallsByColor.computeIfPresent();
//        numberOfBallsByColor.putAll();
//        numberOfBallsByColor.containsKey();
//        numberOfBallsByColor.containsValue();
//        numberOfBallsByColor.isEmpty();
//        numberOfBallsByColor.putIfAbsent();
//        numberOfBallsByColor.merge();
//        numberOfBallsByColor.remove();
//        numberOfBallsByColor.remove();
//        numberOfBallsByColor.replace(); //if key exists then replace the existing with current value. it does not exists does nothing.

//        numberOfBallsByColor.replace();
//        numberOfBallsByColor.replaceAll();;
        Integer numberOfRedBalls = numberOfBallsByColor.get("red");
        System.out.println("Red Balls  "+numberOfRedBalls);
    }
    @Test
    public void creatingMapsMoreConcisely(){
        Map<String, Integer> numberOfBallsByColor = Map.of("red",3,"green",6,"blue",5);

        Map<String, Integer> moreColor = new HashMap<>();
        moreColor.put("yellow",10);
        moreColor.put("mauve",0);
        moreColor.putAll(numberOfBallsByColor);
        moreColor.put("yellow",20);

        System.out.println("Number of Colors for White Balls  "+moreColor.getOrDefault("White",0));
        System.out.println("Mauve tennis balls are present:  "+moreColor.containsKey("mauve"));
        System.out.println(" Yellow tennis balls are present:  "+moreColor.getOrDefault("yellow",0));
    }
    @Test
    public void iteratingOverMapKeys(){
        Map<String, Integer> numberOfBallsByColor = Map.of("red",3,"green",6,"blue",5);
        System.out.println("Keys = "+numberOfBallsByColor.keySet());
        printMap(numberOfBallsByColor);
             //numberOfBallsByColor.remove("red");
        printMap(numberOfBallsByColor);
//        for(String Key : numberOfBallsByColor.keySet()){
//            Integer numberOfTennisBalls = numberOfBallsByColor.get(Key);
//            System.out.println(Key +" => "+numberOfTennisBalls);
//        }
        for(Map.Entry<String,Integer> entry :numberOfBallsByColor.entrySet()){
            System.out.println(entry.getKey() +" --> "+entry.getValue());
        }

    }

    private void printMap(Map<String, Integer> numberOfBallsByColor) {
        for(Map.Entry<String, Integer> entry : numberOfBallsByColor.entrySet()){
            System.out.println(entry.getKey() + "->"+entry.getValue());
        }
    }
}
