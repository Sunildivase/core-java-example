package relationaloperator;

import java.util.Scanner;

public class PositiveNegativeDemo {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("please enter value: ");
        int no = Integer.parseInt(scanner.nextLine());

        if (no > 0){
            System.out.println("number is positive");
        }
        else if( no == 0){
            System.out.println("number is zero");
        }
        else {
            System.out.println("number is negative");
        }

        }
    }

