package SourceCode.Week1CMDLineApp;

public class Main {
    public static void main(String[] args) {
        CheckingAccount myAccount = new CheckingAccount();

        myAccount.deposit(100);

        myAccount.setAccountID(1991);
        myAccount.setFirstName("Toby");
        myAccount.setLastName("Ortiz");

        myAccount.displayAccount();

        myAccount.withdraw(99);
        myAccount.processWithdraw();
        myAccount.displayAccount();

        myAccount.withdraw(100);
        myAccount.processWithdraw();
        myAccount.displayAccount();
    }
}
