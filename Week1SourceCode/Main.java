package CritcalWk1;

public class Main {
    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount();

        myAccount.deposit(100);

        System.out.println(myAccount.getBalance());


    }
}
