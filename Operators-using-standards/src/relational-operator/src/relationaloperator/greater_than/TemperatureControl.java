package relationaloperator;

import java.util.Scanner;

public class TemperatureControl {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter temperature in degree: ");
        int temperature = Integer.parseInt(scanner.nextLine());

        if(temperature>35){
            System.out.println("activate AC ");
        }
        else {
            System.out.println("normal room temp");
        }
    }
}
