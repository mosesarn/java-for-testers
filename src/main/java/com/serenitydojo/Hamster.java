package com.serenitydojo;

public class Hamster extends Pet {
private String favouriteGame;
    final static String HAMSTER_PLAY = "plays with string";
    public Hamster(String name, int age, String favouriteGame) {
        super(name, age);
        this.favouriteGame = favouriteGame;
    }

    public String getFavouriteGame() {
        return favouriteGame;
    }

    @Override
    public String makeNoise(){
        return "Squeak";
    }

    @Override
    public String play() {
        return HAMSTER_PLAY;
    }
}
