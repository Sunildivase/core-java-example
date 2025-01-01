package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodsOfList {

    public static void main(String[] args) {

        // creating list using arraylist class

        List<String> cities = new ArrayList<>();

        // add() method- add element to the list

        cities.add("pune");// index =0
        cities.add("mumbai");// index =1
        cities.add("delhi");// index =2

//        for(Object list : cities){
//            System.out.println("using foreach loop"+cities);
//        }

        System.out.println("list: "+cities);
        System.out.println("-----------------------------------------------------------------------");

        //get() method - random no will give output while data inside


//        cities.add("pune");// index =0
//        cities.add("mumbai");// index =1
//        cities.add("delhi");// index =2
        // start from 0 pune, 1 mumbai,2 delhi

        String mumbaiCity = cities.get(1);

        System.out.println("accessed element: "+mumbaiCity);
        System.out.println("-----------------------------------------------------------------------");

        // remove() method - to remove the data from given string

        String removedCity = cities.remove(1);
        System.out.println("removed city: "+removedCity);
        System.out.println("remaining cities: "+cities);

        System.out.println("-----------------------------------------------------------------------");

        List<String> newCityList = new ArrayList<>();

        // addall() method - we are add new lists inside existing list

        boolean isOldListAdded = Collections.addAll(cities,"jaipur","chennai");
        // here we use Collections is Class-utility class - it provides functionalities related to framework
        // collection is interface

        System.out.println("old list is: " + (isOldListAdded ? "" : "Not")+ "updated with new cities");

        System.out.println("old cities list: "+cities);

        System.out.println("------------------------------------------------------------------------");

        newCityList.addAll(cities);

        newCityList.add("bengaluru");
        System.out.println("new cities list: "+newCityList);

        System.out.println("-------------------------------------------------------------------------");



    }
}
