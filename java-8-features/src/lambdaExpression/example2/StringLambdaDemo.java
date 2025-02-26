package lambdaExpression.example2;

public class StringLambdaDemo {
    public static void main(String[] args) {

        // old fashion code
        StringAppender appender = new StringAppenderImpl();
        String output = appender.append("pune","-mumbai");

        System.out.println("output: "+output);

        //using lambda expression

        StringAppender stringAppender = (firstString,secondString)->
             firstString+secondString;

        String outputWithLambda = stringAppender.append("john","cena");
        System.out.println("output with lambda: "+outputWithLambda);
    }
}
