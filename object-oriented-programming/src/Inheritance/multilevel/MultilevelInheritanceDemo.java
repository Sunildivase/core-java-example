package Inheritance.multilevel;

public class MultilevelInheritanceDemo {

    public static void main(String[] args) {

        BasicSavingAccount basicSavingAccount = new BasicSavingAccount();
        PremiumSavingAccount premiumSavingAccount = new PremiumSavingAccount();
        HomeLoanAccount homeLoanAccount = new HomeLoanAccount();
        CarLoanAccount carLoanAccount = new CarLoanAccount();

        basicSavingAccount.openAccount();
        basicSavingAccount.basicAccount();
        premiumSavingAccount.openAccount();
        premiumSavingAccount.premiumAccount();
        homeLoanAccount.openAccount();
        homeLoanAccount.homeLoanAccount();
        carLoanAccount.openAccount();
        carLoanAccount.carLoanAccount();

    }
}
