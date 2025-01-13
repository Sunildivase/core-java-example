

public class enumDemo {

    public static void main(String[] args) {

        enumMethod.level temperaturelevel = enumMethod.level.HIGH;
        enumMethod.level tempLevel = enumMethod.level.LOW;
        enumMethod.level tempValue = enumMethod.level.MEDIUM;

        System.out.println("temp level: "+temperaturelevel);
        System.out.println("temp level: "+tempLevel);
        System.out.println("temp level:"+tempValue);

        enumMethod.direction direction = enumMethod.direction.NORTH;
        enumMethod.direction direction1 = enumMethod.direction.WEST;
        enumMethod.direction direction2 = enumMethod.direction.EAST;
        enumMethod.direction direction3 = enumMethod.direction.SOUTH;

        System.out.println("direction: "+direction);
        System.out.println("direction: "+direction1);
        System.out.println("direction: "+direction2);
        System.out.println("direction:"+direction3);
    }
}
