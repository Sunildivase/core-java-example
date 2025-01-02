package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    // redundant data will call by using key and data will manage by tabular form
    // data identify by using of key pair

    public static void main(String[] args) {

        Map<Integer,String> testMap = new HashMap<>();

        testMap.put(1,"pune");
        testMap.put(2,"mumbai");

        System.out.println("without duplicate: "+testMap);
        //pune will replace by second value as assign the value twice
        testMap.put(1,"mumbai");

        System.out.println("duplicate map list: "+testMap);

    }
}
