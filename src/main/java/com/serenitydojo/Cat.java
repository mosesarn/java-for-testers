package com.serenitydojo;


public class Cat extends Pet {

    private String favouriteFood;

final static String CAT_NOISE = "Meow";
    final static String CAT_PLAY = "plays with string";

public Cat(String name, int age){
    super(name, age); // this is same as  - new Pet(name, age)

    this.favouriteFood = usualFood();
}
    public Cat(String name, String favouriteFood, int age) {
        super(name, age);
        this.favouriteFood = favouriteFood;

    }

    public static String usualFood(){
        return "Tuna";
    }


    public String getFavouriteFood() {
        return favouriteFood;
    }
    @Override
    public String makeNoise() {
        return CAT_NOISE;
    }

    @Override
    public String play() {
        return CAT_PLAY;
    }

    public void feed(String food) {
        System.out.println(getName()+ "  eats some"+ food);
    }
    public void groom() {
        lickPaws();
        cleanFur();
    }
    private void cleanFur() {
        System.out.println(getName()+ " "+""+"cleans his fur");
    }
    private void lickPaws() {
        System.out.println(getName()+ " "+""+"licks his paws");
    }
}
