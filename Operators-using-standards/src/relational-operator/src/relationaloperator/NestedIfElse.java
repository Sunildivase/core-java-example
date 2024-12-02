package relationaloperator;

import java.util.Scanner;

public class NestedIfElse {

    //pseudo code
    // print msg to enter no
    //accept no - convert to int
    // if no is positive
        // if no is positive --> check even or odd
        // if it is even then check greater than 100
        // if it is odd then check less than 100
    //positive condition --> else :check if no is divisible by 5

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter value: ");
        int no = Integer.parseInt(scanner.nextLine());

        if(0<= no){
            System.out.println("number is positive");
            if(no%2 == 0){
                System.out.println("number is even");
                if(no>100){
                    System.out.println("number is greater than 100");
                }
                else{
                    System.out.println("number is not greater than 100");
                }
            }
            else{
                System.out.println("number is odd");
                if(no<100){
                    System.out.println("number is less than 100");
                }
                else{
                    System.out.println("number is not less than 100");
                }
            }
        }
        else{
            System.out.println("number is negative");
            if(no % 5 == 0){
                System.out.println("number is divisible by 5");
            }
            else{
                System.out.println("number is not divisible by 5");
            }
        }


    }
}