# Module 14 — Classroom pacing (Learn → Practice → Review)

**For instructors and participants.** Do **not** finish every Module 14 slide before practicing.

Detailed author notes: `curriculum/Week 2 - Backend, AI Tools and Testing/module-14/INSTRUCTOR-PACING.md`

## Checkpoint map

| Block | After slides | Practice |
| ----- | ------------ | -------- |
| **A** | 133–135 | [Ex 1](exercises/exercise-01-entity-vs-dto.md) |
| **B** | 136–138 | [Ex 2](exercises/exercise-02-mapper-no-leak.md) |
| **C** | 139–143 | [Ex 3](exercises/exercise-03-annotate-paper-dto.md) |
| **D** | 144–147 | [Ex 4](exercises/exercise-04-invalid-cases.md) · [Ex 5](exercises/exercise-05-fill-validatorfactory-todos.md) · [Ex 6](exercises/exercise-06-lab14-prep-checklist.md) |
| **E** | 148–150 | [Lab 14](lab14/LAB-14-GUIDE.md) · Kahoot |

**Classroom practice order:** **1 → 2 → 3 → 4 → 5 → 6**

## Streamline overlapping topics

| Topic | Keep short | Why |
| ----- | ---------- | --- |
| MapStruct / ModelMapper deep dive | Awareness only | Lab uses manual mapper |
| Spring `@Valid` / `@ControllerAdvice` | Defer | Labs 29+ |
| Full service transition rules | Defer | Lab 15 |
| SOAP hosting | Out of scope | Parallel to Lab 13; hosting Lab 24 |

## Contract boundary reminder

```text
CustomerRequestDTO / CustomerResponseDTO  →  CustomerMapper  →  Customer (entity)
Validate at CustomerApiFacade with ValidatorFactory (not Spring MVC @Valid yet)
```

## Incremental build

Exercises 1–6 notes → Lab 14 `examples/lab14-crm` (DTOs + validation + facade).

Start here: [`README.md`](README.md) · Exercises: [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md)
