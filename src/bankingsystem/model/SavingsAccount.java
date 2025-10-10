package bankingsystem.model;

public class SavingsAccount extends Account implements InterestBearing {
    private static final double MONTHLY_RATE = 0.0005; // 0.05%

    public SavingsAccount(String accountNumber, Customer owner, String branch) {
        super(accountNumber, owner, branch);
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
