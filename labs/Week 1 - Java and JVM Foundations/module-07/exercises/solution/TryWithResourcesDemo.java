import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TryWithResourcesDemo {
    public static void main(String[] args) {
        Path file = Path.of("transactions.txt");

        try {
            Files.writeString(
                    file, "deposit 100\nwithdraw 25\n");

            try (BufferedReader reader =
                    Files.newBufferedReader(file)) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println("Read: " + line);
                }
            }

            System.out.println(
                    "Reader closed automatically.");
        } catch (IOException ex) {
            System.out.println(
                    "File error: " + ex.getMessage());
        }
    }
}
