package relationaloperator;

import java.util.Scanner;

public class PerformanceMonitoring {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter CPU usage % : ");
        int CpuUsage = Integer.parseInt(scanner.nextLine());

        if(CpuUsage > 80){
            System.out.println("CPU usage exceeds ");
        }
        else{
            System.out.println("CPU usage available");
        }
    }
}
