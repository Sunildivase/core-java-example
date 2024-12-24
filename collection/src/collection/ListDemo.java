package collection;

import java.util.ArrayList;

public class ListDemo {

    public static void main(String[] args) {

        String city = " pune";
        String[] cities = new String[3];
        cities[0] = "pune";
        cities[1] = "mumbai";
        // cities [2]=1000;  it gives error cause of array is homogeneous static size of data
        // cities [3] =10.30f;
        // String[] cities = {"pune","mumbai"};

        ArrayList citylist = new ArrayList();

        // here array takes hetrogeneous size of data cause its collection
        // generics :- used for datatype validation

        citylist.add("pune");
        citylist.add("mumbai");
        citylist.add(100);
        citylist.add(1.30f);
        citylist.add(848.587d);
        citylist.add(true);
        citylist.add(5446655);

        System.out.println("city: " + city);
        System.out.println("cities: " + cities);


        ArrayList<String> cityGenericsList = new ArrayList<>();

        // Arraylist :- it takes duplicate records.
        // Arraylist stores only object with generics for entering correct data

        cityGenericsList.add("pune");
        cityGenericsList.add("mumbai");
        cityGenericsList.add("pune");

//        cityGenericsList.add(100);
//        cityGenericsList.add(1.30f);
//        cityGenericsList.add(848.587d);
//        cityGenericsList.add(true);
//        cityGenericsList.add(5446655);

        System.out.println("citylist: " + cityGenericsList);
    }
}
