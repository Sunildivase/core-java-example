package streamApi.example2;

import java.util.ArrayList;
import java.util.List;

public class StringCityDemo {

    public static void main(String[] args) {

//        List<StreamCity> streamCities = new ArrayList<>();

        StringCityDemo stringCityDemo = new StringCityDemo();

        List<StreamCity> stringList = stringCityDemo.generateList();

        List<String> stringsOfFirst2Char = stringList.stream()
                .parallel() //parallel processing
                .filter(streamCity -> streamCity.city().contains("a")) // if else conditions
                .map(streamCity -> streamCity.city().substring(0,3))
                .toList();

        System.out.println("city with contains 'a' character: "+stringsOfFirst2Char);

    }

    public List<StreamCity> generateList(){
        return List.of(new StreamCity("pune"),
                new StreamCity("mumbai"),new StreamCity("delhi"),new StreamCity("bangalore"));
    }
}
