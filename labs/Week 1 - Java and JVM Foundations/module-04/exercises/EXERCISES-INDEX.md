# Module 4 — Pre-Lab Exercises

> **Start here for Module 4:** [`../README.md`](../README.md) · **Which file when?** [`../../../_PARTICIPANT-FILE-GUIDE.md`](../../../_PARTICIPANT-FILE-GUIDE.md)

**Module:** 4 — Memory Management and Performance  
**Source:** Module 4 slides: Lab Overview (Memory and Garbage Collection)  
**Next (after Exercises 1–7 Pass):** OS how-to → [`../lab4/LAB-4-WINDOWS.md`](../lab4/LAB-4-WINDOWS.md) or [`../lab4/LAB-4-MACOS.md`](../lab4/LAB-4-MACOS.md) → then [`../lab4/LAB-4-GUIDE.md`](../lab4/LAB-4-GUIDE.md)

> **When:** Complete these exercises **after the module slides** (Day 3) and **before** the graded lab (Day 4).  
> **Gate for Lab 4:** All **seven** exercises must be Pass.  
> **JDK:** 21 · **IDE:** IntelliJ Community (primary) or VS Code (optional).  
> Keep practice separate from the graded lab (`examples/Lab4-MemoryManagement/`).  
> Memory and timing values vary by machine. Explain the **pattern**, not an exact number.  
> **Lab 4 assumes** you can already sketch stack/heap, lifecycle, GC logs, G1/ZGC, retention, and StringBuilder cost — Lab 4 consolidates them into a shared-monitor suite, not first teaching.

## Already covered — do not redo

| Topic | Where you did it |
| ----- | ---------------- |
| JVM, bytecode, and WORA | Module 1 |
| Objects, references, encapsulation | Modules 1 and 3 |
| Loops and arrays | Modules 1 and 2 |

Module 4 focuses on what happens **at runtime**: stack frames, heap objects, reachability, garbage collection, allocation cost, and retained references.

## Safety rules

- Use the bounded object counts in these exercises.
- Do **not** intentionally trigger `OutOfMemoryError`.
- Do **not** commit heap dumps (`.hprof`); they can contain secrets or personal data.
- `System.gc()` is a **request**, not a guarantee.
- Close optional monitoring tools after the exercise.

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Lab 0 workspace | `%USERPROFILE%\java-bootcamp` | `~/java-bootcamp` |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-04-exercises` | `~/java-bootcamp/examples/module-04-exercises` |
| Shell | IntelliJ **Terminal** (PowerShell) | IntelliJ **Terminal** (zsh) |

### Setup — create the folder once

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-04-exercises | Out-Null
cd examples\module-04-exercises
pwd
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-04-exercises
cd examples/module-04-exercises
pwd
```

Stay in this folder for all seven exercises.

### IntelliJ file creation

1. Right-click `module-04-exercises` → **New → File**.
2. Enter the complete filename, such as `StackHeapDemo.java`.
3. Save, then compile and run from the IntelliJ **Terminal**.

Ignore the yellow *outside of the module source root* banner. Do not mark the hyphenated exercises folder as Sources Root and do not click **Move to source root**.

## JVM flags used

| Flag | Easy meaning |
| ---- | ------------ |
| `-Xms16m` | Start with approximately 16 MB heap |
| `-Xmx64m` | Limit maximum heap to approximately 64 MB |
| `-Xlog:gc` | Print garbage-collection events |
| `-XX:+UseG1GC` | Explicitly select the G1 collector |
| `-XX:+UseZGC` | Explicitly select the ZGC collector |

JVM flags go **before** the class name:

```text
java -Xmx64m -Xlog:gc GcObserve
```

## Exercise index

Numbered to match the order these topics appear in the Module 4 slides — work in order.

| # | Exercise | New runtime skill | File |
| - | -------- | ----------------- | ---- |
| 1 | Stack vs Heap Basics | Trace locals, references, and objects | [`exercise-01-stack-vs-heap.md`](exercise-01-stack-vs-heap.md) |
| 2 | Object Lifecycle | Follow aliases and GC eligibility | [`exercise-02-lifecycle.md`](exercise-02-lifecycle.md) |
| 3 | Garbage Collection in Action | Read bounded GC log evidence | [`exercise-03-gc-observe.md`](exercise-03-gc-observe.md) |
| 4 | G1 Collector Flag | Select and verify G1 | [`exercise-04-g1.md`](exercise-04-g1.md) |
| 5 | ZGC Flag | Select and verify ZGC; compare against G1 | [`exercise-05-zgc.md`](exercise-05-zgc.md) |
| 6 | Retention Sketch (safe) | Find and clear a retaining GC root | [`exercise-06-leak-sketch.md`](exercise-06-leak-sketch.md) |
| 7 | String vs StringBuilder | Measure repeated concatenation | [`exercise-07-string-vs-builder.md`](exercise-07-string-vs-builder.md) |

Work in order. Keep practice sources separate from the graded lab submission.

When all **seven** Pass criteria are **Pass**, open your OS how-to and then [`../lab4/LAB-4-GUIDE.md`](../lab4/LAB-4-GUIDE.md) on Day 4. Do not start Lab 4 GUIDE Steps mid-exercise list (Day 3 briefing = folder/notes only).
