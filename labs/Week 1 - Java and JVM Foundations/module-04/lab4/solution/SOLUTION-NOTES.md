# Lab 4 Reference Solution — Memory Management and Garbage Collection

Instructor reference only. Students should write these files themselves **after** completing Module 4 Exercises 1–7, under:

* Windows: `%USERPROFILE%\java-bootcamp\examples\Lab4-MemoryManagement`
* macOS / Linux: `~/java-bootcamp/examples/Lab4-MemoryManagement`

Do not confuse with flat exercise sources in `examples/module-04-exercises/`.

**Participant path reminder:** Flat `.java` suite — do **not** mark this folder as Sources Root. Compile/run from `Lab4-MemoryManagement`.

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
| `WeakReferenceDemo.java` | Strong vs weak references |
| `PerformanceTest.java` | Allocation timing |
| `StringMemoryComparison.java` | Bonus: `String` vs `StringBuilder` |
| `ListMemoryComparison.java` | Bonus: `ArrayList` vs `LinkedList` |
| `OutOfMemoryDemo.java` | Bonus: intentional OOM |

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

Optional (bonus / careful):

```powershell
java -Xms32m -Xmx64m OutOfMemoryDemo
```

## Clean

```powershell
Remove-Item -Force *.class   # PowerShell
# rm -f *.class              # bash
```
