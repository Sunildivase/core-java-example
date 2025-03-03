package lambdaWithLocalVariable;

public class InterestCalculate implements Interest {
    @Override
    public Double calculate(int principleAmount, double interestRate) {
        return principleAmount * (interestRate/100);
    }
}
