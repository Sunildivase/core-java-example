package ternaryoperator;

import java.util.Scanner;

public class TernaryOperator {

//    static int no;

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter number: ");
        int no = Integer.parseInt(scanner.nextLine());

//        this commented statement is used as ternary operator
//        only if there is single statement return by using if else we use instead of if else ternary operator

//        ((no % 2 == 0))?System.out.println("number is even") : System.out.println("number is odd");
        //        (no % 2 == 0)?"number is even":"number is odd";


        if (no % 2 == 0) {

            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }


    }
}