package bitwiseoperator;

import java.util.Scanner;

public class BitwiseAnd {

    // bitwiseAnd operator is same like logical operator which denotes &
    // bitwise operator is used when byte code means bit calculate in the form of binary 0 and 1

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter first value");
        int firstValue = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter second value");
        int secondValue =Integer.parseInt(scanner.nextLine());

        int output = firstValue & secondValue;

        System.out.println("output: "+output);
    }

}
