# Module 16 — Classroom pacing (Learn → Practice → Review)

**For instructors and participants.** Do **not** finish every Module 16 slide before practicing.

Detailed author notes: `curriculum/Week 2 - Backend, AI Tools and Testing/module-16/INSTRUCTOR-PACING.md`

## Checkpoint map

| Block | After slides | Practice |
| ----- | ------------ | -------- |
| **A** | 168–173 | [Ex 1](exercises/exercise-01-catch-order.md) |
| **B** | 174 | [Ex 2](exercises/exercise-02-errorresponse-json.md) |
| **C** | 175–177 | [Ex 3](exercises/exercise-03-failure-status-map.md) |
| **D** | 178–181 | [Ex 4](exercises/exercise-04-fill-message-hygiene-todos.md) · [Ex 5](exercises/exercise-05-correlation-always.md) · [Ex 6](exercises/exercise-06-lab16-prep-checklist.md) |
| **E** | 182–184 | [Lab 16](lab16/LAB-16-GUIDE.md) · Kahoot |

**Classroom practice order:** **1 → 2 → 3 → 4 → 5 → 6**

## Streamline overlapping topics

| Topic | Keep short | Why |
| ----- | ---------- | --- |
| Full Spring Boot `@ControllerAdvice` hosting | Pattern awareness + Lab handler | Lab 16 uses `GlobalExceptionHandler` + `ApiResult` |
| Security 401/403 deep dive | Awareness | Auth modules later |
| Logging frameworks | Correlation + safe messages | Lab 20 deepens logging |
| Returning stack traces to clients | Forbidden | Message hygiene |

## Error model reminder

```text
BusinessException / validation  →  GlobalExceptionHandler  →  ErrorResponse JSON
Catch specific before Exception · Always include correlationId (lab-request-001)
Demo: 400 invalid · 404 CUS-9999 · 409 ACTIVE→PROSPECT
```

## Incremental build

Exercises 1–6 notes → Lab 16 `examples/lab16-crm` (ErrorResponse + handler + facade Fail paths).

Optional codes cheat sheet: [`HTTP-STATUS-CODES.md`](HTTP-STATUS-CODES.md)

Start here: [`README.md`](README.md) · Exercises: [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md)
