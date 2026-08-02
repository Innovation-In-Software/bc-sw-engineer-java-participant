# Module 23 — Classroom pacing (Learn → Practice → Review)

**For instructors and participants.** Do **not** finish every Module 23 slide before practicing.

Detailed author notes: `curriculum/Week 3 - Spring Framework and Enterprise Patterns/module-23/INSTRUCTOR-PACING.md`

## Checkpoint map

| Block | After slides | Practice |
| ----- | ------------ | -------- |
| **A** | 36–46 | [Ex 1](exercises/exercise-01-autoconfig-vs-ownership.md) |
| **B** | 47–52 | [Ex 2](exercises/exercise-02-starters-inventory.md) · [Ex 3](exercises/exercise-03-crm-application-stub.md) |
| **C** | 53–59 | [Ex 4](exercises/exercise-04-application-yml-sketch.md) · [Ex 5](exercises/exercise-05-rest-smoke-plan.md) |
| **D** | 60–61 | [Ex 6](exercises/exercise-06-lab23-readiness.md) |
| **E** | 62–64 | [Lab 23](lab23/LAB-23-GUIDE.md) · Kahoot |

**Classroom practice order:** **1 → 2 → 3 → 4 → 5 → 6**

## Streamline overlapping topics

| Topic | Keep short | Why |
| ----- | ---------- | --- |
| Deep `@ConditionalOn*` internals | Awareness | Lab proves starters + run + health |
| Full profile/secret externalization | Teaser only | Lab 26 deepens |
| Actuator metrics/cardinality depth | Health smoke | Lab 21 already covered observability |
| SOAP / Security / `@Transactional` | Later | Labs 24 / 28 / 27 |

## Boot reminder

```text
Starters (web + actuator + test) → CrmApplication → application.yml
Embedded server · /api/customers · /actuator/health
Auto-config gifts ≠ ownership of CRM rules
```

## Incremental build

Exercises 1–6 notes → Lab 23 `examples/lab23-crm` (Boot app + REST + health + autoconfig notes).

Start here: [`README.md`](README.md) · Exercises: [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md)
