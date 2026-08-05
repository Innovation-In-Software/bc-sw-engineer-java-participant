public class PerformanceTest {

    private static class SampleObject {
        private final int value;
        private final byte[] data = new byte[64];

        SampleObject(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        System.out.println("===== Performance Measurement =====");
        MemoryMonitor.printMemoryReport("Start");

        int[] objectCounts = {10, 100, 1_000, 100_000, 1_000_000};

        System.out.println();
        System.out.printf("%-12s %-14s %-18s%n", "Objects", "Used Memory", "Execution Time");
        System.out.println("--------------------------------------------------");

        for (int count : objectCounts) {
            runAllocationTest(count);
        }

        System.out.println();
        System.out.println("Additional measurements:");
        measureLoopExecution();
        measureArrayAllocation();
        measureLargeByteArray();
    }

    private static void runAllocationTest(int count) {
        MemoryMonitor.triggerGarbageCollection();
        long memoryBefore = MemoryMonitor.getUsedMemoryBytes();
        long start = System.nanoTime();

        SampleObject[] objects = new SampleObject[count];
        for (int i = 0; i < count; i++) {
            objects[i] = new SampleObject(i);
        }

        long elapsedMillis = (System.nanoTime() - start) / 1_000_000;
        long memoryAfter = MemoryMonitor.getUsedMemoryBytes();
        long memoryUsed = Math.max(0, memoryAfter - memoryBefore);

        System.out.printf("%-12d %-14.2f MB %-18d ms%n",
                count,
                MemoryMonitor.toMegabytesDouble(memoryUsed),
                elapsedMillis);

        objects = null;
        MemoryMonitor.triggerGarbageCollection();
    }

    private static void measureLoopExecution() {
        long start = System.nanoTime();
        long sum = 0;
        for (int i = 0; i < 10_000_000; i++) {
            sum += i;
        }
        long elapsedMillis = (System.nanoTime() - start) / 1_000_000;
        System.out.printf("Loop execution (10M iterations) : %d ms | sum = %d%n", elapsedMillis, sum);
    }

    private static void measureArrayAllocation() {
        long start = System.nanoTime();
        int[] numbers = new int[1_000_000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        long elapsedMillis = (System.nanoTime() - start) / 1_000_000;
        System.out.printf("int[1,000,000] allocation       : %d ms%n", elapsedMillis);
        numbers = null;
    }

    private static void measureLargeByteArray() {
        MemoryMonitor.printMemoryReport("Before Large byte[]");
        byte[] buffer = new byte[10 * 1024 * 1024];
        MemoryMonitor.printMemoryReport("After 10 MB byte[]");
        buffer = null;
        MemoryMonitor.triggerGarbageCollection();
        MemoryMonitor.printMemoryReport("After Releasing byte[]");
        System.out.println("Gradually increasing allocations can eventually cause OutOfMemoryError.");
    }
}
