package synchronization;

public class CustomerAccount {
    // synchronization means blocking a memory for a while after free occupy it.

    int balance =10000;

    synchronized void withdraw(int amount){

        System.out.println("going to withdraw amount");
        if(this.balance < amount){
            System.out.println("amount is less please wait for deposit");
            try{
                wait();
            }catch (Exception e){
                System.err.println(e.getMessage());
            }
        }
        this.balance -=amount;
        System.out.println("withdraw completed");

    }

   synchronized void deposit(int amount){

        System.out.println("going to deposit amount");
        this.balance += amount;
        System.out.println("deposit completed");
        notifyAll();

    }


}
