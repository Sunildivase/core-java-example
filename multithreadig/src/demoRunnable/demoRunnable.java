package demoRunnable;

public class demoRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("demo thread# "+Thread.currentThread().getId() +
                " with: "+Thread.currentThread().getName() + " is running");
    }
}
