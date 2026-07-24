public class MemoryMonitor {
    private static final long MB = 1024L * 1024L;

    public static void printMemoryReport(String label) {
        Runtime runtime = Runtime.getRuntime();
        long total = runtime.totalMemory();
        long free = runtime.freeMemory();
        long used = total - free;
        long max = runtime.maxMemory();

        System.out.println("===== JVM Memory Report: " + label + " =====");
        System.out.printf("Total Memory : %d MB%n", toMb(total));
        System.out.printf("Free Memory : %d MB%n", toMb(free));
        System.out.printf("Used Memory : %d MB%n", toMb(used));
        System.out.printf("Max Memory : %d MB%n", toMb(max));
    }

    public static long usedMemoryBytes() {
        Runtime runtime = Runtime.getRuntime();
        return runtime.totalMemory() - runtime.freeMemory();
    }

    public static long usedMemoryMb() {
        return toMb(usedMemoryBytes());
    }

    public static long toMb(long bytes) {
        return bytes / MB;
    }

    public static void triggerGarbageCollection() {
        System.out.println("Triggering Garbage Collection...");
        System.gc();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Garbage Collection Completed");
    }
}