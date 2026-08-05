import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMemoryComparison {

    public static void main(String[] args) {
        System.out.println("===== Bonus: ArrayList vs LinkedList =====");
        int count = 100_000;

        MemoryMonitor.triggerGarbageCollection();
        long before = MemoryMonitor.getUsedMemoryBytes();
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            arrayList.add(i);
        }
        long arrayListMemory = MemoryMonitor.getUsedMemoryBytes() - before;
        System.out.printf("ArrayList memory approx : %.2f MB%n",
                MemoryMonitor.toMegabytesDouble(arrayListMemory));

        arrayList = null;
        MemoryMonitor.triggerGarbageCollection();

        before = MemoryMonitor.getUsedMemoryBytes();
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            linkedList.add(i);
        }
        long linkedListMemory = MemoryMonitor.getUsedMemoryBytes() - before;
        System.out.printf("LinkedList memory approx : %.2f MB%n",
                MemoryMonitor.toMegabytesDouble(linkedListMemory));

        System.out.println();
        System.out.println("ArrayList usually uses less memory per element than LinkedList node overhead.");
    }
}
