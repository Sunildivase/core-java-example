package addition;

//    pseudo code(steps):
//create two variables
//perform addition operations
//create one variable for storing in memory
//print the output

public class AdditionFloat {
    public void addNos(){

        float a = 0.25F;
        float b = 20.37F;
        float c;
        c = a + b;
        System.out.println("sum-of-float: " + c);
    }

    public static void main(String[] args) {

      AdditionFloat demo= new AdditionFloat();
      demo.addNos();
    }
}
