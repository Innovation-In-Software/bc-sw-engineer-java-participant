import java.util.ArrayList;
import java.util.List;

public class MemoryLeakDemo {
    static class EmployeeRecord {
        private final int id;
        private final byte[] payload;

        EmployeeRecord(int id) {
            this.id = id;
            this.payload = new byte[64];
        }
    }

    private static final List<EmployeeRecord> LEAKING_CACHE = new ArrayList<>();

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java MemoryLeakDemo <leak|fix>");
            return;
        }

        switch (args[0]) {
            case "leak" -> runLeak();
            case "fix" -> runFix();
            default -> System.out.println("Usage: java MemoryLeakDemo <leak|fix>");
        }
    }

    private static void runLeak() {
        System.out.println("===== Memory Leak Demonstration =====");
        System.out.println("Adding employees to a static list that is never cleared...");
        System.out.println("(This loop runs until stopped - press Ctrl+C after a few lines.)");
        System.out.println();

        int batch = 100_000;

        while (true) {
            for (int i = 0; i < batch; i++) {
                LEAKING_CACHE.add(new EmployeeRecord(LEAKING_CACHE.size()));
            }
            System.out.println("Added " + LEAKING_CACHE.size() + " employees");
            MemoryMonitor.printMemoryReport("After " + LEAKING_CACHE.size() + " Objects");
            System.out.println();
            System.out.println("Observation:");
            System.out.println("- Memory keeps increasing because objects remain reachable");
            System.out.println("GC cannot collect objects that are still referenced");
            System.out.println();
        }
    }

    private static void runFix() {
        System.out.println("===== Memory Leak Fix Demonstration =====");
        MemoryMonitor.printMemoryReport("Before Allocation");
        System.out.println();

        List<EmployeeRecord> localCache = new ArrayList<>();
        int batch = 100_000;
        for (int i = 0; i < batch; i++) {
            localCache.add(new EmployeeRecord(i));
        }
        System.out.println("Added " + localCache.size() + " employees to a local list");
        MemoryMonitor.printMemoryReport("After Allocation");
        System.out.println();

        System.out.println("Clearing list to remove strong references...");
        localCache.clear();
        localCache = null;
        System.out.println();

        MemoryMonitor.triggerGarbageCollection();
        System.out.println();

        MemoryMonitor.printMemoryReport("After GC");
        System.out.println();

        System.out.println("Observation:");
        System.out.println("- Clearing the list removes references -> EmployeeRecord objects");
        System.out.println("- Nulling the list reference removes the last path to the list itself");
        System.out.println("- Used memory drops after GC because the records are now unreachable");
    }
}