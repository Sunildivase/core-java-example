package multiplication;
// pseudo code (steps):-
// create two variables
// perform multiplication operation
// create one variable for store
// print the output

public class MultiplicationInt {
    public void mulNos(){
        int a=13;
        int b=7;
        int c;
        c=a*b;
        System.out.println("Result: "+c);
    }
    public static void main(String[] args){
        MultiplicationInt z=new MultiplicationInt();
        z.mulNos();
    }
}
