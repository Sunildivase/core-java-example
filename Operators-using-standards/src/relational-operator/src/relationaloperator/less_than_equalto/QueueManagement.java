package relationaloperator;

import java.util.Scanner;

public class QueueManagement {
    //            - *Queue Management*: Accept requests only if queue length is within limits.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter token number: ");
        int token =Integer.parseInt(scanner.nextLine());

        if(token <= 50){
            System.out.println("you are in limit of queue ");
        }else{
            System.out.println("you are crossed limit of queue");
        }

    }
}
