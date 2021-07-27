package com.serenitydojo.MosesBanking;

public class SavingsAccount extends Account implements BearingInterest {
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        this.interestRate = interestRate;
        setBalance(initialBalance);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double calculateMonthlyInterest(){
        return interestRate * getBalance() / 12 ;
    }


}
