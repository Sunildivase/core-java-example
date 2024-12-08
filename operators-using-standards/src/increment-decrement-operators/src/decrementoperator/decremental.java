package decrementoperator;

import java.util.Scanner;

public class decremental {

    public static void main(String[] args) {

        // pseudo code
        // increment operator -- accept one number from user and print no+1

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter positive number: ");
        int no =Integer.parseInt( scanner.nextLine());

        System.out.println("entered value: "+ no);

        // one value add to existing entered value
        no--;
        System.out.println("decremental value: "+ no);

        //next value of incremented value will be sho here
        --no;
        System.out.println("next decremental value" +no);



    }
}
