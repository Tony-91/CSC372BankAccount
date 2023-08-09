package SourceCode.Week1CMDLineApp;

public class BankAccount {
    // Class attributes
    private String firstName;   // Stores the first name of the account holder
    private String lastName;    // Stores the last name of the account holder
    private int accountID;      // Stores the account ID
    private double balance;     // Stores the current balance of the account
    // Default constructor
    public BankAccount() {
        balance = 0;   // Initialize balance to 0
    }
    // Method to deposit money into the account
    public void deposit(double amountDeposited) {
        balance += amountDeposited; // Add the deposited amount to the balance
    }
    // Method to withdraw money from the account
    public void withdraw(double amountWithdrawn) {
        balance -= amountWithdrawn; // Subtract the withdrawn amount from the balance
    }
    // Getter method for retrieving the first name
    public String getFirstName() {
        return firstName;
    }
    // Setter method for setting the first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    // Getter method for retrieving the last name
    public String getLastName() {
        return lastName;
    }
    // Setter method for setting the last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    // Getter method for retrieving the account ID
    public int getAccountID() {
        return accountID;
    }
    // Setter method for setting the account ID
    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }
    // Getter method for retrieving the account balance
    public double getBalance() {
        return balance;
    }
    // Method to display an account summary
    public void accountSummary() {
        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
        System.out.println("Here is your account summary  for " + getFirstName() + " ");

    }
}