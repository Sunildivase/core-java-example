package Abstraction.BankExample;

public abstract class BankService {

    public abstract void disburseLoan();

    public void openAccount(){
        System.out.println("account opened by generic bank");
    }


}
