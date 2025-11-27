package src;

import java.util.HashMap;
import java.util.Map;

public class Bank {

 
    private Map<String, Account> accounts;

   
    public Bank() {
        this.accounts = new HashMap<>();
    }


    public void createAccount(String accountNumber, String holderName, double initialBalance) {
        if (accounts.containsKey(accountNumber)) {
            System.out.println("❌ Account with number " + accountNumber + " already exists.");
            return;
        }

        Account account = new Account(accountNumber, holderName, initialBalance);
        accounts.put(accountNumber, account);
        System.out.println("✔ Account created for " + holderName + " with number " + accountNumber);
    }


    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }
}

