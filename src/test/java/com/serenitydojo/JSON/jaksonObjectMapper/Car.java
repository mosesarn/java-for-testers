package com.serenitydojo.JSON.jaksonObjectMapper;

public class Car {
    private String Brand = null;
    private int Doors = 0;
    public Car(String brand, int doors) {
        Brand = brand;
        Doors = doors;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getDoors() {
        return Doors;
    }

    public void setDoors(int doors) {
        Doors = doors;
    }
}
