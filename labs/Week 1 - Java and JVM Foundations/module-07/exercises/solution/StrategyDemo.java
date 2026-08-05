import java.util.Random;

public class StrategyDemo {
    static final Random random = new Random();

    static int fetchBalance() {
        if (random.nextInt(3) == 0) {
            throw new IllegalStateException(
                    "Service temporarily unavailable");
        }
        return 500;
    }

    static int fetchWithRetry(int maxAttempts) {
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            try {
                return fetchBalance();
            } catch (IllegalStateException ex) {
                System.out.println(
                        "Attempt " + attempt
                        + " failed: " + ex.getMessage());
                if (attempt == maxAttempts) {
                    System.out.println(
                            "Retries exhausted, falling back to default.");
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int balance = fetchWithRetry(3);
        System.out.println("Balance shown to user: " + balance);
    }
}
