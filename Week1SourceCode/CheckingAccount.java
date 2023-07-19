package CritcalWk1;

public class CheckingAccount extends BankAccount {

    private double interestRate = 0;
    private final double OVERDRAFT_FEE = 30;

    public void processWithdraw() {
        System.out.println("Processing withdrawal...");
        if (getBalance() < 0) {
            System.out.println("WARNING account is overdrawn! A balance of " + getBalance() + " remains.");
            System.out.println("An overdraft fee of $30.00 will be applied");
        } else {
            System.out.println("Withdrawal processed successfully!");
            System.out.println("Remaining balance : " + getBalance());
        }
        System.out.println();
    }

    public void displayAccount() {
        super.accountSummary();
        System.out.println("   Interest rate : " + interestRate);
        System.out.println();
    }

}
