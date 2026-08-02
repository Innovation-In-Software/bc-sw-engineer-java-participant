# Module 25 — Classroom pacing (Learn → Practice → Review)

**For instructors and participants.** Do **not** finish every Module 25 slide before practicing.

Detailed author notes: `curriculum/Week 3 - Spring Framework and Enterprise Patterns/module-25/INSTRUCTOR-PACING.md`

## Checkpoint map

| Block | After slides | Practice |
| ----- | ------------ | -------- |
| **A** | 91–96 | [Ex 1](exercises/exercise-01-layer-boundaries.md) |
| **B** | 97–104 | [Ex 2](exercises/exercise-02-package-sketch.md) · [Ex 3](exercises/exercise-03-service-todo-skeleton.md) |
| **C** | 105–110a | [Ex 4](exercises/exercise-04-ai-review-policy.md) · [Ex 5](exercises/exercise-05-test-plan.md) · [Ex 6](exercises/exercise-06-lab25-readiness.md) |
| **D** | 111–113 | [Lab 25](lab25/LAB-25-GUIDE.md) · Kahoot |

**Classroom practice order:** **1 → 2 → 3 → 4 → 5 → 6**

## Streamline overlapping topics

| Topic | Keep short | Why |
| ----- | ---------- | --- |
| JPA / PostgreSQL swap | Awareness / readiness note | Week 4 Lab 39 |
| `@Transactional` transfers | Later (Lab 27) | Layer seams first |
| Profiles / secrets | Later (Lab 26) | Not this lab’s focus |
| Accepting Copilot drafts blindly | Forbidden | Mandatory human review (`lab25-001`) |

## Layering reminder

```text
Controller (HTTP) → Service (rules) → Repository (persistence access)
No repository imports in controller · No ResponseEntity in service
Seed CUS-1001 / CUS-1002 · AI drafts need review notes
```

## Incremental build

Exercises 1–6 notes → Lab 25 `examples/lab25-crm` (layered CRUD + tests + AI review notes).

Start here: [`README.md`](README.md) · Exercises: [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md)
