package conditionaloperators;

import java.util.Scanner;

public class IfElseLadder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter value:");
        int no = Integer.parseInt(scanner.nextLine());

        if(no >= 10){
            System.out.println("number is greater than 10");
        }else if(0 < no){
            System.out.println("number is positive");
        }else if(no == 0){
            System.out.println("number is zero");
        }
        else {
            System.out.println("number is negative");
        }
    }
}
