package conditionaloperators;

import java.util.Scanner;

public class IfElseStatement {

//    static int no;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter number: ");
        int no = Integer.parseInt(scanner.nextLine());

        if (no % 2 == 0) {

            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }


    }

}
