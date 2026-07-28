public class FinallyDemo {
    static void transfer(boolean fail) {
        System.out.println("Transfer started.");

        try {
            if (fail) {
                // Simulate a recoverable service failure.
                throw new IllegalStateException(
                        "Transfer service unavailable");
            }
            System.out.println("Transfer completed.");
        } catch (IllegalStateException ex) {
            // Handle the failure without terminating main.
            System.out.println(
                    "Handled: " + ex.getMessage());
        } finally {
            // Cleanup runs after success and after handled failure.
            System.out.println(
                    "Cleanup: release transfer session.");
        }
    }

    public static void main(String[] args) {
        transfer(false); // success path
        System.out.println("---");
        transfer(true);  // failure path
    }
}