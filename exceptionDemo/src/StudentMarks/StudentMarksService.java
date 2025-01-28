package StudentMarks;

import java.util.HashMap;
import java.util.Scanner;

public class StudentMarksService {

    private static final Scanner scanner = new Scanner(System.in);

    HashMap<String , StudentMarksModel> marksHashMap = new HashMap<>();

        public void marks() throws InvalidMarkException {

            System.out.println("please enter math marks");
            int math = Integer.parseInt(scanner.nextLine());

            if(math < 0 || math > 100){
                throw new InvalidMarkException("invalid marks");
            }

            System.out.println("please enter physics marks");
            int physics = Integer.parseInt(scanner.nextLine());

            if(physics < 0 || physics > 100){
                throw new InvalidMarkException("invalid marks");
            }

            System.out.println("please enter chemistry marks");
            int chemistry = Integer.parseInt(scanner.nextLine());

            if (chemistry < 0 || chemistry > 100) {
                throw new InvalidMarkException("invalid marks");
            }

            System.out.println("please enter biology marks");
            int biology = Integer.parseInt(scanner.nextLine());

            if(biology < 0 || biology > 100){
                throw new InvalidMarkException("invalid marks");
            }

            StudentMarksModel marks = new StudentMarksModel(math,physics,chemistry,biology);
            marksHashMap.put(String.valueOf(1),marks);

        }

        public void displayMarks(){

            System.out.println("marks: "+marksHashMap);
        }
    }

