package com.serenitydojo.MosesBanking;

public class InterestYieldingBonds implements BearingInterest {

    private double value;
    private double interestRate;

    public InterestYieldingBonds(double value, double interestRate) {

        this.value = value;
        this.interestRate = interestRate;
    }
    @Override
    public double calculateMonthlyInterest(){
        return value * interestRate / 12;
    }
}
