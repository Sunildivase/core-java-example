package streamApi.example1;

import java.util.*;

public class StreamDemo {

    public static void main(String[] args) {

        StreamDemo streamDemo = new StreamDemo();

       List<Product> products = streamDemo.generateListData();



    // without stream

    List<Float> productPriceList = new ArrayList<>();

   for(Product product: products)
        // filtering data of list
        if(product.price()>35999){
            productPriceList.add(product.price()); // adding price of products to list
        }

          System.out.println("list without streams: "+productPriceList);

        // using streams
        //  we will optimize code using stream
        List<Float> productPriceList2 = products.stream() //stream is print the data
                .parallel() // parallel processing
                .filter(product -> product.price()>35999 && product.price()<60999) //filtering data(instead of if-else)
                .map(product -> product.price()) // fetching price
                .toList(); // collecting as list
        // .collect(Collectors.toList()) // collecting as list

        System.out.println("product price list with stream: "+productPriceList2);

        //-----------------------------------------------------------------------------

//        Map<Integer , Product> productMap = streamDemo.generateListData();

    }


    // externalized data generation.
    private List<Product> generateListData(){

        List<Product> products = new ArrayList<>();

        // adding products
//        products.add(new Product(1,"Hp laptop",25000f));
//        products.add(new Product(2,"sony laptop",39000f));
//        products.add(new Product(3,"apple laptop",69999f));
//        products.add(new Product(4,"asus laptop",41999f));


        return List.of(new Product(1,"Hp laptop",25000f),
                (new Product(2,"sony laptop",39000f)),
                (new Product(3,"apple laptop",69999f)),
                (new Product(4,"asus laptop",41999f)));
    }
}

//externalized data generation

//private Map<Integer ,Product> generateMapData(){
//    //.collect() & Collectors.toMap() demonstrate
//    //Function.identity()
//
//return generateListData().stream();
////.collect(Collectors.toMap(product::id , product -> product))
//    .collect(Collectors.toMap(Product::id, Function.identity()));
//}


