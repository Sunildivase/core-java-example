import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ForEachMethod {

    public static void main(String[] args) {


    List<String> messages = new ArrayList<>();
    // old fashioned code

        messages.add("hi");
        messages.add("hello");
        messages.add("how");
        messages.add("are");
        messages.add("you");

    //modern
    List<String> msgs = List.of("hi","hello","how","are","you");

        for(String msg : messages){
        System.out.println("msgs "+msg);
    }
//        System.out.println("msgs "+ msgs);

        ForEachMethod forEachMethod = new ForEachMethod();
        messages.forEach(forEachMethod::print);

    Set<String> sets = Set.of("hi","hello","how","are","you");
        System.out.println("sets "+sets);

    Map<Integer,String > maps = Map.of(1,"hi",2,"hello",3,"how",4,"are",5,"you");
        System.out.println("maps "+maps);

    }
    public void print(String element){
        System.out.println("Element: "+element);
    }
}

