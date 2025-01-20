import java.util.Scanner;

public class ConstructorDemo {

    //constructor :- initializing the object is called constructor

    //there are two types of constructor:-
    //1.default construction:-
        //generally we don't give parameters and when we create constructor is called default constructor

    //2.parameterized constructor:-
        // generally we use variables inside the constructor
       // class name is must same for constructor
      // constructor doesn't have return type.


    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("please enter id");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter name");
        String name = scanner.nextLine();

        //we can optimize the code by using constructor
        //we can remove the setter methods for optimization

        Constructor constructor = new Constructor(id,name);
//        constructor.setId(id);
//        constructor.setName(name);

        System.out.println("details: "+constructor);
    }


}
