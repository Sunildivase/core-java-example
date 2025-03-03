package lambdaWithLocalVariable;

public class LambdaWithLocalVariableDemo {

    public static void main(String[] args) {



    Interest interest = (principleAmount, interestRate) -> {

        int years = 10;

        return principleAmount * (interestRate / 100) * years;
    };

    double value = interest.calculate(1000,8.5);

        System.out.println("interest value: "+value);

    }
}
