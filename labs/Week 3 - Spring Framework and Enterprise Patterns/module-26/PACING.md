# Module 26 — Classroom pacing (Learn → Practice → Review)

**For instructors and participants.** Do **not** finish every Module 26 slide before practicing.

Detailed author notes: `curriculum/Week 3 - Spring Framework and Enterprise Patterns/module-26/INSTRUCTOR-PACING.md`

## Checkpoint map

| Block | After slides | Practice |
| ----- | ------------ | -------- |
| **A** | 115–125 | [Ex 1](exercises/exercise-01-profile-purposes.md) · [Ex 2](exercises/exercise-02-profile-yaml-todos.md) |
| **B** | 126–128 | [Ex 3](exercises/exercise-03-config-properties-sketch.md) · [Ex 4](exercises/exercise-04-override-order.md) |
| **C** | 129–132 | [Ex 5](exercises/exercise-05-activation-drill.md) · [Ex 6](exercises/exercise-06-lab26-readiness.md) |
| **D** | 133–135 | [Lab 26](lab26/LAB-26-GUIDE.md) · Kahoot |

**Classroom practice order:** **1 → 2 → 3 → 4 → 5 → 6**

## Streamline overlapping topics

| Topic | Keep short | Why |
| ----- | ---------- | --- |
| Vault / cloud secret managers | Awareness | Lab uses env vars + `.env.example` |
| JWT / SecurityFilterChain | Later (Lab 28) | Config ≠ auth filters |
| `@Transactional` demos | Later (Lab 27) | Profiles first |
| Committing real secrets | Forbidden | Placeholders only |

## Profiles reminder

```text
application.yml + application-{dev|test|prod}.yml
Activate: -Dspring.profiles.active / SPRING_PROFILES_ACTIVE
Override order: CLI > env > profile YAML > base YAML
prod fails fast without required secrets
```

## Incremental build

Exercises 1–6 notes → Lab 26 `examples/lab26-crm` (profiles + ConfigProperties + activation evidence).

Start here: [`README.md`](README.md) · Exercises: [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md)
