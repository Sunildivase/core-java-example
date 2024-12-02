package relationaloperator;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ternary operator used for remove if-else only for single statement

        System.out.println("please enter value:" );
        int no = Integer.parseInt(scanner.nextLine());

        if(no % 2 == 0){
            System.out.println("no is even");
        }
        else{
            System.out.println("no is odd");
        }

//        (no % 2 == 0) ? System.out.println("no is even"):System.out.println("no is odd");

        System.out.println((no % 2 == 0) ? "no is even by using ternary operator" :"no is odd by using ternary operator");
    }
}
