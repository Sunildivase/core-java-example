package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodsOfCollection {

    public static void main(String[] args) {

        List<Integer> numberlist = new ArrayList<>();

        numberlist.add(10);
        numberlist.add(20);
        numberlist.add(30);
        numberlist.add(40);
        numberlist.add(5000);

        // it will add all elements
        Collections.addAll(numberlist,57,89,25,36,45);
        System.out.println("List<Integer> :"+numberlist);

        //if we need sort- sort will give value ascending order
        Collections.sort(numberlist);
        System.out.println("list<Integer> Sort: "+numberlist);

        // if we need min value
        System.out.println("list<Integer> min: "+Collections.min(numberlist));

        // if we need max value
        System.out.println("list<Integer> max: "+Collections.max(numberlist));

        // if we need list reverse
        Collections.reverse(numberlist);
        System.out.println("list<integer> reverse: "+numberlist);

        // if we need swap - swap means exchange the position of value
        Collections.swap(numberlist,0,2);
        System.out.println("list<Integer> swap: "+numberlist);

        // if we need to replace value
       boolean isReplaced = Collections.replaceAll(numberlist,57,22);
       if(isReplaced) {
           System.out.println("list<Integer> new value added: " + numberlist);
       }else{
           System.out.println("list<Integer> old value :"+numberlist);
       }

       // if we need o shuffle the value - random values gives
        Collections.shuffle(numberlist);
        System.out.println("list<integer> shuffle list: "+numberlist);

        //if we need to rotate the value
        Collections.rotate(numberlist,2);
//        [40, 36, 25, 10, 22, 45, 20, 30, 89, 5000]
//            1       2       3       4       5
        System.out.println("list<Integer> rotate: "+numberlist);
//        output:- because we give 2 value so it will take 2 values slot and rotate

//                [89, 5000, 40, 36, 25, 10, 22, 45, 20, 30]
//                    5         1       2       3       4

        // if we need number of copies

        List<List<Integer>> listOfList = Collections.nCopies(2,numberlist);
        System.out.println("list<integer> 2 copies of nCopies: "+Collections.nCopies(2,numberlist));
        System.out.println("2 copies of list: "+listOfList);
    }
}
