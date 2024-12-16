package patterns.whilepatterns;

public class RightHalfPyramidNumber {
    //pseudo code
    // print pattern
    // 1
    // 12
    // 123
    // 1234
    // 12345

    public static void main(String[] args) {

        int i =1;
        while(i<=5){
            int innercounter=1;
            while(innercounter<i){
                System.out.print(innercounter);
                innercounter++;
            }
            System.out.println(i);
            i++;
        }

    }
}
