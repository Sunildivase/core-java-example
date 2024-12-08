package conditionaloperators;

import java.util.Scanner;

public class IfStatement {

//    static int no;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter value");
        int no = Integer.parseInt(scanner.nextLine());

         if(no >= 10){
             System.out.println("number is greater than 10");
         }
    }
}
