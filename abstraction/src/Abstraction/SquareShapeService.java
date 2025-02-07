package Abstraction;

public class SquareShapeService extends ShapeService{
    @Override
    public void draw() {
        System.out.println("square is draw");
    }

    public void color(){
        System.out.println("square color is red");
    }
}
