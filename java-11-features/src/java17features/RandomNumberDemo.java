package java17features;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberDemo {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    public static void main(String[] args) {

//        System.out.println("please enter id");
//        int id = Integer.parseInt(scanner.nextLine());

        // when we want random number to id


        System.out.println("received id: "+randomNumber());

    }

    private static int randomNumber() {
        int id = random.nextInt(1111,9999); // we can print random OTP
        return (id < 0) ? (id) * (-1) : id;
    }
}

