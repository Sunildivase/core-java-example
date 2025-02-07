package Abstraction;

public class SBIBankService extends BankService{


    @Override
    public void disburseLoan() {
        System.out.println("loan is being disbursed");
    }

    public void openAccount(){
        System.out.println("account opened by SBI bank!!!");
    }

    // we can override openAccount() method
    // cause same method in bankService gives output accordingly

}
