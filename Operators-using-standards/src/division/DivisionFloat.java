package division;
// pseudo code (steps):-
// create two variables
// perform operation
// create one variable for storing
// print the output
public class DivisionFloat {
    public void divNos(){
        float a=10.25F;
        float b=0.25F;
        float c;
        c=a/b;
        System.out.println("Division-float: "+ c);
    }
    public static void main(String[] args){
        DivisionFloat x=new DivisionFloat();
        x.divNos();
    }
}
