package incrementoperator;

import java.util.Scanner;

public class Incremental {
    public static void main(String[] args) {

        // pseudo code
        // increment operator -- accept one number from user and print no+1

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter positive number: ");
        int no =Integer.parseInt( scanner.nextLine());

        System.out.println("entered value: "+ no);

        // one value add to existing entered value
        no++;
        System.out.println("incremental value: "+ no);

        //next value of incremented value will be sho here
        ++no;
        System.out.println("next incremental value" +no);



    }
}
