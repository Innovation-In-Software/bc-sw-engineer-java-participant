public class InsufficientFundsException
        extends Exception { // checked because it extends Exception
    private final double balance;
    private final double requested;

    public InsufficientFundsException(
            double balance, double requested) {
        // Message carries domain context for logs and UI boundaries.
        super(("Insufficient funds: balance=%.2f, "
                + "requested=%.2f")
                .formatted(balance, requested));
        this.balance = balance;
        this.requested = requested;
    }

    public double getBalance() {
        return balance;
    }

    public double getRequested() {
        return requested;
    }
}