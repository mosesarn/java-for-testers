package com.serenitydojo.RecordsPatternSwitchesAndVarKeyWord;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class WhenWorkingWithVar {
    String color = "Red";

    /**
     * 1. we have to initialize the value of a variable in var keyword. var age = 0l; or
     * 2. var can be used in the context of a local variable. within the methods.
     * 3.
     */
    @Test
    public void itShouldWorkWithStrings(){
        var name = "Moses";
        var firstName  = name;
        Assertions.assertThat(firstName).isEqualTo(name);

        List<String> names = Arrays.asList("Moses","Darla","Arnold");
        var colors = Arrays.asList("Red","Blue","Green","Yellow");

    }
}
