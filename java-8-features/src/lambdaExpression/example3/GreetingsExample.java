package lambdaExpression.example3;

public class GreetingsExample {
    public static void main(String[] args) {

        Greetings greetings= ()-> System.out.println("hello world !!!");
        greetings.sayHello();

        GreetingsWithParam greetingsWithParam=(name)-> System.out.println("hello "+name +" !!");
        greetingsWithParam.sayHello("pune");
    }
}

interface Greetings {
    void sayHello();
}

interface GreetingsWithParam{
    void sayHello(String name);
}
