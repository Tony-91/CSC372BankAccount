package SourceCode.Week2SourceCode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIBankingApp extends JFrame {
    private double balance = 0.0; // Initial account balance

    private JLabel balanceLabel;    // JLabel : Swing component that is used to display a text label.
    private JTextField amountField; // JTextField : Swing component that allows users to input text & read user input in the GUI.
    private JButton depositButton;  // JButton : Swing component that represents a clickable button.
    private JButton withdrawButton; // These buttons will perform the bank actions of deposit, withdraw and ...
    private JButton setInitialBalanceButton;    // ... set initial balance.

    // All these instance variables will be used to define and control the graphical elements of the GUI window.

    // constructor sets up the basic properties of the JFrame window, such as title, size, and visibility.
    public GUIBankingApp() {
        setTitle("Simple Banking Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 180);
        setLocationRelativeTo(null); // Center the window on the screen

        initComponents();   // method sets up the buttons, labels, and other GUI elements on the window - method defined down below

        setVisible(true);
    }


    // private helper method
    private void initComponents() {

        // Create components
        balanceLabel = new JLabel("Balance: $" + balance);
        amountField = new JTextField(10);
        depositButton = new JButton("Deposit");
        withdrawButton = new JButton("Withdraw");
        setInitialBalanceButton = new JButton("Set Initial Balance");

        // Set up layout
        setLayout(new GridLayout(4, 2, 10, 10));
        add(new JLabel("Amount:"));
        add(amountField);
        add(depositButton);
        add(new JLabel());
        add(withdrawButton);
        add(balanceLabel);
        add(setInitialBalanceButton);
        add(new JLabel());

        // Add event listeners to each button using anonymous inner class.
        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performTransaction("deposit");
            }
        });
        withdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performTransaction("withdraw");
            }
        });
        setInitialBalanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double amount = Double.parseDouble(amountField.getText());  // convert user input into a double
                    balance = amount;
                    updateBalanceLabel();
                    JOptionPane.showMessageDialog(null, "Initial balance set successfully!");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid amount format.");
                    // pop up windows to show user success or failure messages.
                }
            }
        });
    }

    // THE MEAT OF THE PROGRAM
    // add functionality to each user choice - deposit and withdraw.

    // private helper method used to process deposit and withdrawal transactions based on the user's choice.
    //      The method takes a userChoice parameter, which indicates whether the transaction
    //      is a deposit or a withdrawal.
    private void performTransaction(String userChoice) {
        try {
            double amount = Double.parseDouble(amountField.getText());
            if (amount > 0) {
                if (userChoice.equals("deposit")) {
                    balance += amount;
                    JOptionPane.showMessageDialog(null, "Deposit successful!");
                } else if (userChoice.equals("withdraw")) {
                    if (balance >= amount) {
                        balance -= amount;
                        JOptionPane.showMessageDialog(null, "Withdrawal successful!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Insufficient balance.");
                    }
                }
                updateBalanceLabel();
            } else {
                JOptionPane.showMessageDialog(null, "Please enter a positive amount.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid amount format.");
        }
    }

    // helper method to persistently show user an updated balance.
    private void updateBalanceLabel() {
        balanceLabel.setText("Balance: $" + balance);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new GUIBankingApp();
        });
    }
}




