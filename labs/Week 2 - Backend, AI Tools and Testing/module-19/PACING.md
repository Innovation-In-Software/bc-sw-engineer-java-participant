# Module 19 — Classroom pacing (Learn → Practice → Review)

**For instructors and participants.** Do **not** finish every Module 19 slide before practicing.

Detailed author notes: `curriculum/Week 2 - Backend, AI Tools and Testing/module-19/INSTRUCTOR-PACING.md`

## Checkpoint map

| Block | After slides | Practice |
| ----- | ------------ | -------- |
| **A** | 220–225 | [Ex 1](exercises/exercise-01-test-pyramid.md) |
| **B** | 226–229 | [Ex 2](exercises/exercise-02-data-testid-locators.md) |
| **C** | 230–231 | [Ex 3](exercises/exercise-03-page-object.md) |
| **D** | 232 | [Ex 4](exercises/exercise-04-flake-ci-note.md) · [Ex 6](exercises/exercise-06-fill-correlation-header-todos.md) · [Ex 5](exercises/exercise-05-lab19-prep-checklist.md) |
| **E** | 233–235 | [Lab 19](lab19/LAB-19-GUIDE.md) · Kahoot |

**Classroom practice order:** **1 → 2 → 3 → 4 → 6 → 5** (correlation before prep gate)

## Streamline overlapping topics

| Topic | Keep short | Why |
| ----- | ---------- | --- |
| Full Spring Test / `@SpringBootTest` deep dive | Awareness | Lab uses API IT + Selenium on a thin web layer |
| Actuator probes | Defer | Lab 21 |
| Absolute XPath as primary locator | Anti-pattern | Prefer `data-testid` |
| Replacing unit tests with only UI | Anti-pattern | Pyramid: many units, few UI journeys |

## Regression reminder

```text
CustomerApiIT (X-Correlation-Id)  +  CustomerFormPage / CustomerUiIT (data-testid, headless)
No raw Thread.sleep · explicit waits · Chrome/Chromium + WebDriverManager
```

## Incremental build

Exercises 1–4, 6, 5 notes → Lab 19 `examples/lab19-crm` (API IT + Selenium Page Object).

Start here: [`README.md`](README.md) · Exercises: [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md)
