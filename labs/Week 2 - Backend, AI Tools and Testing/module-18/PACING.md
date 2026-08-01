# Module 18 — Classroom pacing (Learn → Practice → Review)

**For instructors and participants.** Do **not** finish every Module 18 slide before practicing.

Detailed author notes: `curriculum/Week 2 - Backend, AI Tools and Testing/module-18/INSTRUCTOR-PACING.md`

## Checkpoint map

| Block | After slides | Practice |
| ----- | ------------ | -------- |
| **A** | 203–207 | [Ex 1](exercises/exercise-01-keep-real-validator.md) |
| **B** | 208–209 | [Ex 2](exercises/exercise-02-stub-vs-verify.md) |
| **C** | 210–213 | [Ex 3](exercises/exercise-03-argumentcaptor-preview.md) · [Ex 4](exercises/exercise-04-fill-activate-interaction-todos.md) |
| **D** | 214–215 | [Ex 5](exercises/exercise-05-anti-patterns.md) · [Ex 6](exercises/exercise-06-lab18-prep-checklist.md) |
| **E** | 216–218 | [Lab 18](lab18/LAB-18-GUIDE.md) · Kahoot |

**Classroom practice order:** **1 → 2 → 3 → 4 → 5 → 6**

## Streamline overlapping topics

| Topic | Keep short | Why |
| ----- | ---------- | --- |
| Mock every class including SUT / value objects | Anti-pattern | Mock collaborators only |
| Selenium / UI automation | Out of scope | Lab 19 |
| BDDMockito | Syntax sugar in lab suite | Same Mockito engine |
| Always verifyNoMoreInteractions | Use when surface is critical | Avoid brittle tests |

## Isolation reminder

```text
@Mock CustomerRepository  +  real CustomerValidator  →  DefaultCustomerService (SUT)
stub findById  ·  verify save  ·  never().save on not-found  ·  ArgumentCaptor status ACTIVE
```

## Incremental build

Exercises 1–6 notes → Lab 18 `examples/lab18-crm` (Mockito + BDDMockito suites + isolation-policy).

Start here: [`README.md`](README.md) · Exercises: [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md)
