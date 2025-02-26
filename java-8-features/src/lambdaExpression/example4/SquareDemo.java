package lambdaExpression.example4;

public class SquareDemo {

    public static void main(String[] args) {

        Square square = (value)-> value * value;
        System.out.println("square of value 5: "+square.calculate(5));
        System.out.println("square of value 13: "+square.calculate(13));

    }

}
interface Square {
    int calculate(int value);
}
