package patterns.forpatterns;

public class Pyramid {

    public static void main(String[] args) {

        // to generate 5 rows

        for(int i=0 ; i<=5 ; i++){


            for(int j=5 ; j>i ; j--){

                System.out.print(" ");
            }

            // loop print

            for(int j=0 ; j<i ; j++){
                System.out.print("* ");
            }

            System.out.println(" ");
        }

        System.out.println("    *    ");
        System.out.println("   * *   ");
        System.out.println("  * * *  ");
        System.out.println(" * * * * ");
        System.out.println("* * * * *");

    }
}

