public class GarbageCollectionDemo {
    static class DemoObject {
        private final int id;
        private final byte[] payload;

        DemoObject(int id) {
            this.id = id;
            this.payload = new byte[64];
        }
    }

    public static void main(String[] args) {
        System.out.println("===== Garbage Collection Demonstration =====");
        MemoryMonitor.printMemoryReport("Before Allocation");
        System.out.println();

        long start = System.nanoTime();
        System.out.println("Creating Objects...");
        DemoObject[] objects = new DemoObject[100_000];
        for (int i = 0; i < objects.length; i++) {
            objects[i] = new DemoObject(i);
        }
        System.out.println("Objects Created : " + objects.length);
        System.out.println();

        MemoryMonitor.printMemoryReport("After Allocation");
        System.out.println();

        System.out.println("Removing strong references...");
        objects = null;
        System.out.println();

        MemoryMonitor.triggerGarbageCollection();
        System.out.println();

        MemoryMonitor.printMemoryReport("After GC");

        long elapsedMs = (System.nanoTime() - start) / 1_000_000;
        System.out.println("Execution Time : " + elapsedMs + " ms");
        System.out.println();
        System.out.println("Tip: Run with GC logging using:");
        System.out.println("java -Xlog:gc GargbageCollectionDemo");

    }
}