package relationaloperator;

import java.util.Scanner;

public class StockReplenishment {

    //   - *Stock Replenishment*: Trigger restocking if inventory is above reorder level.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("stock details:");
        int amount = Integer.parseInt(scanner.nextLine());

        if(amount >= 25000){
            System.out.println("please add money and reorder  ");
        }
        else{
            System.out.println("congratulations!! you buy stock");
        }
    }
}
