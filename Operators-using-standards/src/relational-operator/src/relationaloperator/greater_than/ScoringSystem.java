package relationaloperator;

import java.util.Scanner;

public class ScoringSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter Score : ");
        int score = Integer.parseInt(scanner.nextLine());

        if(score>65){
            System.out.println("you are passed with first class");
        }
        else {
            System.out.println("you are passed");
        }
    }
}
