import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingWarmup {
    private static final Logger LOGGER =
            Logger.getLogger(
                    LoggingWarmup.class.getName());

    public static void main(String[] args) {
        String accountId = "A-1001";

        try {
            throw new IllegalStateException(
                    "Withdrawal service unavailable");
        } catch (IllegalStateException ex) {
            LOGGER.log(
                    Level.SEVERE,
                    "Withdrawal failed accountId="
                            + accountId,
                    ex);

            System.out.println(
                    "User message: Withdrawal "
                    + "could not be completed.");
        }
    }
}
