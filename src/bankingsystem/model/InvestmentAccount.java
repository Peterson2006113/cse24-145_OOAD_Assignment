package bankingsystem.model;

public class InvestmentAccount extends Account implements InterestBearing, Withdrawable {
    private static final double MONTHLY_RATE = 0.05; // 5%

    public InvestmentAccount(String accountNumber, Customer owner, String branch) {
        super(accountNumber, owner, branch);
        if (balance < 500) {
            this.balance = 500;
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    @Override
    public double calculateMonthlyInterest() {
        return balance * MONTHLY_RATE;
    }

    @Override
    public void applyMonthlyInterest() {
        balance += calculateMonthlyInterest();
    }
}
