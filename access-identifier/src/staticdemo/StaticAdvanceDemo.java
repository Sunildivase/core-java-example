package staticdemo;

import java.util.Scanner;

public class StaticAdvanceDemo {

    static int staticno;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("pls enter the value");
        staticno = Integer.parseInt(scanner.nextLine());

        StaticAdvanceDemo obj1 = new StaticAdvanceDemo();
        obj1.printno();

        StaticAdvanceDemo obj2 = new StaticAdvanceDemo();
        obj2.printno();

          obj1.staticno=25; // if we give hard coded value then it will not change remains same
          obj1.printno();   // it will change value with respect
          obj2.printno();

    }
    public void printno(){

        System.out.println("the number is: "+ staticno);
    }

}
