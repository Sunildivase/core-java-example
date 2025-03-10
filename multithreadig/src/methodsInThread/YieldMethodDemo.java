package methodsInThread;

public class YieldMethodDemo extends Thread {

    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
        }
    }

    public static void main(String[] args) {

        YieldMethodDemo t1 = new YieldMethodDemo();
        YieldMethodDemo t2 = new YieldMethodDemo();
        YieldMethodDemo t3 = new YieldMethodDemo();

        t1.start();
        t2.start();
        t3.start();

        for (int i = 0; i < 5; i++) {
            Thread.yield();  // when core is idle condition and want to give work to idle core yield is used.

            System.out.println(Thread.currentThread().getName()+ " running");
        }
    }

}
