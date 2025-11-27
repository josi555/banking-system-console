package src;

public class TestMain {
    public static void main(String[] args) {

        Bank bank = new Bank();

     
        bank.createAccount("1001", "Yosief", 500.0);
        bank.createAccount("1002", "Sara", 1000.0);
        bank.createAccount("1001", "Duplicate", 300.0); // should fail

     
        Account acc = bank.getAccount("1001");
        System.out.println("\nAccount 1001 belongs to: " + acc.getHolderName());
        System.out.println("Balance: " + acc.getBalance());
    }
}
