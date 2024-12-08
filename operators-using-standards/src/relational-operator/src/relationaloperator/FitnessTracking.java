package relationaloperator;

import java.util.Scanner;

public class FitnessTracking {

    //            - *Fitness Tracking*: Record activity if steps walked exceed or equal a daily goal.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("walked steps count: ");
        int steps =Integer.parseInt(scanner.nextLine());

        if(steps >= 5000){
            System.out.println("you achieved goal !!!");
        }
        else{
            System.out.println("few more steps to achieve your goal");
        }

    }



}
