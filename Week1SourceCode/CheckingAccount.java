package CritcalWk1;

public class CheckingAccount extends BankAccount {

    private double interestRate;

    public void processWithdraw() {
        if (getBalance() < 0) {
            System.out.println("Insufficient funds - an overdraft fee of $30 will be applied");
        } else {
            System.out.println("Withdraw success!");
        }
    }

    public void displayAccount() {


    }

}
