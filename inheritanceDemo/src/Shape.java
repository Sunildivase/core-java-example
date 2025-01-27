public class Shape {

    public String color;

    public Shape(String color) {
        this.color = color;
    }

    public void draw(){
        System.out.println("base shape drawn with: "+this.color);
    }
}
