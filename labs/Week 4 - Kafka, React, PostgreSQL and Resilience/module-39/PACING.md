# Module 39 — Learn → Practice → Review (participant)

**Theme:** Spring Data JPA and PostgreSQL  
**CRM:** Flyway V1 · entities + `@Version` · repos · paging · 409 conflicts · Postgres IT

## Checkpoint map

| CP | After slides | Practice | Minutes |
| -- | ------------ | -------- | ------- |
| **A** | 207–216 entities | [Ex 1](exercises/exercise-01-entity-mapping.md) | ~12–15 |
| **B** | 217–220 repositories | [Ex 2](exercises/exercise-02-repository-sketch.md) → [3](exercises/exercise-03-fill-jpa-todos.md) | ~20–24 |
| **C** | 221–224 paging/lazy | [Ex 4](exercises/exercise-04-paging-locking.md) | ~12–15 |
| **D** | 225–230 Postgres + practices | [Ex 5](exercises/exercise-05-flyway-plan.md) → [6](exercises/exercise-06-lab39-readiness.md) | ~18–22 |
| **E** | 231–234 | [Lab 39](lab39/LAB-39-GUIDE.md) timed ~45 min | ~45 |

## Practice order

**1 → 2 → 3 → 4 → 5 → 6** then Lab 39.

## Do / don't

| Do now | Don't yet |
| --- | --- |
| Flyway + validate mapping + transactional services | `ddl-auto=create-drop` as strategy |
| Bounded paging + `@Version` → 409 | H2 pretending to be PostgreSQL in IT |
| BigDecimal money; OSIV off | Secrets in committed YAML / Week 5 Lab 40 yet |

## Hard gate before Lab 39

- [ ] Ex 1–6 notes exist
- [ ] Lab 37/38 column names frozen for V1
- [ ] Postgres (compose/shared) + `.env` plan

## Optional after Lab 39

Week 4 review slides **235–243** (architecture walkthrough) — instructor-led; not a graded lab.
