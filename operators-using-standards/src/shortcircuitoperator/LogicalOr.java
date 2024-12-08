package shortcircuitoperator;

import java.util.Scanner;

public class LogicalOr {

    // here we use logical operators which denotes as || OR operator
    // one conditions must be true then output shows result

//    static int no;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter value");
        int no = Integer.parseInt(scanner.nextLine());

        if(no % 2 == 0 || no>=100){
            System.out.println("number is even and greater than 100");
        }
        else{
            System.out.println("number is odd and less than 100");
        }
    }
}
