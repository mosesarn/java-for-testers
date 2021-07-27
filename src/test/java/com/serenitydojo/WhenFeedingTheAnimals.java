package com.serenitydojo;

import com.serenitydojo.model.AnimalType;
import com.serenitydojo.model.Feeder;
import com.serenitydojo.model.FoodType;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.serenitydojo.model.AnimalType.*;// Alt+Enter static import select.
import static com.serenitydojo.model.FoodType.*;

public class WhenFeedingTheAnimals {

    @Test
    public void shouldFeedCatsTuna()
    {
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(CAT, false);
        System.out.println(food);
        Assert.assertEquals(food, TUNA);
    }
    @Test
    public void shouldFeedHamstersCabbage()
    {
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(HAMSTER, false);
        System.out.println(food);
        Assert.assertEquals(food, CABBAGE);
    }
    @Test
    public void shouldFeedDogsDogFood()
    {
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(DOG, false);
        System.out.println(food);
        Assert.assertEquals(food, DOG_FOOD);
    }
    @Test
    public void shouldFeedPremiumCatsPremiumFood()
    {
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(CAT, false);
        System.out.println(food);
        Assert.assertEquals(food, TUNA);
    }
    @Test
    public void listOfColors(){
        String[] color = {"red","green","blue","white"};

        String[]  moreColors = new String[3];
        moreColors[0] = "yellow";
        moreColors[1] = "purple";
        moreColors[2] = "black";
        //System.out.println("First Color:  "+moreColors[0]);
        for(int i=0;i<moreColors.length;i++){
            //System.out.println("more colors:  "+moreColors[i]);
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
        for(String someColor : myColors){
            System.out.println(someColor);
        }
    }
}
