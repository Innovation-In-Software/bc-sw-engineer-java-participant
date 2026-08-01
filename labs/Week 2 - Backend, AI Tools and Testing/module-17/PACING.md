# Module 17 — Classroom pacing (Learn → Practice → Review)

**For instructors and participants.** Do **not** finish every Module 17 slide before practicing.

Detailed author notes: `curriculum/Week 2 - Backend, AI Tools and Testing/module-17/INSTRUCTOR-PACING.md`

## Checkpoint map

| Block | After slides | Practice |
| ----- | ------------ | -------- |
| **A** | 186–190 | [Ex 1](exercises/exercise-01-aaa-service-tests-plan.md) |
| **B** | 191–192 | [Ex 2](exercises/exercise-02-meaningful-asserts.md) |
| **C** | 193 | [Ex 3](exercises/exercise-03-csvsource-table.md) |
| **D** | 194–198 | [Ex 4](exercises/exercise-04-test-names.md) · [Ex 5](exercises/exercise-05-fill-jacoco-gate-todos.md) · [Ex 6](exercises/exercise-06-lab17-prep-checklist.md) |
| **E** | 199–201 | [Lab 17](lab17/LAB-17-GUIDE.md) · Kahoot |

**Classroom practice order:** **1 → 2 → 3 → 4 → 5 → 6**

## Streamline overlapping topics

| Topic | Keep short | Why |
| ----- | ---------- | --- |
| Mockito / deep mocks | Defer | Lab 18 |
| Selenium / UI tests | Out of scope | Lab 19 |
| AI-generated tests | Review, don’t trust blindly | Lab uses AI assistance as a helper |
| Coverage theater | Assert behavior, then gate | JaCoCo ≥80% on service package |

## Testing reminder

```text
AAA service tests (real repo/validator OK)  →  @CsvSource transitions  →  mvn clean verify (JaCoCo)
assertEquals status/id · assertThrows(BusinessException) · no assertNotNull-only
```

## Incremental build

Exercises 1–6 notes → Lab 17 `examples/lab17-crm` (`CustomerServiceTests` + parameterized + JaCoCo gate).

Start here: [`README.md`](README.md) · Exercises: [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md)
