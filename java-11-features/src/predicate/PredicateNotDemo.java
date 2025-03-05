package predicate;

import java.util.function.Predicate;

public class PredicateNotDemo {

    public static void main(String[] args) {

        Predicate<Integer> noIsGreaterThan100 = (no)-> no >100;
        System.out.println("number is greater than 100 or not: "+noIsGreaterThan100.test(125));
        System.out.println("number is greater than 100 or not: "+noIsGreaterThan100.test(20));

        Predicate<String > isStringContainsZero = (input) -> input.contains("0");

        System.out.println("is string contains zero:"+isStringContainsZero.test("0pune"));

        Predicate<String> isStringNotContainsZero = Predicate.not(isStringContainsZero);
        System.out.println("is string NOT contains zero: "+isStringNotContainsZero.test("0pune"));

        // logical output--> not + not = false


    }
}
