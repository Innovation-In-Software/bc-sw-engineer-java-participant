# Module 6 — Classroom pacing (Learn → Practice → Review)

**For instructors and participants.** Do **not** finish every Module 6 slide before coding.

Detailed author notes: `curriculum/Week 1 - Java and JVM Foundations/module-06/INSTRUCTOR-PACING.md`

## Checkpoint map

| Block | After slides (PNG #) | Practice |
| ----- | -------------------- | -------- |
| **A** | 152–157 | [Ex 1](exercises/exercise-01-lambda-functional-interface.md) |
| **B** | 158–159 | [Ex 2](exercises/exercise-02-filter-salary.md) · [Ex 3](exercises/exercise-03-list-names.md) |
| **C** | 160–162 | [Ex 4](exercises/exercise-04-minmax.md) · [Ex 5](exercises/exercise-05-map-raise.md) |
| **D** | 163–166 | [Ex 6](exercises/exercise-06-group-count.md) · [Ex 7](exercises/exercise-07-hr-names.md) |
| **E** | 167–168 | [Ex 8](exercises/exercise-08-parallel-bonus.md) *(stretch — not Lab 6 gate)* |
| **F** | 169–171 | [Lab 6](lab6/LAB-6-GUIDE.md) · Kahoot |

## Streamline overlapping topics

| Topic | Keep short | Why |
| ----- | ---------- | --- |
| Every Stream method overload | Awareness | filter / map / collect / min-max / groupingBy drive the labs |
| Parallel streams | Awareness + Ex 8 | Tiny demos rarely benefit; correctness first |
| flatMap deep dive | Awareness | Compose filter→map→collect first |
| Streams vs loops table | Skim | Ex 7 pipeline proves the point |

## Pipeline reminder

```text
Source → intermediate (filter/map/sorted/…) → terminal (toList/count/max/collect)
Do not reuse a Stream after a terminal operation.
```

## Incremental build

Exercises 1–7 (shared 5-employee dataset) → Lab 6 `com.academy.analytics` (25-employee menu + dashboard).

Start here: [`README.md`](README.md) · Exercises: [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md)
