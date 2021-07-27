package com.serenitydojo.MosesBanking;

import com.serenitydojo.Banking.Portfolio;
import org.assertj.core.api.Assertions;
import org.junit.Test;

 public class WhenCalculatingMonthelyInterest {

    @Test
    public void shouldCalculateMonthlySavingsInterest(){
        SavingsAccount savingsAccount = new SavingsAccount(2100,0.01);
        //savingsAccount.setBalance(1200.00);
        //savingsAccount.setInterestRate(0.01);
        double earnedInterest = savingsAccount.calculateMonthlyInterest();
        Assertions.assertThat(earnedInterest).isEqualTo(1.0);
    }

    @Test
     public void shouldCalculateMonthlycheckingsInterest(){
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setOverDraft(300.00);
        double overDraft = checkingAccount.getOverDraft();
        Assertions.assertThat(overDraft).isEqualTo(30);
    }
     @Test
     public void shouldCalculateBondsInterest(){
         InterestYieldingBonds bonds = new InterestYieldingBonds(1200.00,0.01);
        double earnedInterest =  bonds.calculateMonthlyInterest();
         Assertions.assertThat(earnedInterest).isEqualTo(1.00);
     }
     @Test
     public void shouldCalculatePortfolioInterest(){
        Portfolio1 portfolio = new Portfolio1();
        portfolio.add(new SavingsAccount(1200,0.01));
         portfolio.add(new InterestYieldingBonds(1200.00,0.01));
   double earnedInterest = portfolio.calculateMonthlyInterest();
         Assertions.assertThat(earnedInterest).isEqualTo(2.00);
     }
}
