package CritcalWk1;

public class BankAccount {

    private String firstName;
    private String lastName;
    private int accountID;
    private double balance;

    public BankAccount() {
        balance = 0;
    }
    public void deposit(double amountDeposited) {
        balance += amountDeposited;
    }
    public void withdraw(double amountWithdrawn) {
        balance -= amountWithdrawn;
        }


    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAccountID() {
        return accountID;
    }
    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public double getBalance() {
        return balance;
    }

    public void accountSummary() {
        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
        System.out.println("Here is your account summary  for " + getFirstName() + " " + getLastName());
        System.out.println("   ID : " + getAccountID());
        System.out.println("   Balance : " + getBalance());
    }

}
