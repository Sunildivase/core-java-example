public class ArrayMarks {

    public static void main(String[] args) {

        int marks[] = new int[5];

        marks[0]=45;
        marks[1]=90;
        marks[2]=55;
        marks[3]=66;
        marks[4]=77;

        System.out.println("marks: "+marks.length);

        //while loop for array demo

        int position=0;
        while(position<marks.length){
            System.out.println(marks[position]);
            position++;
        }

        System.out.println("--------------------------------");
        System.out.println("demo for loop");
        //for loop

        int index=0;
        for(index=0;index< marks.length;index++){
            System.out.println(marks[index]);
        }
        System.out.println("---------------------------------");
        System.out.println("demo foreach loop");

        for(int element:marks){
            System.out.println(element);
        }

    }
}
