package com.serenitydojo.FruitsChallenge;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Catalog {
   private Map<Fruit,Double> pricePerKilo = new HashMap<>();



    //List of Available Fruits.
    public List<String> getAvailableFruit(){
        return pricePerKilo.keySet()
                .stream()
                .map(Enum::name)
                .sorted()
                .collect(Collectors.toList());
    }
    //get the price of a fruit.
    public Double getPrice(Fruit fruit){
        if(pricePerKilo.containsKey(fruit)){
           return pricePerKilo.get(fruit);
        }
        throw new FruitUnAvailableException(fruit.name() +" currently Unavailable");
    }

    //Set the price of a Fruit
    public void setPrice(Fruit fruit,Double price){
         pricePerKilo.put(fruit, price);
    }
}
