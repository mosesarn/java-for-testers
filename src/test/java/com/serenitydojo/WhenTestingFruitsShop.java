package com.serenitydojo;

import com.serenitydojo.FruitsChallenge.Catalog;
import com.serenitydojo.FruitsChallenge.Fruit;
import com.serenitydojo.FruitsChallenge.FruitUnAvailableException;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class WhenTestingFruitsShop {
    Catalog catalog = new Catalog();;
    @Test
    public void createANewCatalog(){
        catalog = new Catalog();
        catalog.setPrice(Fruit.Apple,4.00);
        catalog.setPrice(Fruit.Orange,5.50);
        catalog.setPrice(Fruit.Banana,6.00);
        catalog.setPrice(Fruit.Pear,4.50);
        Assertions.assertThat(catalog.getAvailableFruit()).hasSize(4); //["Apple", "Banana", "Orange", "Pear"]
    }

    @Test
    public void shouldBeAbleToUpdateTheCurrentPriceOfAFruit(){
        catalog.setPrice(Fruit.Apple,5.00);
        Assertions.assertThat(catalog.getPrice(Fruit.Apple)).isEqualTo(5.00);
    }
    @Test
    public void shouldListTheAvailableListInTheAlphabeticalOrder(){
        catalog.setPrice(Fruit.Apple,4.00);
        catalog.setPrice(Fruit.Orange,5.50);
        catalog.setPrice(Fruit.Banana,6.00);
        catalog.setPrice(Fruit.Pear,4.50);
        Assertions.assertThat(catalog.getAvailableFruit()).containsExactly("Apple", "Banana", "Orange", "Pear");
    }
    @Test
    public void shouldReturnTheCorrectPriceOfAvailableEachFurit(){
        catalog.setPrice(Fruit.Apple,6.00);
        catalog.setPrice(Fruit.Orange,3.50);
        catalog.setPrice(Fruit.Banana,2.00);
        catalog.setPrice(Fruit.Pear,1.50);
        Assertions.assertThat(catalog.getPrice(Fruit.Apple)).isEqualTo(6.00);
        Assertions.assertThat(catalog.getPrice(Fruit.Orange)).isEqualTo(3.50);
        Assertions.assertThat(catalog.getPrice(Fruit.Banana)).isEqualTo(2.00);
        Assertions.assertThat(catalog.getPrice(Fruit.Pear)).isEqualTo(1.50);
    }
    @Test(expected = FruitUnAvailableException.class)
    public void shouldReportAnExceptionIfAFruitIsNotAvailable(){
        catalog.getPrice(Fruit.Apple);
    }
       }
