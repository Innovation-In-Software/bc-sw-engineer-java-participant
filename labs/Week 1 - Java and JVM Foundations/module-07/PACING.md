# Module 7 — Classroom pacing (Learn → Practice → Review)

**For instructors and participants.** Do **not** finish every Module 7 slide before coding.

Detailed author notes: `curriculum/Week 1 - Java and JVM Foundations/module-07/INSTRUCTOR-PACING.md`

## Checkpoint map

| Block | After slides (PNG #) | Practice |
| ----- | -------------------- | -------- |
| **A** | 173–177 | [Ex 1](exercises/exercise-01-common-exceptions.md) |
| **B** | 178–179 | [Ex 2](exercises/exercise-02-try-catch-finally.md) |
| **C** | 180 | [Ex 3](exercises/exercise-03-try-with-resources.md) |
| **D** | 181–183 | [Ex 4](exercises/exercise-04-throw-throws.md) · [Ex 5](exercises/exercise-05-custom-exception.md) · [Ex 6](exercises/exercise-06-propagation.md) |
| **E** | 184–187 | [Ex 7](exercises/exercise-07-error-strategies.md) · [Ex 8](exercises/exercise-08-logging-warmup.md) |
| **F** | 188–190 | [Lab 7](lab7/LAB-7-GUIDE.md) · Kahoot |
| — | 192 | Week 1 review *(awareness / wrap)* |

## Streamline overlapping topics

| Topic | Keep short | Why |
| ----- | ---------- | --- |
| Every JDK exception type | Awareness | Specific catches + domain types drive Lab 7 |
| Mistakes slide (186) | Checklist | Do not assign a separate coding track |
| Empty catch / catch Exception | Strong “don’t” | Reinforce in Ex 1 + Lab troubleshooting |
| Secrets in logs | Non-negotiable | Ex 8 + ATM lab |

## Failure-boundary reminder

```text
Throw at the rule violation → propagate → catch where you can recover or translate
Users: safe message · Logs: context + exception · Never: PINs / passwords
```

## Incremental build

Exercises 1–8 → Lab 7 `com.academy.atm` (custom exceptions + login/deposit/withdraw + logging).

Start here: [`README.md`](README.md) · Exercises: [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md)
