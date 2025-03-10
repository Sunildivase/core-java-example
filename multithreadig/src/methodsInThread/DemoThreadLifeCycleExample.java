package methodsInThread;

class Motorcycle implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        System.out.println("state of motorcycle while it called join() method on truck thread -"+DemoThreadLifeCycleExample.thread.getState());
    }

}
public class DemoThreadLifeCycleExample implements Runnable {

    static DemoThreadLifeCycleExample demoThreadLifeCycleExample = new DemoThreadLifeCycleExample();
    static Thread thread = new Thread(demoThreadLifeCycleExample);
    public static void main(String[] args) {


        System.out.println("state of demoThreadLifeCycle thread after creating it-"+thread.getState());
        thread.start();
        System.out.println("state of demoThreadLifeCycle thread start() creating it-"+thread.getState());
    }

        @Override
        public void run() {
            Motorcycle motorcycle = new Motorcycle();
            Thread secondaryMotorcycle = new Thread(motorcycle);

            System.out.println("state of secondary motorcycle thread after creating it -" + secondaryMotorcycle.getState());
            secondaryMotorcycle.start();

            System.out.println("state of secondary motorcycle thread after start() it-" + secondaryMotorcycle.getState());
            try {
                Thread.sleep(250);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            System.out.println("state of motorcycle while it called sleep() method on truck thread -" + secondaryMotorcycle.getState());

            try {
                secondaryMotorcycle.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("state of motorcycle while it called join() method on truck thread -" + secondaryMotorcycle.getState());

        }
    }


