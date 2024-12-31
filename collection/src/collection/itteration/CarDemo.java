package collection.itteration;

import java.util.*;

public class CarDemo {

    private  Map<Integer, Car> myCarMap  = new HashMap<>();

//    private static int counter =0;

    public static void main(String[] args) {

        Car nexon = new Car();
        nexon.brand = "tata";
        nexon.model = "xz+";
        nexon.mfgYear = 2023;


        Car honda = new Car();
        honda.brand = "amaze";
        honda.model = "premium";
        honda.mfgYear = 2024;

        Car tesla = new Car();
        tesla.brand = "y";
        tesla.model = "premium";
        tesla.mfgYear = 2024;

        List<Car> mycars = new ArrayList<>();
        mycars.add(nexon);
        mycars.add(honda);
        mycars.add(tesla);
        mycars.add(tesla);


        System.out.println("list result "+mycars);

        Set<Car> mycarlist = new HashSet<>();
        mycarlist.add(nexon);
        mycarlist.add(honda);
        mycarlist.add(tesla);
        mycarlist.add(tesla);


        System.out.println("set result: "+mycarlist);
    }

//    public Map<Integer, Car> getMyCarMap() {
//        return myCarMap;
//    }
//
//    public void setMyCarMap(Map<Integer, Car> myCarMap) {
//        this.myCarMap = myCarMap;
//    }

//        addCars(nexon , honda , tesla);
//        for(Map.Entry<Integer , Car> carEntry : myCarMap.entrySet()){
//            System.out.println("I have this car: with carId as "+ carEntry.getKey() + "And" );
//        }
//    }
//    public static void addCars(Car... cars){
//
//
//        for (Car car : cars){
//
//            myCarMap.put(++counter , car);
//
//        }
    }


