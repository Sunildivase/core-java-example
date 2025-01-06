package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    // redundant data will call by using key and data will manage by tabular form
    // data identify by using of key pair

    public static void main(String[] args) {

        Map<Integer,String> testMap = new HashMap<>();

        //put() method:-this will add the objects.

        testMap.put(1,"pune");
        testMap.put(2,"mumbai");
        testMap.put(3,"kolkata");

        System.out.println("without duplicate: "+testMap);
        //pune will replace by second value as assign the value twice
        testMap.put(1,"mumbai");
        testMap.put(2,"nashik");

        System.out.println("duplicate map list: "+testMap);

        System.out.println("----------------------------------------------------------------");

        //get() method:-it will retrieve data for particular id;

        System.out.println("get output: " +testMap.get(1));

        System.out.println("--------------------------------------------------------------------");

        //size() method:- it will give the how many data inside the collection

        System.out.println("size of collection: "+testMap.size());

        System.out.println("-----------------------------------------------------------------------");

        //containsKey() method:- will check if key is present/not

        if(testMap.containsKey(2)) {
            System.out.println("key is present");
        }else {
            System.out.println("key is not present");
        }

        System.out.println("-----------------------------------------------------------------------");

        //containsValue() method:-

        if(testMap.containsValue("mumbai")){
            System.out.println("value is present");
        }
        else{
            System.out.println("value is not present");
        }
        System.out.println();

        System.out.println("------------------------------------------------------------------------");

        //keySet() method:- retrieves set of keys

        System.out.println("set<key>: "+testMap.keySet());

        System.out.println("-------------------------------------------------------------------------");

        //values() method:- retrieves value set

        System.out.println("values: "+testMap.values());

        System.out.println("-------------------------------------------------------------------------");

        //entrySet() method:- retrieves set of key value pair

        Set<Map.Entry<Integer,String>> entrySet = testMap.entrySet();
        for(Map.Entry<Integer,String> entry: entrySet){
            System.out.println("key: "+entry.getKey() +"| value: "+entry.getValue());
        }

        System.out.println("--------------------------------------------------------------------------");

        //putAll() method:-

         Map<Integer, String> cities =  Map.of(4,"jammu",5,"chennai");
         testMap.putAll(cities);
         System.out.println("after putAll(): "+ testMap);

        System.out.println("--------------------------------------------------------------------------");

        //remove() method:-it will remove data from list

        System.out.println("removed value: "+testMap.remove(1));
        System.out.println("remailning value: "+testMap);

        System.out.println("--------------------------------------------------------------------------");

        //clear() method:- it will clear all records

        System.out.println("before clear value: "+ testMap);
        System.out.println("size: "+testMap.size());
        testMap.clear();
        System.out.println("after clear value: "+testMap);
        System.out.println("size: "+testMap.size());


    }
}
