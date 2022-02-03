package com.serenitydojo.StringCalculator;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class WhenTestingStringCalculatorTest {
    StrCalculator strCalculator = new StrCalculator();

    @Test
    public void shouldAddOrSubtractTwoOrMoreNumbers(){
        /*Number result = strCalculator.evalCalculate("1 + 2*2*2*2 - 8");
        Assertions.assertThat(result).isEqualTo(9);*/
        Number result1 = strCalculator.evalCalculate("1 + 2*2*2 - 8 + 8*8");
        Assertions.assertThat(result1).isEqualTo(65);
    }
}
