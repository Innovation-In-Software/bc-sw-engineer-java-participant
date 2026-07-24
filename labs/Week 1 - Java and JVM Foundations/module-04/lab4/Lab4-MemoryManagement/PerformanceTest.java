public class PerformanceTest {
    static class DemoObject {
        private final int id;

        DemoObject(int id) {
            this.id = id;
        }
    }

    public static void main(String[] args) {
        System.out.println("===== Performance Measurement =====");
        System.out.printf("%-12s %-14s %-14s%n", "Objects", "Used Memory", "Execution Time");
        System.out.println("--------------------------------------------------");

        int[] counts = {10, 100, 1000, 100_000, 1_000_000};
        for (int count : counts) {
            measureAllocation(count);
        }

        System.out.println();
        System.out.println("Additional measurements:");
        measureLoop();
        measureLargeArray();
        measureLargeByteArray();
    }

    private static void measureAllocation(int count) {
        System.gc();
        long before = MemoryMonitor.usedMemoryMb();
        long start = System.nanoTime();

        DemoObject[] objects = new DemoObject[count];
        for (int i = 0; i < count; i++) {
            objects[i] = new DemoObject(i);
        }

        long elapsedMs = (System.nanoTime() - start) / 1_000_000;
        long after = MemoryMonitor.usedMemoryMb();

        System.out.printf("%-12d %-14s %-14s%n",
                count, (after - before) + " MB", elapsedMs + " ms");

        objects = null;
    }

    private static void measureLoop() {
        long start = System.nanoTime();
        long sum = 0;
        for (int i = 0; i < 10_000_000; i++) {
            sum += i;
        }
        long elapsedMs = (System.nanoTime() - start) / 1_000_000;
        System.out.println("Loop execution (10M iterations) : " + elapsedMs + " ms | sum = " + sum);
    }

    private static void measureLargeArray() {
        long start = System.nanoTime();
        int[] largeArray = new int[1_000_000];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = i;
        }
        long elapsedMs = (System.nanoTime() - start) / 1_000_000;
        System.out.println("int[1,000,000] allocation       : " + elapsedMs + " ms");
    }

    private static void measureLargeByteArray() {
        MemoryMonitor.printMemoryReport("Before Large byte[]");
        byte[] payload = new byte[10 * 1024 * 1024];
        MemoryMonitor.printMemoryReport("After Large byte[]");
        System.out.println("Allocated payload length : " + payload.length + " bytes");
    }
}