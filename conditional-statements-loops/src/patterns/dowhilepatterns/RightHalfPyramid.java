package patterns.dowhilepatterns;

public class RightHalfPyramid {
    //pseudo code
    // print pattern
    // *
    // **
    // ***
    // ****
    // *****


    public static void main(String[] args) {
        int i=0;
        do{
            int innercounter=0;
            do{
                System.out.print("*");
                innercounter++;
            }while(innercounter<i);
            System.out.println("*");
            i++;
        }while(i < 5);
    }
}
