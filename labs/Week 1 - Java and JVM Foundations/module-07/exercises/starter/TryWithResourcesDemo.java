import java.io.Closeable;

public class TryWithResourcesDemo {
    static class DemoResource implements Closeable {
        @Override
        public void close() {
            System.out.println("close()");
        }
    }

    public static void main(String[] args) {
        // TODO: try-with-resources; body may throw; close must still print
        try (DemoResource resource = new DemoResource()) {
            System.out.println("using resource");
            // TODO: optionally throw to prove close still runs
            _____
        } catch (Exception ex) {
            System.out.println("caught: " + ex.getClass().getSimpleName());
        }
    }
}
