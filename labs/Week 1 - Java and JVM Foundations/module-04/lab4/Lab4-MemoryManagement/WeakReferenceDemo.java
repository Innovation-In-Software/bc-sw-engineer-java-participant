import java.lang.ref.WeakReference;

public class WeakReferenceDemo {
    public static void main(String[] args) {
        System.out.println("===== Weak Reference Demonstration =====");

        System.out.println("--- Strong Reference ---");
        Person strongPerson = new Person("Aman", 30);
        MemoryMonitor.printMemoryReport("Before GC");
        MemoryMonitor.triggerGarbageCollection();
        MemoryMonitor.printMemoryReport("After GC");
        System.out.println("Object remains because a strong reference still exists.");
        System.out.println();

        System.out.println("--- Weak Reference ---");
        Person weakTarget = new Person("Priya", 26);
        WeakReference<Person> weakReference = new WeakReference<>(weakTarget);
        System.out.println("Before removing strong reference : " + weakReference.get());

        weakTarget = null;
        System.out.println("Strong reference removed.");

        MemoryMonitor.triggerGarbageCollection();
        System.out.println("After GC via WeakReference.get() : " + weakReference.get());
        System.out.println();

        System.out.println("Observation:");
        System.out.println("- WeakReference allows GC to collect the object when only weak refs remain");
    }
}