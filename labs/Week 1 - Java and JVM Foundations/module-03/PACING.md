# Module 3 — Classroom pacing (Learn → Practice → Review)

**For instructors and participants.** Do **not** finish every Module 3 slide before designing/coding.

Detailed author notes: `curriculum/Week 1 - Java and JVM Foundations/module-03/INSTRUCTOR-PACING.md`

## Checkpoint map

| Block | After slides (PNG #) | Practice |
| ----- | -------------------- | -------- |
| **A** | 82–89 | [Ex 1](exercises/exercise-01-domain-entities.md) domain notes · Predict class vs object |
| **B** | 90–92 | [Ex 2](exercises/exercise-02-encapsulation.md) |
| **C** | 93–98 | [Ex 3](exercises/exercise-03-inheritance.md) *(inheritance + polymorphism together)* |
| **D** | 99–101 | [Ex 4](exercises/exercise-04-abstract-classes.md) · [Ex 5](exercises/exercise-05-interface.md) |
| **E** | 102–107 | [Ex 6](exercises/exercise-06-solid-check.md) · [Ex 7](exercises/exercise-07-solid-beyond-srp.md) |
| **F** | 108–109 | [Ex 8](exercises/exercise-08-uml-mini.md) |
| **G** | 110–114 | [Lab 3](lab3/LAB-3-GUIDE.md) · Kahoot |

## Streamline overlapping topics

| Topic | Keep short | Why |
| ----- | ---------- | --- |
| Classes/objects/constructors (86–89) | Review — Module 1 Ex 7 already created objects | Jump to banking entities |
| Compile-time vs runtime polymorphism (96–98) | Teach as one story with Ex 3 | Avoid three lecture passes |
| SOLID 102–107 | Pair Ex 6 (SRP) then Ex 7 (rest) | Spot-checks, not essays |
| Design patterns (108) | Awareness only | Lab 3 focuses on OOP model, not full GoF catalog |

## Interactive moves

- **Predict:** polymorphic `withdraw` · abstract `new Account()` failure
- **Debug:** public balance mutation vs encapsulated methods
- **Peer explain (60s):** interface vs abstract class for `Printable`

## Incremental build

Exercises 2–5 grow the **same banking model** → Lab 3 packages it as `com.academy.bank`.

Start here: [`README.md`](README.md) · Exercises: [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md)
