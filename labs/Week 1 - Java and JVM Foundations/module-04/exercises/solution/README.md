# Module 4 exercise solutions (instructor only)

Complete reference implementations for the pre-lab exercises.

**Do not share with participants.** This folder is named `solution/` so `push-all.ps1` excludes it from the participant remote.

Flat folder + JDK 21 on `PATH`. MB / ms numbers vary by machine — match the **fixed** strings below.

## File map

| Exercise | File | Role |
| -------- | ---- | ---- |
| 1 Stack vs Heap Basics | [`StackHeapDemo.java`](StackHeapDemo.java) | Runnable |
| 2 Object Lifecycle | [`ObjectLifecycleDemo.java`](ObjectLifecycleDemo.java) | Runnable |
| 3 Garbage Collection in Action | [`GcObserve.java`](GcObserve.java) | Runnable |
| 4 Select and Verify G1 | — | Flag/notes exercise — **reuse** `GcObserve` with `-XX:+UseG1GC` (no new `.java`) |
| 5 Select and Verify ZGC | — | Flag/notes exercise — **reuse** `GcObserve` with `-XX:+UseZGC` (no new `.java`) |
| 6 Retention Sketch (safe) | [`RetentionDemo.java`](RetentionDemo.java) | Runnable |
| 7 String vs StringBuilder | [`StringBuilderComparison.java`](StringBuilderComparison.java) | Runnable |

## Compile and run (Windows PowerShell)

```powershell
javac StackHeapDemo.java ObjectLifecycleDemo.java GcObserve.java RetentionDemo.java StringBuilderComparison.java

java StackHeapDemo
java ObjectLifecycleDemo
java GcObserve
java RetentionDemo
java StringBuilderComparison
```

Optional collector checks (Exercises 4–5):

```powershell
java -XX:+UseG1GC -Xlog:gc*:file=g1.log GcObserve
java -XX:+UseZGC -Xlog:gc*:file=zgc.log GcObserve
```

## Expected key output

| Demo | Key lines |
| ---- | --------- |
| `StackHeapDemo` | `Aman has 4 letters.` · `Count: 1` |
| `ObjectLifecycleDemo` | `Same object: true` · `Still reachable through alias: Aman` · `No strong references remain; object is GC-eligible.` · `GC requested, not guaranteed.` |
| `GcObserve` | `Completed round 5` / `10` / `15` / `20` · `Allocated bytes over time: 262144000` |
| `RetentionDemo` | `Before: … MB` · `Retained objects: 10000` · `After allocation: … MB` · `After clear (approx): … MB` (MB values vary) |
| `StringBuilderComparison` | `String: 50000 chars, … ms` · `StringBuilder: 50000 chars, … ms` (builder much faster) |

## Common mistakes

- Treating `System.gc()` as a guarantee — it is a request only.
- Expecting identical MB / ms across machines — check fixed labels and relative behavior.
- Writing a new class for Exercises 4–5 — rerun `GcObserve` with collector flags instead.

## Clean

```powershell
Remove-Item -Force *.class,g1.log,zgc.log -ErrorAction SilentlyContinue
```
