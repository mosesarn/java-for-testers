package com.serenitydojo.FruitsChallenge;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final Catalog catalog;
    private final List<ShoppingCartItem> items;
    //private Double quantity;

    public ShoppingCart(Catalog catalog) {
        this.catalog = catalog;
        this.items = new ArrayList<>();
    }
public ShoppingCartAdder add(Double quantity){

    return new ShoppingCartAdder(this, quantity);
}

   //get list of Items in the cart
    public List<ShoppingCartItem> getItems(){
        return new ArrayList<>(items);
    }
    // Get Total Price of ShoppingCartItems
    public Double getTotalPrice(){
        return items.stream().mapToDouble(ShoppingCartItem -> ShoppingCartItem.getTotalCost()).sum();
    }

    public class ShoppingCartAdder {
        private final ShoppingCart shoppingCart;
        //private double amount;
        private final double quantity;


        public ShoppingCartAdder(ShoppingCart shoppingCart,Double quantity){
            this.shoppingCart = shoppingCart;
            this.quantity= quantity;
        }

        public ShoppingCart kilosOf(Fruit fruit){
            double basePrice = shoppingCart.catalog.getPrice(fruit);
            double discountedPrice = (quantity >= 5) ? basePrice * 0.9 : basePrice;
            ShoppingCartItem item = new ShoppingCartItem(fruit, quantity,discountedPrice * quantity);
            shoppingCart.items.add(item);
            return shoppingCart;
        }
    }
}
