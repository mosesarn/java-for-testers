package com.serenitydojo.FruitsChallenge;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final Catalog catalog;
    private final List<ShoppingCartItem> items;


    public ShoppingCart(Catalog catalog, List<ShoppingCartItem> items) {
        this.catalog = catalog;
        this.items = new ArrayList<>();
    }


   //get list of Items in the cart
    public List<ShoppingCartItem> getItems(){
        return new ArrayList<>(items);
    }
    // Get Total Price of ShoppingCartItems
    public Double getTotalPrice(){
        return items.stream().mapToDouble(ShoppingCartItem::getTotalCost).sum();
    }
}
