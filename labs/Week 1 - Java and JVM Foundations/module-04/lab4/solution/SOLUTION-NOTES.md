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
