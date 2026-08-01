public class Account {
    // Field declared — focus on validation logic, not getters boilerplate later in Lab 3
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        balance = initialBalance;
    }

    public void deposit(double amount) {
        // TODO: reject non-positive amounts; else add to balance
        throw new UnsupportedOperationException("TODO");
    }

    public boolean withdraw(double amount) {
        // TODO: reject if amount <= 0 OR amount > balance; else subtract and return true
        throw new UnsupportedOperationException("TODO");
    }

    public double getBalance() {
        return balance;
    }
}
