package com.serenitydojo.LamdaDeepDrivePeople;

public class Person {
    public enum Gender{MALE,FEMALE}
    String name;
    Gender gender;
    int age;
    String favouriteColor;
    int points;

    public Person(String name, Gender gender, int age, String favouriteColor) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.favouriteColor = favouriteColor;
        this.points=0;
    }
    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFavouriteColor() {
        return favouriteColor;
    }

    public int getPoints() {
        return points;
    }
    public void earnPoints(int earnPoints){
        points = points +earnPoints;
    }
}
