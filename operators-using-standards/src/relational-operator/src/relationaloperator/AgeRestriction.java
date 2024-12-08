package relationaloperator;

import java.util.Scanner;

public class AgeRestriction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter age: ");
        int age = Integer.parseInt(scanner.nextLine());

        if(age < 18){
            System.out.println("you are not eligible");
        }
        else {
            System.out.println("you are eligible");
        }
    }
}
