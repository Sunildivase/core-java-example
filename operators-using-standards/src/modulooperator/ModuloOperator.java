package modulooperator;

import java.util.Scanner;

public class ModuloOperator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter value 1");
        int no = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter value 2");
        int no1 = Integer.parseInt(scanner.nextLine());

        int output = no / no1;

        int remainder = no % no1;

        System.out.println("output:"+output);
        System.out.println("remainder: "+remainder);
    }
}
