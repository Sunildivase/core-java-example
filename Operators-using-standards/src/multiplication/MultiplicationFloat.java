package multiplication;
// pseudo code (steps):-
// create two variables
// perform multiplication operation
// create one variable for store
// print the output
public class MultiplicationFloat {
    public void mulNos(){
        float a=0.25F;
        float b=0.87F;
        float c;
        c=a*b;
        System.out.println("Result: "+c);
    }
    public static void main(String[] args){
        MultiplicationFloat z=new MultiplicationFloat();
        z.mulNos();
    }
}
