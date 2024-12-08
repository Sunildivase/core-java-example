package stringconcatoperator;

import java.util.Scanner;

public class ConcatOperator {

    public String fName;
    public String lName;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("please enter first name:");
        String fName = scanner.nextLine();
        System.out.println("please enter last name:");
        String lName = scanner.nextLine();

        System.out.println("fullName: "+fName +" "+ lName);

    }
}
