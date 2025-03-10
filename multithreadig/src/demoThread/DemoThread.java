package demoThread;

public class DemoThread extends Thread{

    public void run(){
        System.out.println("demo thread# "+Thread.currentThread().getId() +
                 " with: "+Thread.currentThread().getName() + " is running");
    }
}
