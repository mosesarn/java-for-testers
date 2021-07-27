package com.serenitydojo;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class WhenAddingNumbers {

    @Test
    public void shouldAddTwoIntegersCorrectly(){
        int a =1;
        int b =2;
        int sum = a+b;
        String color = "red";
        String otherColor = "Red";
        String colors = "Red,Green,Blue";
        assertEquals(sum,3);
        assertThat(sum).isBetween(1,10);
        assertThat(color).isEqualToIgnoringCase(otherColor);
        assertThat(colors).contains("Green");
        assertThat(colors).containsPattern("[g|G]reen");
    }
    @Test
    public void collectionsAssetrions(){
        List<String> colors = Arrays.asList("green","red","blue");
        assertThat(colors).hasSize(3);
        assertThat(colors).contains("green");
        assertThat(colors).containsExactly("green","red","blue");
        assertThat(colors).containsExactlyInAnyOrder("blue","green","red");
        assertThat(colors).doesNotContain("yellow");
    }
}
