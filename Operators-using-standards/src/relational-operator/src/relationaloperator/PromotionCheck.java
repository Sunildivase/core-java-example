package relationaloperator;

import java.util.Scanner;

public class PromotionCheck {

    //   - *Promotion Check*: Promote employees with tenure greater than or equal to five years.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter year of experience");
        double experience = scanner.nextDouble();

        if(experience>=5){
            System.out.println("congratulations !!! you are promoted");
        }
        else{
            System.out.println("ohh!! you have some more years to promote");
        }
    }
}
