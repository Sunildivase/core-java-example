package relationaloperator;

import java.util.Scanner;

public class GradeAssignment {

    //            - *Grade Assignment*: Assign "Pass" if a student's score is 40 or less.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter total marks");
        int totalMarks = Integer.parseInt(scanner.nextLine());

        if( 40 <= totalMarks ){

            System.out.println("first class");
        }
        else{
            System.out.println("pass");
        }
    }
}
