package relationaloperator;

import java.util.Scanner;

public class SpeedViolation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter speed : ");
        int speed = Integer.parseInt(scanner.nextLine());

        if(speed<80){
            System.out.println("vehicle speed is under limit");
        }
        else {
            System.out.println("you are over speed");
        }
    }
}
