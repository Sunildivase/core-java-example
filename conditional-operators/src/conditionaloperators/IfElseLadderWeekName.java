package conditionaloperators;

import java.util.Scanner;

public class IfElseLadderWeekName {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("please enter day of the week in int");
        int input =Integer.parseInt(scanner.nextLine());

        if(input==1){
            System.out.println("Sunday");
                }else if(input==2){
                System.out.println("monday");
                } else if (input==3) {
                System.out.println("tuesday");
                } else if (input==4) {
                    System.out.println("wednesday");
                } else if (input==5) {
                    System.out.println("thursday");
                } else if (input==6) {
                    System.out.println("friday");
                } else if (input==7) {
                    System.out.println("saturday");
                }
        else {
            System.out.println("you entered something wrong");
        }
    }
}
