package addition;

//    pseudo code(steps):
//create two variables
//perform addition operations
//create one variable for storing in memory
//print the output

public class AdditionInt {
    public void addNos(){
        int a=10;
        int b=25;
        int c;
        c=a+b;
        System.out.println("sum: "+ c );
    }
    public static void main(String[] args){
        AdditionInt demo=new AdditionInt();
        demo.addNos();
    }
}
