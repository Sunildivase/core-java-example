package relationaloperator;

//import java.util.Scanner;

import java.time.LocalDate;

public class TaskScheduling {

    //   - *Task Scheduling*: Assign tasks with deadlines on or before the current date.

    public static void main(String[] args) {

//        Scanner scanner =new Scanner(System.in);

        System.out.println("please enter date ");

        LocalDate currentDate = LocalDate.now();
        LocalDate deadlineDate = LocalDate.of(2024,12,5);

        if (deadlineDate.isAfter(currentDate)){
            System.out.println("you have completed task within time");
        }
        else {
            System.out.println("you have to complete task on or before deadline");

        }
    }
}
