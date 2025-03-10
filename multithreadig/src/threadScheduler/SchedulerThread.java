package threadScheduler;

public class SchedulerThread {

    public static void main(String[] args) {

        System.out.println("==================main thread start here =============================");

        SportsCarThread sportsCarThread = new SportsCarThread();
        PassengerCarThread passengerCarThread = new PassengerCarThread();
        ElectricCarThread electricCarThread = new ElectricCarThread();

        Thread currentThread = Thread.currentThread();
        System.out.println("thread name: "+currentThread.getName());

        sportsCarThread.setPriority(Thread.MAX_PRIORITY);
        passengerCarThread.setPriority(Thread.MIN_PRIORITY);
        electricCarThread.setPriority(Thread.NORM_PRIORITY);


        passengerCarThread.start();
        sportsCarThread.start();    // if we don't give sequence then also take priority
        electricCarThread.start();

        System.out.println("=================main thread ends here =============================");

    }
}

class SportsCarThread extends Thread{
    int sportsCarCount =0;
    public void run(){

        while (sportsCarCount<=3){
            System.out.println("value: "+ ++sportsCarCount +"in thread sportsCar");
        }
    }
}

class PassengerCarThread extends Thread{
    int passengerCarCount =0;
    public void run(){

        while (passengerCarCount<=3){
            System.out.println("value: "+ ++passengerCarCount +"in thread passengerCar");
        }
    }
}

class ElectricCarThread extends Thread{
    int electricCarCount =0;
    public void run(){

        while (electricCarCount<=3){
            System.out.println("value: "+ ++electricCarCount +"in thread electricCar");
        }
    }
}
