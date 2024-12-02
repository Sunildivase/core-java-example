package shortcircuitoperator;

import java.util.Scanner;

public class LogicalOperator {
// && operator - both conditions must be true
// || operator - one or both condition true

    // pseudo code
    // print no is even or odd
    // no is greater than 100 or less than 100

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter the value: ");
        int no = Integer.parseInt(scanner.nextLine());

        if(no % 2 == 0 && no>100){
            System.out.println("number is greater than 100 and even number");
        }
        else {
            System.out.println("number is less than 100 and odd number");
        }
    }
}
