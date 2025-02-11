package Abstraction.ShapeExample;

public class ShapeDemo {

    public static void main(String[] args) {

        CircleShapeService circleService = new CircleShapeService();
        circleService.displayShape();
        circleService.draw();

        SquareShapeService squareShapeService = new SquareShapeService();
        squareShapeService.displayShape();
        squareShapeService.draw();
        squareShapeService.color();
    }
}
