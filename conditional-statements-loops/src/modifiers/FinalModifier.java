package modifiers;

public class FinalModifier {

    public final String GREETING_MSG="Hello Pune";
    public final int DEFAULT_LOAD=10;
    public final double DEFAULT_TEMPERATURE=36.5;
    public final char DEFAULT_CHAR='a';
    public final boolean DEFAULT_FLAG=false;
    public static final String GREETING_MSG_TO_WORLD="Hello world..";

    public static void main(String[] args) {

        FinalModifier finalModifier = new FinalModifier();
        System.out.println("greeting msg "+finalModifier.GREETING_MSG);
        System.out.println("msg "+ GREETING_MSG_TO_WORLD);

        finalModifier.PrintMsg();
    }

    public void PrintMsg(){
        System.out.println("default temp "+DEFAULT_TEMPERATURE);
        System.out.println("default load "+DEFAULT_LOAD);
        System.out.println("default char "+DEFAULT_CHAR);
        System.out.println("default flag "+DEFAULT_FLAG);
    }
}
