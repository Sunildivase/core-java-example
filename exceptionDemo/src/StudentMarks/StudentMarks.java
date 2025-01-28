package StudentMarks;

public class StudentMarks {

    public static void main(String[] args)  {

        StudentMarksService studentMarks = new StudentMarksService();
        try{
            studentMarks.marks();
        } catch (InvalidMarkException e) {
            System.err.println(e.getMessage());
        }

        studentMarks.displayMarks();

    }
}
