package java17features.switchdemo;

import java.util.Scanner;

public class SwitchDemo {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("please enter level");
        Temperature level = Temperature.valueOf(scanner.nextLine());

        switch (level){
            case LOW -> System.out.println("temperature is low");
            case MEDIUM -> System.out.println("temperature is medium");
//            case HIGH -> System.out.println("temperature is high");
            case HIGH -> throw new Error ("temp. is high");
        }

        System.out.println("temperature level: "+level);
    }
}
