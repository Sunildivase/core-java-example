package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpression {

    public static void main(String[] args) {

          // if we need email validations

          // ex:- abc05@gmail.com
        // regex:-[a-z0-9]*@[a-z]*.[a-z]*

        Pattern pattern = Pattern.compile("abc@gmail.com");
        Matcher matcher = pattern.matcher("*@*");

        System.out.println("gmail validations: "+matcher.matches());
    }
}
