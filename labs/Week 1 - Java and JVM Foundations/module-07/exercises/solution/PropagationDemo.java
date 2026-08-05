public class PropagationDemo {
    static void accountLayer()
            throws InsufficientFundsException {
        throw new InsufficientFundsException(
                100.00, 150.00);
    }

    static void serviceLayer()
            throws InsufficientFundsException {
        accountLayer();
    }

    static void menuLayer()
            throws InsufficientFundsException {
        serviceLayer();
    }

    public static void main(String[] args) {
        try {
            menuLayer();
        } catch (InsufficientFundsException ex) {
            System.out.println(
                    "Caught at main: " + ex.getMessage());
            ex.printStackTrace(System.out);
        }
    }
}
