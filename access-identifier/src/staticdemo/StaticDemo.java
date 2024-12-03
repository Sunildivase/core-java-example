package staticdemo;

public class StaticDemo {

    int no=10;

    public static void main(String[] args) {
        StaticDemo staticdemo = new StaticDemo();
        staticdemo.no=10;
        staticdemo.PrintNo();
        City.printCity();
    }

    public void PrintNo(){
        System.out.println("print number is:"+no);
    }
}
