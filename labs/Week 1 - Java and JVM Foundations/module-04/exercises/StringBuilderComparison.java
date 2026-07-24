public class StringBuilderComparison {
    private static final int ITERATIONS = 50_000;

    static String withString() {
        String result = "";
        for (int i = 0; i < ITERATIONS; i++) {
            // Each update creates another String result.
            result += "x";
        }
        return result;
    }

    static String withBuilder() {
        // Initial capacity avoids repeated buffer growth.
        StringBuilder result =
                new StringBuilder(ITERATIONS);
        for (int i = 0; i < ITERATIONS; i++) {
            result.append('x');
        }
        return result.toString();
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        String stringResult = withString();
        long stringNanos = System.nanoTime() - start;

        start = System.nanoTime();
        String builderResult = withBuilder();
        long builderNanos = System.nanoTime() - start;

        System.out.printf(
                "String: %d chars, %.3f ms%n",
                stringResult.length(),
                stringNanos / 1_000_000.0);
        System.out.printf(
                "StringBuilder: %d chars, %.3f ms%n",
                builderResult.length(),
                builderNanos / 1_000_000.0);
    }
}