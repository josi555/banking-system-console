package src;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private String accountNumber;
    private String holderName;
    private double balance;
    private List<String> transactions;

    public Account(String accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();

        transactions.add("Account created with initial balance: " + initialBalance);
    }

    public void printTransactions() {
        System.out.println("\n📄 Transaction History for " + holderName + ":");

        if (transactions.isEmpty()) {
            System.out.println("No transactions recorded yet.");
            return;
        }

        for (String t : transactions) {
            System.out.println("• " + t);
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("❌ Deposit amount must be greater than zero.");
            return;
        }

        balance += amount;
        transactions.add("Deposited: +" + amount + " | New balance: " + balance);
        System.out.println("✔ Deposit successful. Current balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("❌ Withdrawal amount must be greater than zero.");
            return;
        }

        if (amount > balance) {
            System.out.println("❌ Insufficient funds. Current balance: " + balance);
            return;
        }

        balance -= amount;
        transactions.add("Withdrawn: -" + amount + " | New balance: " + balance);
        System.out.println("✔ Withdrawal successful. Current balance: " + balance);
    }


    public double getBalance() { return balance; }
    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }

}
