package predicate;

import java.util.function.Predicate;

public class PredicateDemo {

    // when we use predicate don't need to create object and interface as well

    public static void main(String[] args) {

        Predicate<Integer> noGreaterThan = (no) -> no > 100;

        System.out.println("no is greater than 100:"+noGreaterThan.test(125));

        Predicate<String > isStringContainsZero = (input) -> input.contains("0");

        System.out.println("is string contains zero:"+isStringContainsZero.test("0pune"));
        System.out.println("is string contains zero:"+isStringContainsZero.test("mumbai"));
        System.out.println("is string contains zero:"+isStringContainsZero.test("del0hi"));
    }

    // old-fashioned-code

//    public boolean noGreaterThan(int no){
//        return no > 100;
//    }

//    public boolean isStringContainsZero(String input){
//        return input.contains("0");
//    }

}
