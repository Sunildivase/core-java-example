package functionalInterface;

public class FunctionalInterfaceDemo {

    // interface that holds only one method.
    // if we create two or more methods here it will throw an error
    // we will use @functionalInterface

    public static void main(String[] args) {

       InterestCalculator interestCalculator = new InterestCalculateImpl();
       interestCalculator.calculate(10000,8.5,2);
    }

}
