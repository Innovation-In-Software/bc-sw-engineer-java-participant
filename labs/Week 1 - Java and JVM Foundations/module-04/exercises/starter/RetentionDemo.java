import java.util.ArrayList;
import java.util.List;

public class RetentionDemo {
    // Accidental GC root for the demo
    static final List<byte[]> CACHE = new ArrayList<>();

    public static void main(String[] args) {
        // TODO: add bounded byte[] chunks to CACHE; print used memory
        // TODO: clear CACHE; print used memory again (pattern: rise then drop)
        throw new UnsupportedOperationException("TODO");
    }
}
