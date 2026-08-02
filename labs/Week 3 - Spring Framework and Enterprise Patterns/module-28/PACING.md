# Module 28 — Classroom pacing (Learn → Practice → Review)

**For instructors and participants.** Do **not** finish every Module 28 slide before practicing.

Detailed author notes: `curriculum/Week 3 - Spring Framework and Enterprise Patterns/module-28/INSTRUCTOR-PACING.md`

## Checkpoint map

| Block | After slides | Practice |
| ----- | ------------ | -------- |
| **A** | 161–166 | [Ex 1](exercises/exercise-01-authn-vs-authz.md) |
| **B** | 167–175 | [Ex 2](exercises/exercise-02-filter-chain-sketch.md) |
| **C** | 176–179 | [Ex 3](exercises/exercise-03-jwt-login-todos.md) · [Ex 4](exercises/exercise-04-mockmvc-matrix.md) |
| **D** | 180–182 | [Ex 5](exercises/exercise-05-production-checklist.md) · [Ex 6](exercises/exercise-06-lab28-readiness.md) |
| **E** | 183–185 | [Lab 28](lab28/LAB-28-GUIDE.md) · Kahoot |

**Classroom practice order:** **1 → 2 → 3 → 4 → 5 → 6**

## Streamline overlapping topics

| Topic | Keep short | Why |
| ----- | ---------- | --- |
| Full OAuth2 Authorization Server | Awareness / IdP checklist | Lab uses JWT login + filter |
| React token storage UI | Later (Week 4) | API security first |
| Bean Validation ErrorResponse polish | Later (Lab 29) | Authn/authz this module |
| Committing JWT signing secrets | Forbidden | `.env.example` placeholders only |

## Security reminder

```text
Authn = who · Authz = what they may do
Stateless SecurityFilterChain · JWT Bearer
/api/auth/login permitAll · /api/customers/** AGENT|ADMIN · /api/admin/** ADMIN
401 missing/bad token · 403 wrong role
```

## Incremental build

Exercises 1–6 notes → Lab 28 `examples/lab28-crm` (JWT + roles + MockMvc 401/403/200).

Start here: [`README.md`](README.md) · Exercises: [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md)
