class BankAccount {
    private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }
}

class SavingsAccount extends BankAccount {
    private double interestRate;
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    public void displayAccountType() { System.out.println("Savings Account"); }
}

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    public void displayAccountType() { System.out.println("Checking Account"); }
}

class FixedDepositAccount extends BankAccount {
    private int maturityPeriod;
    public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }
    public void displayAccountType() { System.out.println("Fixed Deposit Account"); }
}

public class BankAccountTypes {
    public static void main(String[] args) {
        BankAccount[] accounts = {
            new SavingsAccount("S1", 1000, 0.05),
            new CheckingAccount("C1", 2000, 500),
            new FixedDepositAccount("F1", 5000, 12)
        };
        for (BankAccount acc : accounts) {
            if (acc instanceof SavingsAccount) ((SavingsAccount)acc).displayAccountType();
            if (acc instanceof CheckingAccount) ((CheckingAccount)acc).displayAccountType();
            if (acc instanceof FixedDepositAccount) ((FixedDepositAccount)acc).displayAccountType();
        }
    }
}
