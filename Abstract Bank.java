// Abstract class
abstract class BankAccount {
    protected double balance;
    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    // Abstract method for deposit
    public abstract void deposit(double amount);
    // Abstract method for withdraw
    public abstract void withdraw(double amount);
    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}
// Subclass for Savings Account
class SavingsAccount extends BankAccount {
    private static final double MIN_BALANCE = 100.0; // Minimum balance for savings account
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Withdrawal denied. Insufficient funds or below minimum balance.");
        }
    }
}
// Subclass for Current Account
class CurrentAccount extends BankAccount {
    public CurrentAccount(double initialBalance) {
        super(initialBalance);
    }
    @Override public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    @Override public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Withdrawal denied. Insufficient funds.");
        }
    }
}
// Main class to test the functionality
public class Bank{
    public static void main(String[] args) {
// Create a Savings Account
        BankAccount savingsAccount = new SavingsAccount(500.0);
        savingsAccount.deposit(200.0);
        savingsAccount.withdraw(100.0);
        savingsAccount.withdraw(600.0);

        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
// Create a Current Account
        BankAccount currentAccount = new CurrentAccount(1000.0);
        currentAccount.deposit(300.0);
        currentAccount.withdraw(500.0);
        currentAccount.withdraw(900.0); // Should fail due to insufficient funds
        System.out.println("Current Account Balance: " + currentAccount.getBalance());
    }
}

