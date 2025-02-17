import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationDemo {

    private static final String FILE_PATH = "E:\\JAVA_TRAINING\\fileDemo\\";

    private static final String FILE_NAME = "student.ser";

    public static void main(String[] args) {

        SerializationDemo serializationDemo = new SerializationDemo();

        Student.Address peterAddress = new Student.Address("california");
        Student.Address johnAddress = new Student.Address("new york");

        // prepare data to serialize

        Student peter = new Student(1, "peter", peterAddress);
        Student john = new Student(2, "john", johnAddress);

        //serialization process

//        List<Student> students = List.of(peter,john);
//          serializationDemo.serialize(students);

        serializationDemo.serialize(List.of(peter, john));


    }

    public void serialize(List<Student> students){
        // serialization

        try{
          // saving object in file

            FileOutputStream file = new FileOutputStream(FILE_PATH + FILE_NAME);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // method for serialization of object

            out.writeObject(students);

            out.close();
            file.close();

        }catch (IOException ex){
            System.err.println(ex.getMessage());
        }
    }

    private List<Student> deserialize(){

        List<Student> students = null;

        //deserialization

        try{
            // reading the object from file
            FileInputStream file = new FileInputStream(FILE_PATH + FILE_NAME);
            ObjectInputStream in = new ObjectInputStream(file);

            //method for deserialize

            students = (List<Student>) in.readObject();
            in.close();
            file.close();

        }catch (IOException ex){
            System.err.println(ex.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return students;
    }


}
