# Module 15 — Classroom pacing (Learn → Practice → Review)

**For instructors and participants.** Do **not** finish every Module 15 slide before practicing.

Detailed author notes: `curriculum/Week 2 - Backend, AI Tools and Testing/module-15/INSTRUCTOR-PACING.md`

## Checkpoint map

| Block | After slides | Practice |
| ----- | ------------ | -------- |
| **A** | 152–155 | [Ex 1](exercises/exercise-01-layer-diagram.md) |
| **B** | 156 | [Ex 2](exercises/exercise-02-repo-boundary.md) |
| **C** | 157 | [Ex 3](exercises/exercise-03-transition-matrix.md) |
| **D** | 158–163 | [Ex 4](exercises/exercise-04-interface-ctor-sketch.md) · [Ex 5](exercises/exercise-05-fill-activate-ravi-todos.md) · [Ex 6](exercises/exercise-06-lab15-prep-checklist.md) |
| **E** | 164–166 | [Lab 15](lab15/LAB-15-GUIDE.md) · Kahoot |

**Classroom practice order:** **1 → 2 → 3 → 4 → 5 → 6**

## Streamline overlapping topics

| Topic | Keep short | Why |
| ----- | ---------- | --- |
| Transaction managers / `@Transactional` | Awareness | Lab uses in-memory + explicit validate-before-mutate |
| Service-to-service / mesh | Awareness | Focus on CustomerService boundaries |
| `@ControllerAdvice` HTTP mapping | Defer | Lab 16 |
| Rules inside repository | Anti-pattern | Service/validator owns transitions |

## Layer reminder

```text
API / facade  →  CustomerService (+ Validator)  →  CustomerRepository
Status transitions live in the service/validator — never in the Map
```

## Incremental build

Exercises 1–6 notes → Lab 15 `examples/lab15-crm` (repo + validator + DefaultCustomerService).

Start here: [`README.md`](README.md) · Exercises: [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md)
