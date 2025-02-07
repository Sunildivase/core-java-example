package Abstraction;

public class BankAbstractionDemo {
    public static void main(String[] args) {

        SBIBankService sbiBankService = new SBIBankService();
        sbiBankService.openAccount();
        sbiBankService.disburseLoan();
    }
}
