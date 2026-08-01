# Module 4 — Classroom pacing (Learn → Practice → Review)

**For instructors and participants.** Do **not** finish every Module 4 slide before coding.

Detailed author notes: `curriculum/Week 1 - Java and JVM Foundations/module-04/INSTRUCTOR-PACING.md`

## Checkpoint map

| Block | After slides (PNG #) | Practice |
| ----- | -------------------- | -------- |
| **A** | 115–118 | [Ex 1](exercises/exercise-01-stack-vs-heap.md) · [Ex 2](exercises/exercise-02-lifecycle.md) |
| **B** | 119–121 | [Ex 3](exercises/exercise-03-gc-observe.md) · [Ex 4](exercises/exercise-04-g1.md) · [Ex 5](exercises/exercise-05-zgc.md) |
| **C** | 122–123 | [Ex 6](exercises/exercise-06-leak-sketch.md) |
| **D** | 124–126 | [Ex 7](exercises/exercise-07-string-vs-builder.md) |
| **E** | 127–129 | [Lab 4](lab4/LAB-4-GUIDE.md) · Kahoot |

## Streamline overlapping topics

| Topic | Already covered | Module 4 focus |
| ----- | --------------- | -------------- |
| Stack vs heap | Module 1 memory slides / Ex 7 sketch | Code-level trace + lifecycle |
| G1 / ZGC overview | Module 1 awareness | Hands-on flags + short compare notes |
| GC concepts | Module 1 | Logs, retention roots, bounded demos |

Keep G1/ZGC lecture short — Exercises 4–5 do the verification.

## Safety (say out loud)

- Bounded allocations only — **no intentional OOM**
- Do **not** commit `.hprof` dumps
- `System.gc()` is a **hint**

## Incremental build

Module 1 `MemoryDemo` / stack-heap story → Module 4 exercises → Lab 4 shared-monitor suite in `Lab4-MemoryManagement/`.

Start here: [`README.md`](README.md) · Exercises: [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md)
