package relationaloperator;

import java.util.Scanner;

public class StockMonitoring {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter amount: ");
        int amount = Integer.parseInt(scanner.nextLine());

        if(amount<500){
            System.out.println("inventory is below minimum amount");

        }
        else{
            System.out.println("you are done successfully");
        }
    }
}
