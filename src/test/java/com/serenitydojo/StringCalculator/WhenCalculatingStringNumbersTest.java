package com.serenitydojo.StringCalculator;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class WhenCalculatingStringNumbersTest {
    Calculator calculator = new Calculator();
    @Test
    public void shouldReturnANumericalValueOfAInteger(){
        String theGivenNumber = "10 + 12";
        Calculator calculator = new Calculator();

        Number result = calculator.evaluate("10");

       Assertions.assertThat(result).isEqualTo(2);

    }
    @Test
    public void shouldReturnALargeInteger(){
        String theGivenNumber = "10 + 12";
        Calculator calculator = new Calculator();

        Number result = calculator.evaluate("1116");

        Assertions.assertThat(result).isEqualTo(1116);
    }
    @Test
    public void shouldCopeWithSurroundingWhiteSpaces(){
        Number result = calculator.evaluate("  1116  ");

        Assertions.assertThat(result).isEqualTo(1116);
    }
    @Test
    public void shouldCopeWithSpecialCharacters(){
        Number result = calculator.evaluate("  $ 1116  ");

        Assertions.assertThat(result).isEqualTo(1116);
    }
    @Test
    public void shouldAddNumbersTogether(){
        Number result = calculator.evaluate("  $ 1 + 2  ");

        Assertions.assertThat(result).isEqualTo(3);
    }
    @Test
    public void shouldAddThreeNumbersTogether(){
        Number result = calculator.evaluate("  $ 1 + 2 - 3 ");

        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void shouldCalculateStringExpression(){
        StringCalExpression stringCalExpression = new StringCalExpression();
        Integer result = stringCalExpression.calculateStringExpression("12 + 2 * 2 * 2 *2 -8");
        Assertions.assertThat(result).isEqualTo(20);
    }
}
