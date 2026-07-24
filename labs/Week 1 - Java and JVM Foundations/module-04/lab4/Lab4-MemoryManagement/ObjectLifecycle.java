public class ObjectLifecycle {
    public static void main(String[] args) {
        System.out.println("===== Object Lifecycle Demonstration =====");

        System.out.println("Step 1: Create object");
        Person person = new Person("Aman", 28);
        System.out.println("Created -> " + person + " (identity hash: "
                + System.identityHashCode(person) + ")");

        System.out.println("Step 2: Use the object");
        System.out.println("Name via getter: " + person.getName());
        System.out.println("Age via getter: " + person.getAge());

        System.out.println("Step 3: Hold reference");
        Person secondReference = person;
        System.out.println("secondReference points to same object : "
                + (System.identityHashCode(person) == System.identityHashCode(secondReference)));

        System.out.println("Step 4: Remove references");
        person = null;
        System.out.println("person set to null; object still reachable through secondReference");
        secondReference = null;
        System.out.println("secondReference set to null; object is now unreachable");

        System.out.println("Step 5: Eligible for Garbage Collection");
        MemoryMonitor.printMemoryReport("Before GC");
        MemoryMonitor.triggerGarbageCollection();
        MemoryMonitor.printMemoryReport("After GC");
        System.out.println("\nAn object becomes eligible for GC when no live thread can reach it.");
    }
}