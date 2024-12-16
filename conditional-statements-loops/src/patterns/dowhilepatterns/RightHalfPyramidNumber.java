package patterns.dowhilepatterns;

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
        do{
            int innercounter=1;
              do{
                System.out.print(innercounter);
                innercounter++;
              }while(innercounter<i);
            System.out.println(i);
            i++;
        }while(i<=5);

    }
}
