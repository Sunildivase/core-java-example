package conditionaloperators;

import java.util.Scanner;

public class NestedIfElse {
//    static int no;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter value");
        int no = Integer.parseInt(scanner.nextLine());

        if(no % 2 == 0 && no>=100){
            System.out.println("number is even");
            if(no >= 100){
                System.out.println("number is greater than 100");
            }
            else {
                System.out.println("number is less than 100");
            }
        }
        else{
            System.out.println("number is odd ");
            if(no<=100){
                System.out.println("number is less than 100");
            }
            else{
                System.out.println("number is greater than 100");
            }
        }
    }
}

