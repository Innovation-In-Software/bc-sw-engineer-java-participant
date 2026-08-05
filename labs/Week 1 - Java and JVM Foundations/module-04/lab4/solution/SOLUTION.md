# Lab 4 — Complete reference solution

> **Finished project.** Attempt the starter first, then compare.
>
> Guide: [`../LAB-4-GUIDE.md`](../LAB-4-GUIDE.md)

## Goal

**Memory / GC observation**

## How to run

```powershell
cd $env:USERPROFILE\java-bootcamp\examples
# Copy this solution folder contents into your lab4 project, then:
cd Lab4-MemoryManagement
# compile/run per LAB-4-GUIDE
```

## Complete Java sources (12 files)

### `Lab4-MemoryManagement/GarbageCollectionDemo.java`

```java
public class GarbageCollectionDemo {

    private static class DemoObject {
        private final String label;
        private final byte[] payload = new byte[128];

        DemoObject(String label) {
            this.label = label;
        }
    }

    public static void main(String[] args) {
        System.out.println("===== Garbage Collection Demonstration =====");
        long startTime = System.nanoTime();

        MemoryMonitor.printMemoryReport("Before Allocation");

        DemoObject[] objects = new DemoObject[100000];
        System.out.println("Creating Objects...");
        for (int i = 0; i < objects.length; i++) {
            objects[i] = new DemoObject("Object-" + i);
        }

        System.out.println("Objects Created : " + objects.length);
        MemoryMonitor.printMemoryReport("After Allocation");

        System.out.println("Removing strong references...");
        objects = null;

        System.out.println("Triggering Garbage Collection...");
        MemoryMonitor.triggerGarbageCollection();
        System.out.println("Garbage Collection Completed");
        MemoryMonitor.printMemoryReport("After GC");

        long elapsedMillis = (System.nanoTime() - startTime) / 1_000_000;
        System.out.printf("Execution Time : %d ms%n", elapsedMillis);
        System.out.println();
        System.out.println("Tip: Run with GC logging using:");
        System.out.println("java -Xlog:gc GarbageCollectionDemo");
    }
}
```

### `Lab4-MemoryManagement/HeapExample.java`

```java
public class HeapExample {

    static class Student {
        private final String name;

        Student(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{name='" + name + "'}";
        }
    }

    static class Employee {
        private final int id;

        Employee(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Employee{id=" + id + "}";
        }
    }

    static class Customer {
        private final String customerId;

        Customer(String customerId) {
            this.customerId = customerId;
        }

        @Override
        public String toString() {
            return "Customer{customerId='" + customerId + "'}";
        }
    }

    static class Book {
        private final String title;

        Book(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return "Book{title='" + title + "'}";
        }
    }

    public static void main(String[] args) {
        System.out.println("===== Heap Memory Demonstration =====");
        MemoryMonitor.printMemoryReport("Before Allocation");

        Student student = new Student("John");
        Employee employee = new Employee(101);
        Customer customer = new Customer("C-5001");
        Book book = new Book("Effective Java");

        System.out.println("Objects created on the heap:");
        printObjectInfo("student", student);
        printObjectInfo("employee", employee);
        printObjectInfo("customer", customer);
        printObjectInfo("book", book);

        MemoryMonitor.printMemoryReport("After Allocation");

        System.out.println("Observation:");
        System.out.println("- References (student, employee, ...) live on the stack");
        System.out.println("- Actual objects live on the heap");
        System.out.println("- identityHashCode() helps distinguish object identity");
    }

    private static void printObjectInfo(String referenceName, Object object) {
        System.out.println();
        System.out.println("Reference (stack) : " + referenceName);
        System.out.println("Object (heap)     : " + object);
        System.out.println("Identity hash     : " + System.identityHashCode(object));
    }
}
```

### `Lab4-MemoryManagement/ListMemoryComparison.java`

```java
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
```

### `Lab4-MemoryManagement/MemoryLeakDemo.java`

```java
import java.util.ArrayList;
import java.util.List;

public class MemoryLeakDemo {

    static class Employee {
        private final int id;
        private final String name;
        private final byte[] profileData = new byte[256];

        Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            printUsage();
            return;
        }

        String mode = args[0].toLowerCase();
        switch (mode) {
            case "leak" -> demonstrateLeak();
            case "fix" -> demonstrateFix();
            default -> printUsage();
        }
    }

    private static void demonstrateLeak() {
        System.out.println("===== Memory Leak Demonstration =====");
        System.out.println("Adding employees to a static list that is never cleared...");
        MemoryMonitor.printMemoryReport("Before Allocation");

        List<Employee> employees = LEAK_HOLDER.employees;
        int targetCount = 1_000_000;
        int step = 100_000;

        for (int i = 1; i <= targetCount; i++) {
            employees.add(new Employee(i, "Employee-" + i));
            if (i % step == 0) {
                System.out.println("Added " + i + " employees");
                MemoryMonitor.printMemoryReport("After " + i + " Objects");
            }
        }

        System.out.println();
        System.out.println("Observation:");
        System.out.println("- Memory keeps increasing because objects remain reachable");
        System.out.println("- GC cannot collect objects that are still referenced");
        System.out.println("- This simulates a collection that grows without cleanup");
    }

    private static void demonstrateFix() {
        System.out.println("===== Memory Leak Fix Demonstration =====");
        MemoryMonitor.printMemoryReport("Before Allocation");

        List<Employee> employees = new ArrayList<>();
        for (int i = 1; i <= 500_000; i++) {
            employees.add(new Employee(i, "Employee-" + i));
        }

        MemoryMonitor.printMemoryReport("After Allocation");

        System.out.println("Clearing list to remove strong references...");
        employees.clear();
        employees = null;

        System.out.println("Triggering Garbage Collection...");
        MemoryMonitor.triggerGarbageCollection();
        MemoryMonitor.printMemoryReport("After GC");

        System.out.println();
        System.out.println("Observation:");
        System.out.println("- Clearing the list removes references to Employee objects");
        System.out.println("- Objects become unreachable and can be collected");
        System.out.println("- Used memory drops after GC");
    }

    private static void printUsage() {
        System.out.println("Usage:");
        System.out.println("  java MemoryLeakDemo leak");
        System.out.println("  java MemoryLeakDemo fix");
    }

    private static class LeakHolder {
        private final List<Employee> employees = new ArrayList<>();
    }

    private static final LeakHolder LEAK_HOLDER = new LeakHolder();
}
```

### `Lab4-MemoryManagement/MemoryMonitor.java`

```java
public class MemoryMonitor {

    private MemoryMonitor() {
    }

    public static void printMemoryReport(String label) {
        Runtime runtime = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long maxMemory = runtime.maxMemory();
        long usedMemory = totalMemory - freeMemory;

        System.out.println();
        System.out.println("===== JVM Memory Report: " + label + " =====");
        System.out.printf("Total Memory : %d MB%n", toMegabytes(totalMemory));
        System.out.printf("Free Memory  : %d MB%n", toMegabytes(freeMemory));
        System.out.printf("Used Memory  : %d MB%n", toMegabytes(usedMemory));
        System.out.printf("Max Memory   : %d MB%n", toMegabytes(maxMemory));
        System.out.println("-----------------------------");
    }

    public static long getUsedMemoryBytes() {
        Runtime runtime = Runtime.getRuntime();
        return runtime.totalMemory() - runtime.freeMemory();
    }

    public static void triggerGarbageCollection() {
        System.gc();
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public static long toMegabytes(long bytes) {
        return bytes / (1024 * 1024);
    }

    public static double toMegabytesDouble(long bytes) {
        return bytes / (1024.0 * 1024.0);
    }
}
```

### `Lab4-MemoryManagement/ObjectLifecycle.java`

```java
public class ObjectLifecycle {

    public static void main(String[] args) {
        System.out.println("===== Object Lifecycle Demonstration =====");

        System.out.println("Step 1: Create object");
        Person person = new Person("Diana", 27);
        System.out.println("Created -> " + person);
        System.out.println("Identity hash : " + System.identityHashCode(person));

        System.out.println();
        System.out.println("Step 2: Use object");
        System.out.println("Name : " + person.getName());
        System.out.println("Age  : " + person.getAge());

        System.out.println();
        System.out.println("Step 3: Hold reference");
        Person secondReference = person;
        System.out.println("secondReference points to same object : "
                + (System.identityHashCode(secondReference) == System.identityHashCode(person)));

        System.out.println();
        System.out.println("Step 4: Remove references");
        person = null;
        System.out.println("person reference removed");
        secondReference = null;
        System.out.println("secondReference removed - object is now unreachable");

        System.out.println();
        System.out.println("Step 5: Eligible for Garbage Collection");
        MemoryMonitor.printMemoryReport("Before GC");
        MemoryMonitor.triggerGarbageCollection();
        MemoryMonitor.printMemoryReport("After GC");

        System.out.println();
        System.out.println("An object becomes eligible for GC when no live thread can reach it.");
    }
}
```

### `Lab4-MemoryManagement/OutOfMemoryDemo.java`

```java
import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryDemo {

    static class Employee {
        private final int id;
        private final String name;
        private final byte[] data = new byte[1024];

        Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        System.out.println("===== Bonus: Intentional OutOfMemoryError =====");
        System.out.println("Run with a small heap to observe failure faster:");
        System.out.println("java -Xms32m -Xmx64m OutOfMemoryDemo");
        System.out.println();

        List<Employee> employees = new ArrayList<>();

        try {
            int id = 1;
            while (true) {
                employees.add(new Employee(id, "Employee-" + id));
                id++;
                if (id % 100_000 == 0) {
                    System.out.println("Allocated " + id + " employees");
                    MemoryMonitor.printMemoryReport("Growing Heap");
                }
            }
        } catch (OutOfMemoryError error) {
            System.out.println();
            System.out.println("OutOfMemoryError occurred!");
            System.out.println("Reason: Heap could not grow enough to store newly allocated objects.");
            System.out.println("Message: " + error.getMessage());
            MemoryMonitor.printMemoryReport("At Failure");
        }
    }
}
```

### `Lab4-MemoryManagement/PerformanceTest.java`

```java
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
```

### `Lab4-MemoryManagement/Person.java`

```java
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
```

### `Lab4-MemoryManagement/StackExample.java`

```java
public class StackExample {

    public static void main(String[] args) {
        System.out.println("===== Stack Memory Demonstration =====");
        System.out.println("Call chain: main() -> methodA() -> methodB() -> methodC()");
        System.out.println();

        int mainCounter = 1;
        String mainLabel = "main-frame";
        Person mainPerson = new Person("Main User", 30);

        System.out.println("main() frame");
        printFrameDetails("mainCounter", mainCounter, "mainLabel", mainLabel, mainPerson);
        methodA(10);
        System.out.println();
        System.out.println("Back in main() - methodC() frame has been removed from the stack.");
        printFrameDetails("mainCounter", mainCounter, "mainLabel", mainLabel, mainPerson);
    }

    private static void methodA(int valueA) {
        int localA = valueA * 2;
        String labelA = "frame-A";
        Person personA = new Person("Alice", 25);

        System.out.println();
        System.out.println("methodA() frame");
        printFrameDetails("localA", localA, "labelA", labelA, personA);
        methodB(localA);
    }

    private static void methodB(int valueB) {
        int localB = valueB + 5;
        String labelB = "frame-B";
        Person personB = new Person("Bob", 28);

        System.out.println();
        System.out.println("methodB() frame");
        printFrameDetails("localB", localB, "labelB", labelB, personB);
        methodC(localB);
    }

    private static void methodC(int valueC) {
        int localC = valueC - 3;
        String labelC = "frame-C";
        Person personC = new Person("Carol", 32);

        System.out.println();
        System.out.println("methodC() frame");
        printFrameDetails("localC", localC, "labelC", labelC, personC);
        System.out.println();
        System.out.println("Stack frame stores:");
        System.out.println("- Primitive values directly (localC = " + localC + ")");
        System.out.println("- Object references (personC reference on stack, object on heap)");
        System.out.println("- Return address to methodB()");
    }

    private static void printFrameDetails(String primitiveName, int primitiveValue,
                                          String stringName, String stringValue,
                                          Person person) {
        System.out.println("  Primitive on stack : " + primitiveName + " = " + primitiveValue);
        System.out.println("  Reference on stack : " + stringName + " -> \"" + stringValue + "\" (String object on heap)");
        System.out.println("  Reference on stack : person -> " + person);
        System.out.println("  Identity hash code : " + System.identityHashCode(person));
    }
}
```

### `Lab4-MemoryManagement/StringMemoryComparison.java`

```java
public class StringMemoryComparison {

    public static void main(String[] args) {
        System.out.println("===== Bonus: String vs StringBuilder =====");
        int iterations = 10_000;

        MemoryMonitor.triggerGarbageCollection();
        long memoryBefore = MemoryMonitor.getUsedMemoryBytes();
        long start = System.nanoTime();

        String result = "";
        for (int i = 0; i < iterations; i++) {
            result += "item-" + i + "-";
        }

        long stringMillis = (System.nanoTime() - start) / 1_000_000;
        long stringMemory = MemoryMonitor.getUsedMemoryBytes() - memoryBefore;
        System.out.printf("String concatenation : %d ms | approx used memory : %.2f MB | length : %d%n",
                stringMillis, MemoryMonitor.toMegabytesDouble(stringMemory), result.length());

        result = null;
        MemoryMonitor.triggerGarbageCollection();

        memoryBefore = MemoryMonitor.getUsedMemoryBytes();
        start = System.nanoTime();

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            builder.append("item-").append(i).append("-");
        }
        String builderResult = builder.toString();

        long builderMillis = (System.nanoTime() - start) / 1_000_000;
        long builderMemory = MemoryMonitor.getUsedMemoryBytes() - memoryBefore;
        System.out.printf("StringBuilder build  : %d ms | approx used memory : %.2f MB | length : %d%n",
                builderMillis, MemoryMonitor.toMegabytesDouble(builderMemory), builderResult.length());
    }
}
```

### `Lab4-MemoryManagement/WeakReferenceDemo.java`

```java
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
```

## Notes

# Lab 4 Reference Solution — Memory Management and Garbage Collection

Instructor reference only. Students should write these files themselves **after** completing Module 4 Exercises 1–7, under:

* Windows: `%USERPROFILE%\java-bootcamp\examples\Lab4-MemoryManagement`
* macOS / Linux: `~/java-bootcamp/examples/Lab4-MemoryManagement`

Do not confuse with flat exercise sources in `examples/module-04-exercises/`.

**Participant path reminder:** Flat `.java` suite — do **not** mark this folder as Sources Root. Compile/run from `Lab4-MemoryManagement`.

## Pass criteria

| Path | Required evidence |
| ---- | ----------------- |
| **Timed (~45 min)** | `GarbageCollectionDemo` with `-Xlog:gc`; `MemoryLeakDemo leak` + `fix`; `PerformanceTest` table; screenshots under `notes/screenshots/lab-4/` |
| **Full credit** | Timed criteria **plus** `WeakReferenceDemo` (strong stays / weak often `null` after GC) |
| **Extended** | Optional tools (`jstat` / GUI), string/list comparisons; `OutOfMemoryDemo` only with instructor OK + tiny `-Xmx` |

## What the starter leaves for students

Already given: `Person`, `MemoryMonitor`, `StackExample`, `HeapExample`, `ObjectLifecycle` (skip recreating GUIDE Steps 1–5).

Student TODOs (timed): allocation/null/GC in `GarbageCollectionDemo`; `leak` / `fix` modes in `MemoryLeakDemo`; allocation timing in `PerformanceTest`.

Full credit: `WeakReferenceDemo` strong vs weak narrative.

Instructor/optional only: `OutOfMemoryDemo` — do **not** run without tiny `-Xmx` and instructor OK.

## Files

| File | Purpose |
| ---- | ------- |
| `MemoryMonitor.java` | Shared memory report / GC helper |
| `Person.java` | Simple model for lifecycle / weak-ref demos |
| `StackExample.java` | Nested method calls / stack frames |
| `HeapExample.java` | Allocation + `identityHashCode()` |
| `ObjectLifecycle.java` | Create → use → dereference |
| `GarbageCollectionDemo.java` | Allocate, null refs, trigger GC |
| `MemoryLeakDemo.java` | `leak` / `fix` modes |
| `WeakReferenceDemo.java` | Strong vs weak references (full credit) |
| `PerformanceTest.java` | Allocation timing |
| `StringMemoryComparison.java` | Bonus: `String` vs `StringBuilder` |
| `ListMemoryComparison.java` | Bonus: `ArrayList` vs `LinkedList` |
| `OutOfMemoryDemo.java` | Instructor/optional intentional OOM |

Matches GUIDE **Expected files:** `examples/Lab4-MemoryManagement/*.java` (flat suite).

## How to compile and run

From this `Lab4-MemoryManagement` directory (JDK 21 on `PATH`):

**Windows PowerShell:**

```powershell
javac StackExample.java HeapExample.java ObjectLifecycle.java Person.java MemoryMonitor.java `
  GarbageCollectionDemo.java MemoryLeakDemo.java WeakReferenceDemo.java PerformanceTest.java `
  StringMemoryComparison.java ListMemoryComparison.java OutOfMemoryDemo.java

java StackExample
java HeapExample
java ObjectLifecycle
java -Xms16m -Xmx64m -Xlog:gc GarbageCollectionDemo
java MemoryLeakDemo leak
java MemoryLeakDemo fix
java WeakReferenceDemo
java -Xms128m -Xmx512m PerformanceTest
```

**macOS / Linux:**

```bash
javac *.java
java StackExample
java HeapExample
java ObjectLifecycle
java -Xms16m -Xmx64m -Xlog:gc GarbageCollectionDemo
java MemoryLeakDemo leak
java MemoryLeakDemo fix
java WeakReferenceDemo
java -Xms128m -Xmx512m PerformanceTest
```

## Expected smoke transcript (themes)

```text
===== Stack Memory Demonstration =====
Call chain: main() -> methodA() -> methodB() -> methodC()
...
===== Heap Memory Demonstration =====
...
===== Garbage Collection Demonstration =====
Objects Created : 100000
...
[info][gc] Using G1
...
===== Memory Leak Demonstration =====
Added 100000 employees
... memory keeps increasing ...
===== Memory Leak Fix Demonstration =====
... Used memory drops after GC ...
===== Performance Measurement =====
Objects      Used Memory    Execution Time
...
```

Exact MB / pause times vary by machine. Rising used memory on `leak` and a drop theme on `fix` are the grading signals.

Optional (instructor / careful):

```powershell
java -Xms16m -Xmx32m OutOfMemoryDemo
```

## Common mistakes

| Mistake | Fix |
| ------- | --- |
| `java MemoryLeakDemo` with no arg | Use `leak` or `fix` |
| Marking folder as Sources Root | Keep flat; compile named files from the lab folder |
| Expecting one tiny object to drop MB | Lifecycle is about reachability narrative, not a dramatic cliff |
| Running `OutOfMemoryDemo` unbounded | Instructor-only; tiny `-Xmx`; stop quickly |
| Committing `.hprof` | Delete dumps; never submit them |

## Clean

```powershell
Remove-Item -Force *.class   # PowerShell
# rm -f *.class              # bash
```


