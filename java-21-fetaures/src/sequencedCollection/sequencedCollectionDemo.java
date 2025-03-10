package sequencedCollection;

import java.util.ArrayList;
import java.util.List;

public class sequencedCollectionDemo {

    public static void main(String[] args) {


        List<String>  fruits = new ArrayList<>();

        fruits.add("banana");
        fruits.add("watermelon");
        fruits.add("apple");

        System.out.println("original collection: "+fruits);

        fruits.addFirst("cherry");
        System.out.println("add first value: "+fruits);

        fruits.addLast("carrot");
        System.out.println("last added value: "+fruits);

        String firstFruit = fruits.getFirst();
        System.out.println("only first value from list: "+firstFruit);

        String lastFruit = fruits.getLast();
        System.out.println("last value from list: "+lastFruit);

        fruits.removeFirst();
        System.out.println("first value removed from list: "+fruits);

        fruits.removeLast();
        System.out.println("last value removed from list: "+fruits);


    }
}
