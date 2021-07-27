package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;
import static com.serenitydojo.Cat.usualFood;
public class WhenCreatingObjects {

    @Test
    public void creating_a_cat(){
        String name = "Felix";
        String favouriteFood = "Tune";
        int age = 4;
        Cat felix = new Cat("Felix","Beef",4);
        // Alt+Enter to create a cat class
        System.out.println(felix.getName());
        System.out.println(felix.getFavouriteFood());
        System.out.println(felix.getAge());
        //felix.setAge(4);

        Cat spot = new Cat("Spot", "Chicken",3);
        System.out.println(spot.getAge());

    }

    @Test
    public void creating_a_Dog(){
        Dog dog = new Dog("Fido","Bone",5);
        Assert.assertEquals(dog.getName(),"Fido");
        Assert.assertEquals(dog.getFavouriteToy(),"Bone");
        Assert.assertEquals(dog.getAge(),5);
    }
    @Test
    public void Creating_a_Hamster(){
        Hamster hamster = new Hamster("Rusty",1,"Wheel");
        Assert.assertEquals(hamster.getName(), "Rusty");
        Assert.assertEquals(hamster.getAge(), 1);
        Assert.assertEquals(hamster.getFavouriteGame(), "Wheel");
    }

    @Test
    public void Cat_makes_Noise(){
        Cat felix = new Cat("Felix","Beef",4);


        felix.makeNoise();
        felix.feed("Tuna");
        felix.groom();

        System.out.println("Felix's makes noise"+ felix.makeNoise());

        System.out.println("Felix's Favourite usual food = "+ usualFood());
    }
    @Test
    public void dogs_makes_noise(){
        Dog spot = new Dog("Spot", "Chicken",3);
        System.out.println("spot makes noise  "+ spot.makeNoise());
    }
    @Test
    public void pets_makes_noise(){
        Pet felix = new Cat("Felix","Beef",4);
        Pet spot = new Dog("Spot", "Chicken",3);
        Pet hamster = new Hamster("Rusty",1,"Wheel");

        System.out.println("Felix's makes noise  "+ felix.makeNoise());
        System.out.println("Felix's go for walk  "+ felix.goForWalk());
        System.out.println("-------------");
        System.out.println("spot makes noise  "+ spot.makeNoise());
        System.out.println("spot go for walk  "+ spot.goForWalk());
        System.out.println("-------------");
        System.out.println("hamster makes noise  "+ hamster.makeNoise());
        System.out.println("hamster go for walk  "+ hamster.goForWalk());
        System.out.println("-------------");
    }

    @Test
    public void pets_can_play(){
        Pet felix = new Cat("Felix","Beef",4);
        Pet spot = new Dog("Spot", "Chicken",3);
        Pet hamster = new Hamster("Rusty",1,"Wheel");

        System.out.println("Felix's   "+ felix.play());
        System.out.println("-------------");
        System.out.println("spot  "+ spot.play());
        System.out.println("-------------");
        System.out.println("hamster  "+ hamster.play());
        System.out.println("-------------");

    }

}
