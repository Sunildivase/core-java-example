package relationaloperator;

import java.util.Scanner;

public class AttendanceCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter overall attendance %: ");
        int attendance = Integer.parseInt(scanner.nextLine());

        if(attendance>70){
            System.out.println("you are no in defaulter list");
        }
        else{
            System.out.println("you are defaulter");
        }
    }
}
