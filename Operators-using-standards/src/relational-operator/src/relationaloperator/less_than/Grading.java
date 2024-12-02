package relationaloperator;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("please enter marks in % : ");
        double marks = scanner.nextDouble();

        if(marks<34){
            System.out.println("you are failed");
        }
        else{
            System.out.println("you are passed");
        }

    }
}
