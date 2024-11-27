package relationaloperator;

import java.util.Scanner;

public class ExamCutOff {

    //   - *Exam Cutoff*: Check if a candidate's score meets or exceeds the cutoff for selection.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter score: ");
        int score = Integer.parseInt(scanner.nextLine());

        if(score >= 85){
            System.out.println("you are eligible for admission");
        }
        else {
            System.out.println("you are not eligible for admission");
        }
    }
}
