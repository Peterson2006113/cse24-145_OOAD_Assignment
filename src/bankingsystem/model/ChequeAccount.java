package bankingsystem.model;

public class ChequeAccount extends Account implements Withdrawable {
    private String employer;

    public ChequeAccount(String accountNumber, Customer owner, String branch, String employer) {
        super(accountNumber, owner, branch);
        this.employer = employer;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public String getEmployer() { return employer; }
}
