package String;

public class MethodsOfString {

    public static void main(String[] args) {

        String sentence = "this is a sentence";
        var wordSets = "word1,word2,word3";
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

        
    }
}
