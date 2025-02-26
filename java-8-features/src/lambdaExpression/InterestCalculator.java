package lambdaExpression;

@FunctionalInterface
public interface InterestCalculator {
    double calculate(int principalAmount,double interestRate,int years);
}
