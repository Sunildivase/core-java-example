package collection.map;

import java.util.HashMap;
import java.util.Map;

public class WorkingMethodsOfPutAndGet {

    public static void main(String[] args) {

        Map<Integer,String > testCities = new HashMap<>();
        testCities.put(1,"mumbai");

        System.out.println("cities: "+testCities);


        //internal working of put/get in hashcode

        //equal() and hashcode() method:-

        //put() method:-
        testCities.put(1,"Delhi");
        System.out.println("replaced city: "+testCities);
        // step 1: for key 1: java will generate HashCode()
        // hashcode of 1 : AAasfg@7756

        //step 2 : we check generated hashcode bucket (keys)

        //step 3: if hashcode matches-
            //check the actual key using equal() methods(1==1)
            // if key matches then value will get replaced
        //else
        // insert value

        //get() method:-

        testCities.get(1);
        // step 1: for key 1: java will generate HashCode()
        // hashcode of 1 : AAasfg@7756

        //step 2 : we check generated hashcode bucket (keys)

        //step 3: if hashcode matches-
        //check the actual key using equals() methods(1==1)
        // if matches then return value

        //hashcode-alpha numeric value
    }
}
