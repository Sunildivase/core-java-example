package relationaloperator;

import java.util.Scanner;

public class DiscountEligibility {

    public static void main(String[] args) {



//     *Discount Eligibility*: Offer discounts if total purchase amount is within a specific range.

    Scanner scanner = new Scanner(System.in);

        System.out.println("please enter total amount");
        int amount = Integer.parseInt(scanner.nextLine());

        if (amount <= 1500){

            System.out.println("you don't have discount ");

        }
        else {

            System.out.println(" you have discount of 10% ");

        }

    }

}
