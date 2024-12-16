package patterns.whilepatterns;

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
        while(i < 5){
            int innercounter=0;
            while(innercounter<i){
                System.out.print("*");
                innercounter++;
            }
            System.out.println("*");
            i++;
        }
    }
}
