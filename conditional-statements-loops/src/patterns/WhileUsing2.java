package patterns;

public class WhileUsing2 {
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
