package relationaloperator;

//pseudo code:
// if no is divisible by 2--> output
// if no is divisible by 2 -->remainder


import java.util.Scanner;

public class ModulationOperator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter the value:");
        int no = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter the divisible value:");
        int divisibleValue = Integer.parseInt(scanner.nextLine());

        int output = no / divisibleValue;

        int remainder = no % divisibleValue;

        System.out.println("division output: "+output);
        System.out.println("remainder: "+remainder);

    }
}
