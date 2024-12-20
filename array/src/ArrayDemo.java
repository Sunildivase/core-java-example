import java.util.Scanner;

public class ArrayDemo {

    // array:- static collection of items

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int customerArraySize = 4;
        ArrayDemo arrayDemo = new ArrayDemo();
        Customer[] customers = new Customer[4];

        // accept customer of array size
        for (int i = 0; i < 4; i++) {
            Customer customer = arrayDemo.customerAccept();
            customers[i] = customer;
        }

      // print customers of customers[]
        for (int i = 0; i < 4; i++) {

            System.out.println("customer-" + i +" :"+ customers[i]);

        }
    }
    static class Customer{

        String fName;
        String lName;

        @Override
        public String toString() {
            return "Customer{" +
                    "fName='" + fName + '\'' +
                    ", lName='" + lName + '\'' +
                    '}';
        }
    }

    private Customer customerAccept(){

        System.out.println("please enter first name");
        String fName = scanner.nextLine();

        System.out.println("please enter last name");
        String lName = scanner.nextLine();

        Customer customer = new Customer();
        customer.fName = fName;
        customer.lName = lName;
        return customer;

    }
}
