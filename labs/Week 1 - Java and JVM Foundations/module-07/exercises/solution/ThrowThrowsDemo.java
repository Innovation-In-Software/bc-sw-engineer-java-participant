import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ThrowThrowsDemo {
    static void validateAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Amount must be positive");
        }
    }

    static String loadPolicy(Path path)
            throws IOException {
        return Files.readString(path);
    }

    public static void main(String[] args) {
        try {
            validateAmount(-10);
        } catch (IllegalArgumentException ex) {
            System.out.println(
                    "Validation: " + ex.getMessage());
        }

        try {
            loadPolicy(Path.of("missing-policy.txt"));
        } catch (IOException ex) {
            System.out.println(
                    "Policy file unavailable; "
                    + "caller handled IOException.");
        }
    }
}
