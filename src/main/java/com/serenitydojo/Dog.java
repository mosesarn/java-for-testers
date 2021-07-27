package com.serenitydojo;



public class Dog extends Pet {

    private String favouriteToy;
    private int age;

    public Dog(String name, String favouriteToy, int age) {
       super(name, age);
        this.favouriteToy = favouriteToy;
    }

    public String getFavouriteToy() {
        return favouriteToy;
    }
    @Override
    public String makeNoise() {
        return "Woof Woof";
    }

    @Override
    public String play() {
        return "plays with bone";
    }
}
