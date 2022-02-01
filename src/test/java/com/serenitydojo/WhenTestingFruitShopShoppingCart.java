package com.serenitydojo;

import com.serenitydojo.FruitsChallenge.Catalog;
import com.serenitydojo.FruitsChallenge.Fruit;
import com.serenitydojo.FruitsChallenge.ShoppingCart;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class WhenTestingFruitShopShoppingCart {
    private Catalog catalog = new Catalog();
    private ShoppingCart shoppingCart;


    @Before
    public void setupCatalog(){
        catalog.setPrice(Fruit.Apple,4.00);
        catalog.setPrice(Fruit.Orange,5.50);
        catalog.setPrice(Fruit.Banana,6.00);
        catalog.setPrice(Fruit.Pear,4.50);
        shoppingCart = new ShoppingCart(catalog);
    }

    @Test
    public void shouldStarWithNoItems(){
        Assertions.assertThat(shoppingCart.getItems()).isEmpty();
    }
    @Test
    public void itemAddedToTheCart(){
        shoppingCart.add(3.0).kilosOf(Fruit.Apple);
        shoppingCart.add(3.0).kilosOf(Fruit.Orange);
        Assertions.assertThat(shoppingCart.getItems()).hasSize(2);
    }
    @Test
    public void shouldUseTheCatalogToCalculateThePriceOfItemsAddedToTheCart(){
        catalog.setPrice(Fruit.Apple,2.00);
        catalog.setPrice(Fruit.Orange,1.50);
        catalog.setPrice(Fruit.Banana,3.00);
        shoppingCart.add(1.00).kilosOf(Fruit.Apple);
       shoppingCart.add(1.00).kilosOf(Fruit.Orange);
//        shoppingCart.add(1.0).kilosOf(Fruit.Banana);
        Assertions.assertThat(shoppingCart.getTotalPrice()).isLessThanOrEqualTo(3.5);
    }
    @Test
    public void shouldKeepTrackOfTheTotalPrice(){
        catalog.setPrice(Fruit.Banana,3.00);
        shoppingCart.add(1.00).kilosOf(Fruit.Banana);
        Assertions.assertThat(shoppingCart.get).isLessThanOrEqualTo(3.5);

    }
}
