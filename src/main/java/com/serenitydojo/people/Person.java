package com.serenitydojo.people;

public class Person {

    String name;
    public enum GENDER {MALE,FEMALE}
    com.serenitydojo.LamdaDeepDrivePeople.Person.Gender gender;
    int age;
    String favouriteColor;
    public Person(String name, com.serenitydojo.LamdaDeepDrivePeople.Person.Gender gender, int age, String favouriteColor) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.favouriteColor = favouriteColor;
    }

    public String getName() {
        return name;
    }

    public com.serenitydojo.LamdaDeepDrivePeople.Person.Gender getGender() {
        return gender;
    }

    public String getFavouriteColor() {
        return favouriteColor;
    }

    @Override
    public String toString() {
        return name;
    }
}

