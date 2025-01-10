package String;

public class MethodsOfString {

    public static void main(String[] args) {

        String sentence = "this is a sentence";
        var wordSets = " word1,word2,word3 ";
        var blanks = "     ";

        //isBlank():- identifies that current string is blank or not
        System.out.println("sentence blank: "+ sentence.isBlank());
        System.out.println("wordSets bank: "+wordSets.isBlank());
        System.out.println("blanks: "+blanks.isBlank());
        System.out.println("----------------------------------------------------------------------");

        //isEmpty() :- identifies that current string is empty or not
        System.out.println("sentence empty: "+ sentence.isEmpty());
        System.out.println("wordSets bank: "+wordSets.isEmpty());
        System.out.println("blanks: "+blanks.isEmpty());
        System.out.println("----------------------------------------------------------------------");

        //repeat:- string will repeat given number of times
        String blah = new String("blah ");
        String repeatedString = blah.repeat(3);
        System.out.println("repeat: "+repeatedString);
        System.out.println("----------------------------------------------------------------------");

        //trim :-remove spaces from both ends

        System.out.println("without trim: "+wordSets);
        String trim = wordSets.trim();
        System.out.println("trimmed string: "+trim);
        System.out.println("----------------------------------------------------------------------");

        //strip:-remove blank spaces we need special characters for strip
        System.out.println("without trim: "+wordSets);
        String strip = wordSets.strip();
        System.out.println("trimmed string: "+strip);
        System.out.println("----------------------------------------------------------------------");

        //trim() vs strip():-
        var whiteSpaceString = "\n\they buddy\u2005";
        System.out.println("whiteSpaceString: "+whiteSpaceString);
        System.out.println("whiteSpaceString.strip(): "+whiteSpaceString.strip());
        System.out.println("-----------------------------------------------------------------------");

        //stripLeading() and stripTrailing() :-
        System.out.println("whiteSpaceString.stripLeading(): "+whiteSpaceString.stripLeading());
        System.out.println("whiteSpaceString.stripTrailing(): "+whiteSpaceString.stripTrailing());
        System.out.println("-------------------------------------------------------------------------");

        //lines:-
        sentence = "this\nis\nmy\nstring.";
        System.out.println("sentence: "+sentence);

        System.out.println("------------------------------------------------------------------------");

        //
    }
}
