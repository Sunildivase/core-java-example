public class Circle extends Shape
{
    public Circle(String color) {
        super(color);
    }

    public Circle() {
        super("white");
    }

    public void draw(){
        System.out.println("circle drawn: "+this.color);

    }
}
