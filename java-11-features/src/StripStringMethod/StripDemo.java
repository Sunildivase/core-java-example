package StripStringMethod;

public class StripDemo {
    public static void main(String[] args) {


        String sentence="this is string statement"; // sentence contains blank spaces
        var wordSets= "word word2 word3"; // set contains blank spaces
        var blank = "   ";  // only blank spaces

        System.out.println("sentence blank:"+sentence.isBlank());
        System.out.println("wordSets blank:"+wordSets.isBlank());
        System.out.println("blank: "+blank.isBlank());

        System.out.println("-----------------------------------------------");

        var whiteSpaces = "\n\t\u2005hey buddy\u2005";
        System.out.println("whitespace strip:"+whiteSpaces.strip());
        System.out.println("whitespaces trim:"+whiteSpaces.trim());
        System.out.println("stripLeading:"+whiteSpaces.stripLeading());
        System.out.println("stripTrailing:"+whiteSpaces.stripTrailing());
    }
}
