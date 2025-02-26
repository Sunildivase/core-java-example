package lambdaExpression;

public class InterestCalculatorDemo {

    public static void main(String[] args) {

//        InterestCalculator interestCalculator = new InterestCalculatorImpl();

       InterestCalculator interestCalculator = (principalAmount,interestRate,years)->
             principalAmount*(interestRate/100)*years;

       double calculatedValue = interestCalculator.calculate(100000,9.6,3);
        System.out.println("calculated interest value: "+ calculatedValue);
    }
}
