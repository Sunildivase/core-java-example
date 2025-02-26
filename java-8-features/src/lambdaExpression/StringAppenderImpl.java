package lambdaExpression;

public class StringAppenderImpl implements StringAppender{

    @Override
    public String append(String firstString, String secondString) {
        return (firstString+secondString);
    }
}
