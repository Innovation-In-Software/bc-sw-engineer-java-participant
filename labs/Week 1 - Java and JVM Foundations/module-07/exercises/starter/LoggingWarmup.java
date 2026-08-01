public class LoggingWarmup {
    static void logError(String context, Exception ex) {
        // TODO: print context + exception type/message (no secrets)
        _____
    }

    public static void main(String[] args) {
        String accountId = "1001";
        try {
            throw new IllegalArgumentException("Invalid amount");
        } catch (IllegalArgumentException ex) {
            logError("withdraw account=" + accountId, ex);
            System.out.println("User message: Transaction failed. Please try again.");
        }
    }
}
