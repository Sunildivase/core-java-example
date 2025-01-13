package String;

public class StringBuilderDemo {

    public static void main(String[] args) {

        //string builder is used frequently changing string in non-multithreading environment
        //mutable objects -  for non-multithreading applications
        StringBuilder greetings = new StringBuilder("hi there");
        System.out.println("current object: "+greetings);
        greetings.append(",good afternoon!");
        System.out.println("current object: "+greetings);
    }
}
