package demoThread;

public class DemoThreadClass {

    public static void main(String[] args) {

        System.out.println("demo of thread created by extending thread class: ");

        int noOfThreads =5;
        for (int i = 0; i < noOfThreads; i++) {
            DemoThread demoThread = new DemoThread();
            demoThread.start();
        }
    }
}
