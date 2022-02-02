package com.serenitydojo.FruitsChallenge;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class WhenTestingFruitShopShoppingCart {
    private final Catalog catalog = new Catalog();
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
        catalog.setPrice(Fruit.Apple,2.00);
        shoppingCart.add(2.0).kilosOf(Fruit.Banana);
        shoppingCart.add(2.0).kilosOf(Fruit.Apple);
        Assertions.assertThat(shoppingCart.getTotalPrice()).isEqualTo(10.00);

    }
    @Test
    public void shouldGiveBuilkDiscounts(){
        shoppingCart.add(10.0).kilosOf(Fruit.Banana);// 6
        Assertions.assertThat(shoppingCart.getTotalPrice()).isEqualTo(54.00);
    }
    @Test
    public void shouldGiveDiscountsOnlyApplyToQuantitiesOverFiveKgs(){
        shoppingCart.add(10.0).kilosOf(Fruit.Banana);// 6
        shoppingCart.add(2.0).kilosOf(Fruit.Apple);// 4
        Assertions.assertThat(shoppingCart.getTotalPrice()).isEqualTo(62.00);
    }
}
