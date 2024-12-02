package relationaloperator;

import java.util.Scanner;

public class EligibilityCriteria {

//      - *Eligibility Criteria*: Verify if a student qualifies for a scholarship based on marks.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter grades:");
        int grade = Integer.parseInt(scanner.nextLine());

        if(grade >= 65){
            System.out.println("you are qualified for scholarship");
        }
        else{
            System.out.println("you are not eligible for scholarship");
        }
    }
}
