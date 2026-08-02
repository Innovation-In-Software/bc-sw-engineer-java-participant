# Module 29 — Classroom pacing (Learn → Practice → Review)

**For instructors and participants.** Do **not** finish every Module 29 slide before practicing.

Detailed author notes: `curriculum/Week 3 - Spring Framework and Enterprise Patterns/module-29/INSTRUCTOR-PACING.md`

## Checkpoint map

| Block | After slides | Practice |
| ----- | ------------ | -------- |
| **A** | 187–197 | [Ex 1](exercises/exercise-01-dto-constraints.md) |
| **B** | 198–204 | [Ex 2](exercises/exercise-02-handler-todos.md) · [Ex 3](exercises/exercise-03-error-envelope.md) |
| **C** | 205–210 | [Ex 4](exercises/exercise-04-exception-status-map.md) · [Ex 6](exercises/exercise-06-mockmvc-body-assertions.md) · [Ex 5](exercises/exercise-05-lab29-readiness.md) |
| **D** | 211–213 | [Lab 29](lab29/LAB-29-GUIDE.md) · Kahoot |
| — | 215–220 | Week 3 review (awareness / optional close) |

**Classroom practice order:** **1 → 2 → 3 → 4 → 6 → 5** (MockMvc body plan before readiness gate)

## Streamline overlapping topics

| Topic | Keep short | Why |
| ----- | ---------- | --- |
| Full RFC7807 Problem Details deep dive | Envelope fields enough | Lab ships a stable ErrorResponse |
| Replacing Spring Security with validation | Forbidden | Lab 28 auth stays |
| Stack-trace HTML to clients | Forbidden | Safe envelopes only |
| Kafka/React error UIs | Later (Week 4) | REST contract this module |

## Validation reminder

```text
@Valid on DTO → Bean Validation → MethodArgumentNotValidException
@ControllerAdvice / @ExceptionHandler → ErrorResponse
400 validation · 404 not-found · 409 duplicate · correlation lab-request-001
Assert status AND body shape in MockMvc
```

## Incremental build

Exercises 1–6 notes → Lab 29 `examples/lab29-crm` (DTO constraints + GlobalExceptionHandler + ErrorResponse).

Start here: [`README.md`](README.md) · Exercises: [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md)
