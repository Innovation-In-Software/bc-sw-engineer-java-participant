public class FinallyDemo {
    static void transfer(boolean fail) {
        System.out.println("Transfer started.");

        try {
            if (fail) {
                throw new IllegalStateException(
                        "Transfer service unavailable");
            }
            System.out.println("Transfer completed.");
        } catch (IllegalStateException ex) {
            System.out.println(
                    "Handled: " + ex.getMessage());
        } finally {
            System.out.println(
                    "Cleanup: release transfer session.");
        }
    }

    public static void main(String[] args) {
        transfer(false);
        System.out.println("---");
        transfer(true);
    }
}
