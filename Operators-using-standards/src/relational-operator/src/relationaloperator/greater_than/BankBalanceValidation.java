package relationaloperator;

import java.util.Scanner;

public class BankBalanceValidation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter amount: ");
        double amount = scanner.nextDouble();

        if(amount>1000){
            System.out.println("you can withdraw amount: ");
        }
        else{
            System.out.println("you can't withdraw amount minimum balance limit");
        }
    }
}
