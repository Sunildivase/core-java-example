package advancedSwitch;

public class RecordPatternDemo {
    public static void main(String[] args) {

        Point point1 = new Point(0, 0);
        Point point2 = new Point(4, 6);
        Point point3 = null;

        System.out.println(describePoint(point1));  // default point
        System.out.println(describePoint(point2));  // custom point
        System.out.println(describePoint(point3));  // null values
    }

    private static String describePoint(Point point) {

        return switch (point) {
            case Point(int x, int y) when x == 0 && y == 0 -> "origin point";
            case Point(int x, int y) -> "point at(" + x + "," + y + ") ";
            case null -> "null values";
            default -> throw new IllegalStateException("Unexpected value: " + point);

        };
    }
//    String description = null;
//
//        switch (point){
//        case Point(int x, int y) when x==0 && y==0 -> description="origin point";
//        case Point(int x, int y)  -> description="point at(" + x +","+ y +") ";
//        case null  -> description="null values";
//        default -> throw new IllegalStateException("Unexpected value: " + point);
//    }
//
//        return description;

}
