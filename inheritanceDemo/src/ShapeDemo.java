
public class ShapeDemo {
    public static void main(String[] args) {

        Shape shape = new Shape("yellow");
        shape.draw();

        System.out.println("----------------------------------------------");
        shape= new Circle(); //here we can give color if we do not default constructor runs and gives output
        shape.draw();

        // data hiding of object hide and given object from child we can give it to parent class.
        // access specifiers are public and default then we can use inheritance

    }
}
