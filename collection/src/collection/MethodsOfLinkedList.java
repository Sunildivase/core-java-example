package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MethodsOfLinkedList {

    public static void main(String[] args) {

        List<String > flowers = new LinkedList<>();

        System.out.println("size of list: "+flowers.size());

        if(flowers.isEmpty()) {
            flowers.addAll(List.of("rose", "jasmin", "lotus"));
        }else{
            System.out.println("list is not empty");
        }

        System.out.println("list is updated: "+flowers);

    }
}
