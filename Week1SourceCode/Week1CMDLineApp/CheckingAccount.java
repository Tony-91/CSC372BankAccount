package SourceCode.Week1CMDLineApp;

public class CheckingAccount extends BankAccount {
    // Class attribute to store the interest rate for the account
    private double interestRate = 0;

    // Constant to define the overdraft fee amount
    private final double OVERDRAFT_FEE = 30;

    // Method to process a withdrawal from the account
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
    // Method to display the account details
    public void displayAccount() {
        super.accountSummary(); // Call the accountSummary method from the parent class
        System.out.println("   Interest rate : " + interestRate); // Display the interest rate
        System.out.println();
    }


}
