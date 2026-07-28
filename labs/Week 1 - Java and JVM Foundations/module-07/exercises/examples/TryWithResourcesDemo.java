import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TryWithResourcesDemo {
    public static void main(String[] args) {
        // Relative path: current working directory must be the exercises folder.
        Path file = Path.of("transactions.txt");

        try {
            Files.writeString(
                    file, "deposit 100\nwithdraw 25\n");

            // Resource header creates and later closes the reader automatically.
            try (BufferedReader reader =
                         Files.newBufferedReader(file)) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println("Read: " + line);
                }
            } // reader.close() happens here automatically

            System.out.println(
                    "Reader closed automatically.");
        } catch (IOException ex) {
            // Checked IO failures must be handled or declared.
            System.out.println(
                    "File error: " + ex.getMessage());
        }
    }
}