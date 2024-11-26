package relationaloperator;

import java.time.LocalDate;
//import java.util.Scanner;

public class DeadlineCheck {
    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);

        System.out.println("please enter date: ");
        LocalDate currentDate = LocalDate.now();
        LocalDate deadlineDate = LocalDate.of(2024,12,5);

        if (deadlineDate.isBefore(currentDate)){
            System.out.println("you are done project within time");
        }
        else{
            System.out.println("you are passed your deadline");
        }
     }
}
