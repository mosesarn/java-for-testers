package com.serenitydojo.FruitsChallenge;

class ShoppingCartItem {

    private static  Fruit fruit;
    private static  double quantity;
    private static  double totalPrice;

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
