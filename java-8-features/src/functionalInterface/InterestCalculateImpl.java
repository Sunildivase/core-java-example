package functionalInterface;

public class InterestCalculateImpl implements InterestCalculator {
    @Override
    public double calculate(int principalAmount, double interestRate, int years) {
       double calculatedValue = principalAmount*(interestRate/100)*years;
        System.out.println("returnable amount: "+calculatedValue);
        return calculatedValue;
    }


}
