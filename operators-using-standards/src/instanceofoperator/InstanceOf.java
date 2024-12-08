package instanceofoperator;

import java.util.Scanner;

public class InstanceOf {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // we use instanceof operator to check the datatype match
        // it always gives true condition

        String city = "pune";
        Integer length = 23;
        Double temp = 36.5;

        if(city instanceof String){
            System.out.println("type of city is string");
        }
        else{
            System.out.println("type of city is not string");
        }
        if(length instanceof Integer){
            System.out.println("type of length is integer");
        }
        else{
            System.out.println("type of length is not integer");
        }
        if(temp instanceof Double){
            System.out.println("type of temp is double");
        }
        else{
            System.out.println("type of temp is not double");
        }
    }
}
