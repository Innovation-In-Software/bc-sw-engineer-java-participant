import java.lang.ref.WeakReference;

public class WeakReferenceDemo {

    public static void main(String[] args) {
        System.out.println("===== Weak Reference Demonstration =====");

        System.out.println("--- Strong Reference ---");
        Person strongPerson = new Person("Strong User", 40);
        System.out.println("Before GC : " + strongPerson);
        MemoryMonitor.triggerGarbageCollection();
        System.out.println("After GC  : " + strongPerson);
        System.out.println("Object remains because a strong reference still exists.");

        System.out.println();
        System.out.println("--- Weak Reference ---");
        Person weakTarget = new Person("Weak User", 35);
        WeakReference<Person> weakReference = new WeakReference<>(weakTarget);
        System.out.println("Before removing strong reference : " + weakReference.get());

        weakTarget = null;
        System.out.println("Strong reference removed.");
        MemoryMonitor.triggerGarbageCollection();

        Person recovered = weakReference.get();
        System.out.println("After GC via WeakReference.get() : " + recovered);
        System.out.println();
        System.out.println("Observation:");
        System.out.println("- WeakReference allows GC to collect the object when only weak refs remain");
        System.out.println("- Useful for caches and listeners that should not block memory cleanup");
    }
}
