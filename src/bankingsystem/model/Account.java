package bankingsystem.model;

public abstract class Account {
    protected String accountNumber;
    protected double balance;
    protected String branch;
    protected Customer owner;

    public Account(String accountNumber, Customer owner, String branch) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.branch = branch;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() { return balance; }
    public String getAccountNumber() { return accountNumber; }
    public Customer getOwner() { return owner; }

    @Override
    public String toString() {
        return accountNumber + " | Balance: " + balance;
    }
}
