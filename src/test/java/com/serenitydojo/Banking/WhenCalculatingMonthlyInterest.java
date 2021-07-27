package com.serenitydojo.Banking;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenCalculatingMonthlyInterest {
    @Test
    public void shouldCalculateInterestForSavingsAccount(){
       // Given
        SavingsAccount savingsAccount = new SavingsAccount(1200.00,0.01);
        savingsAccount.setBalance(1200);
        savingsAccount.setInterestRate(0.01);
        //When
        double earnedInterest = savingsAccount.calculateMonthlyInterest();

        //then
     assertThat(earnedInterest).isEqualTo(1.0);
    }
    @Test
    public void shouldCalculateInterestForBonds(){
// Given
        InterestYieldingBonds Bonds = new InterestYieldingBonds(1200.00, 0.01);
        //When
        double earnedInterest = Bonds.calculateMonthlyInterest();
        //Then
        assertThat(earnedInterest).isEqualTo(100.0);
    }
    @Test
    public void shouldCalculateInterestEarnedInPortfolio(){
        //Given
        Portfolio portfolio = new Portfolio();
        portfolio.add(new SavingsAccount(1200.00,0.01));
        portfolio.add(new InterestYieldingBonds(1200.00,0.01));
        //When
        double totalEarnedInterest = portfolio.calculateMonthlyInterest();
        //Then
        assertThat(totalEarnedInterest).isEqualTo(101.0);
    }

}
