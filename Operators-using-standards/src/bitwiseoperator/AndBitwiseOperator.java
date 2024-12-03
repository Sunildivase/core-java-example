package bitwiseoperator;

import java.util.Scanner;

public class AndBitwiseOperator {

    // attributes of operand

    static int firstValue = 0;

    static int secondValue = 0;

    //behaviour or methods

    private static void AndBitwiseOperation() {

        int result = firstValue & secondValue;
        System.out.println("output: "+result);

    }

    public static void main(String[] args) {

        System.out.println("please enter 2 values: ");

        Scanner scanner = new Scanner(System.in);

        firstValue = Integer.parseInt(scanner.nextLine());
        secondValue = Integer.parseInt(scanner.nextLine());

        AndBitwiseOperation();

    }
}
