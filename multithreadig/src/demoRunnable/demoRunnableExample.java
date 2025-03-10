package demoRunnable;

import demoThread.DemoThread;

public class demoRunnableExample {
    public static void main(String[] args) {

        System.out.println("demo of thread created by implementing runnable class: ");

        int noOfThreads =10;
        for (int i = 0; i < noOfThreads; i++) {
            Thread thread = new Thread(new demoRunnable());
            thread.start();
        }
    }
}
