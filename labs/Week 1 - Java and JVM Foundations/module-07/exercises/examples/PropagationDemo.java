public class PropagationDemo {
    static void accountLayer()
            throws InsufficientFundsException {
        // Deepest layer creates the domain failure.
        throw new InsufficientFundsException(
                100.00, 150.00);
    }

    static void serviceLayer()
            throws InsufficientFundsException {
        // No recovery here, so declare and let it propagate.
        accountLayer();
    }

    static void menuLayer()
            throws InsufficientFundsException {
        // Still no recovery action; keep the contract.
        serviceLayer();
    }

    public static void main(String[] args) {
        try {
            menuLayer();
        } catch (InsufficientFundsException ex) {
            // UI/main boundary can show a safe message and keep diagnostics.
            System.out.println(
                    "Caught at main: " + ex.getMessage());
            ex.printStackTrace(System.out);
        }
    }
}