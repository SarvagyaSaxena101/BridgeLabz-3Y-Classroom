package ObjectRelationAndModelling;

import java.util.ArrayList;
import java.util.List;

class Bank {
    private String name;
    public Bank(String name) { this.name = name; }
    public Account openAccount(Customer customer, double balance) {
        Account acc = new Account(this, customer, balance);
        customer.addAccount(acc);
        return acc;
    }
    public String getName() { return name; }
}

class Customer {
    private String name;
    private List<Account> accounts = new ArrayList<>();
    public Customer(String name) { this.name = name; }
    public void addAccount(Account acc) { accounts.add(acc); }
    public void viewBalance() {
        for (Account acc : accounts) {
            System.out.println("Account in " + acc.getBank().getName() + ": " + acc.getBalance());
        }
    }
    public String getName() { return name; }
}

class Account {
    private Bank bank;
    private Customer customer;
    private double balance;
    public Account(Bank bank, Customer customer, double balance) {
        this.bank = bank;
        this.customer = customer;
        this.balance = balance;
    }
    public Bank getBank() { return bank; }
    public double getBalance() { return balance; }
}

public class BankAndAccountAssociation {
    public static void main(String[] args) {
        Bank bank = new Bank("SBI");
        Customer cust = new Customer("Alice");
        bank.openAccount(cust, 1000);
        cust.viewBalance();
    }
}
