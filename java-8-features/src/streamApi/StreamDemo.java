package streamApi;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {

    public static void main(String[] args) {

        StreamDemo streamDemo = new StreamDemo();

       List<Product> products = streamDemo.generateListData();
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
