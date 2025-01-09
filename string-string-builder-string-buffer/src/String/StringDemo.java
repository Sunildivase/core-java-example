package String;

public class StringDemo {

    public static void main(String[] args) {

        String country = "India";

        String newCountry = new String("Bharat");

        System.out.println("string literal :"+country);
        System.out.println("string object: "+newCountry);

        newCountry = new String( "Bharat");
        System.out.println("String: "+newCountry);

        //mutable objects -  for non-multithreading applications
        StringBuilder greetings = new StringBuilder("hi there");
        System.out.println("current object: "+greetings);
        greetings.append(",good afternoon!");
        System.out.println("current object: "+greetings);

        //mutable objects - for multithreading applications
        StringBuffer stringBuffer = new StringBuffer("hey");
        System.out.println("strBuffer: "+stringBuffer);
        stringBuffer.append("how are you ?");
        System.out.println("strBuffer: "+stringBuffer);
        stringBuffer = new StringBuffer("how's feeling?");
        System.out.println("strBuffer: "+stringBuffer);

        StringBuffer wish = new StringBuffer("hey");
        System.out.println(wish);
        wish = new StringBuffer("welcome");
        System.out.println(wish);

    }
}
