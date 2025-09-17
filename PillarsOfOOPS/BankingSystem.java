package PillarsOfOOPS;

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }
    public void deposit(double amount) { if (amount > 0) balance += amount; }
    public void withdraw(double amount) { if (amount > 0 && amount <= balance) balance -= amount; }
    public abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan();
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }
    public double calculateInterest() { return getBalance() * 0.04; }
    public void applyForLoan() {}
    public boolean calculateLoanEligibility() { return getBalance() > 10000; }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }
    public double calculateInterest() { return getBalance() * 0.02; }
    public void applyForLoan() {}
    public boolean calculateLoanEligibility() { return getBalance() > 20000; }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[2];
        accounts[0] = new SavingsAccount("S123", "Alice", 15000);
        accounts[1] = new CurrentAccount("C456", "Bob", 25000);
        for (BankAccount acc : accounts) {
            System.out.println(acc.getHolderName() + " Interest: " + acc.calculateInterest());
        }
    }
}
