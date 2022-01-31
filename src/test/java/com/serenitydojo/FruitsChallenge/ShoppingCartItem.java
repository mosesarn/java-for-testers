package com.serenitydojo.FruitsChallenge;

public class ShoppingCartItem {
private Fruit fruit;
private Double quantity;
private Double totalCost;

    public ShoppingCartItem(Fruit fruit, Double quantity, double totalCost) {
        this.fruit = fruit;
        this.quantity = quantity;
        this.totalCost = totalCost;
    }

    public double getTotalCost() {
        return totalCost;
    }
}
