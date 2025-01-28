package StuentMarks;

public class StudentMarks {

    public static void main(String[] args) throws InvalidMarkException {

        StudentMarksService studentMarks = new StudentMarksService();
        studentMarks.marks();
        studentMarks.displayMarks();

    }
}
