package lambdaExpression.example1;

@FunctionalInterface
public interface InterestCalculator {
    double calculate(int principalAmount,double interestRate,int years);
}
