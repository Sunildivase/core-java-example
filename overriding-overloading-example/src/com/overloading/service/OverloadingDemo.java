package com.overloading.service;

public class OverloadingDemo {

    public static void main(String[] args) {

        InterestCalculation interestCalculation = new InterestCalculation();

        System.out.println("interest for RS 1000 : " + interestCalculation.calculate(1000));
        System.out.println("interest for RS 1000 for 5 years: " + interestCalculation.calculate(1000,5));
        System.out.println("interest for RS 1000 for 10 years  : " +
                interestCalculation.calculate(1000,5,8.6));

    }
}
