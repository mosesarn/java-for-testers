package com.serenitydojo.FruitsChallenge;

public class ShoppingCartItem {


    private final Fruit fruit;
    private final double quantity;
    private final double totalPrice;

    public ShoppingCartItem(Fruit fruit, double quantity, double totalPrice) {
        this.fruit = fruit;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public Double getTotalCost() {
        return totalPrice;
    }
    public   Double getQuantity(){
        return quantity;
    }
    public  Fruit getFruit(){
        return fruit;
    }
}
