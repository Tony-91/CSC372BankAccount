<h1 align="center">Bank Account Management System :moneybag:</h1>

<p align="center">This is a Java program for managing bank accounts, including basic operations like deposits, withdrawals, and overdraft handling. The program consists of three classes: <code>BankAccount</code>, <code>CheckingAccount</code>, and <code>Main</code>. It allows users to create and manage checking accounts with overdraft protection.</p>

<h2 align="center">Features :star2:</h2>

- Create a bank account with a unique account ID and initial balance of 0.
- Deposit money into the account.
- Withdraw money from the account, with overdraft protection.
- View account summary, including ID, balance, and interest rate (for checking accounts).

<h2 align="center">How to Use :computer:</h2>

1. Clone the repository to your local machine.
2. Open the project in your Java IDE.
3. Compile and run the <code>Main</code> class.
4. Follow the on-screen instructions to interact with the bank account.

<h2 align="center">Class Descriptions :page_with_curl:</h2>

<h3 align="center">BankAccount</h3>

- Properties:
  - `firstName`: First name of the account holder.
  - `lastName`: Last name of the account holder.
  - `accountID`: Unique identifier for the account.
  - `balance`: Current balance in the account.

- Methods:
  - `deposit(double amountDeposited)`: Adds the given amount to the account balance.
  - `withdraw(double amountWithdrawn)`: Subtracts the given amount from the account balance.
  - `accountSummary()`: Prints an account summary with the account holder's name, ID, and balance.

<h3 align="center">CheckingAccount</h3>

- Inheritance: Inherits from the <code>BankAccount</code> class.

- Additional Properties:
  - `interestRate`: Interest rate for the checking account.
  - `OVERDRAFT_FEE`: Constant representing the fee charged for overdrawing the account.

- Additional Methods:
  - `processWithdraw()`: Handles overdraft protection and displays messages accordingly.
  - `displayAccount()`: Overrides the <code>accountSummary()</code> method to include interest rate information.

<h3 align="center">Main</h3>

- The main class where you can create and interact with checking accounts.

<h2 align="center">Sample Output :chart_with_upwards_trend:</h2>

```plaintext
=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
Here is your account summary for Toby Ortiz
   ID: 1991
   Balance: 100.0
   Interest rate: 0.0

Processing withdrawal...
Withdrawal processed successfully!
Remaining balance: 1.0

=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
Here is your account summary for Toby Ortiz
   ID: 1991
   Balance: 1.0
   Interest rate: 0.0

Processing withdrawal...
WARNING account is overdrawn! A balance of -99.0 remains.
An overdraft fee of $30.00 will be applied

=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
Here is your account summary for Toby Ortiz
   ID: 1991
   Balance: -129.0
   Interest rate: 0.0
