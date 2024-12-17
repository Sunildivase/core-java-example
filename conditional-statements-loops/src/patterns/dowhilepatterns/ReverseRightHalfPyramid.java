package patterns.dowhilepatterns;

public class ReverseRightHalfPyramid {

    public static void main(String[] args) {

        int i=5;

        do{
            System.out.println("*");
            i--;

            int j=0;
            do{
                System.out.print("*");
                j++;

            }while(j<i);

        }while(i>=0);
    }
}
