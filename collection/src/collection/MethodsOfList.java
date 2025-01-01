package collection;

import java.util.*;

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
        newCityList.add("kolkata");
        System.out.println("new cities list: "+newCityList);

        System.out.println("-------------------------------------------------------------------------");

       // contains() method - check the value inside list

        if (newCityList.contains("navi mumbai")){
            System.out.println("jaipur is inside the list");
        }
        else {
            System.out.println("navi mumbai is not inside list");
        }

        System.out.println("------------------------------------------------------------------------");

        // size() method - it returns length of lists

        newCityList.add("jharkhand");
        System.out.println("size of new city list: "+newCityList.size());
        System.out.println("------------------------------------------------------------------------");

       // iterator() method - iterator returns object that can be used to subsequently access element

        Iterator<String > citiesIterator = newCityList.iterator();
        while(citiesIterator.hasNext()){
            System.out.println("next element in newCityList: "+citiesIterator.next());
        }

        System.out.println("-----------------------------------------------------------------------");


        // hasnext - true and print data forward direction

        // if we want backward direction data by using ListIterator

        //listIterator() method - iterator returns object that can be used to subsequently access element


        ListIterator<String> citiesListIterator = newCityList.listIterator();
        while(citiesListIterator.hasNext()){
            System.out.println("next element in newCityList using citiesListIterator :"+citiesListIterator.next());
        }
        System.out.println("-----------------------");
        while (citiesListIterator.hasPrevious()){
            System.out.println("previous element in newCityList using citiesListIterator :"+citiesListIterator.previous());
        }

        System.out.println("----------------------------------------------------------------------------------");

        // for each example

        System.out.println("using for each loop");
        for(String city : newCityList){
            System.out.println("next city :"+city);
        }
        System.out.println("-----------------------------------------------------------------------------");

        //toArray() method - converts a list in array

        String []citiesArray = newCityList.toArray(new String[newCityList.size()]);
        for(String city : citiesArray){
            System.out.println("conversion of array: "+city);
        }
        System.out.println("------------------------------------------------------------------------------");

        //removeAll() method - remove all elements from list
        System.out.println("before remove list: cities list "+cities);
        System.out.println("before remove list : new cities list: "+ newCityList);
        System.out.println("after remove all elements: "+newCityList.removeAll(cities));
        System.out.println("remaining city list: "+newCityList);
        System.out.println("---------------------------------------------------------------------------");

        // clear() method - remove all elements from list more efficient than the removeAll()

        System.out.println("size of new cities before clear: "+newCityList.size());
        newCityList.clear();
        System.out.println("size of city after clear: "+newCityList.size());

        System.out.println("---------------------------------------------------------------------------");

    }


}
