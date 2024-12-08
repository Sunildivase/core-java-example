package relationaloperator;

import java.util.Scanner;

public class LoanEligibility {

    //            - *Loan Eligibility*: Approve loans if the applicant's age is less than or equal to 60.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter your age: ");
        int age = Integer.parseInt(scanner.nextLine());

        if(age <= 60){
            System.out.println(" you are eligible for loan");
        }
        else{
            System.out.println(" your age is not eligible for loan ");
        }
    }


}
