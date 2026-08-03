# Module 38 — Learn → Practice → Review (participant)

**Theme:** SQL and Query Performance (PostgreSQL EXPLAIN-first)  
**CRM:** Lab 37 schema · preserve `CUS-1001` / `CUS-1002` · measure before indexing

## Checkpoint map

| CP | After slides | Practice | Minutes |
| -- | ------------ | -------- | ------- |
| **A** | 183–193 SQL + joins | [Ex 1](exercises/exercise-01-access-patterns.md) | ~10–12 |
| **B** | 194–197 indexes/plans | [Ex 2](exercises/exercise-02-index-tradeoffs.md) → [4](exercises/exercise-04-explain-checklist.md) | ~20–24 |
| **C** | 198–200 tuning design | [Ex 5](exercises/exercise-05-sargability.md) → [3](exercises/exercise-03-fill-sql-index-todos.md) | ~22–27 |
| **D** | 201–202 enterprise | [Ex 6](exercises/exercise-06-lab38-readiness.md) | ~8–10 |
| **E** | 203–206 | [Lab 38](lab38/LAB-38-GUIDE.md) timed ~45 min | ~45 |

## Practice order

**1 → 2 → 4 → 5 → 3 → 6** then Lab 38.

## Do / don't

| Do now | Don't yet |
| --- | --- |
| Access patterns, EXPLAIN checklist, sargable rewrites | JPA repositories (Lab 39) |
| Index tradeoffs with write-cost awareness | Indexing every column without evidence |
| Keyset vs deep OFFSET on paper | Tuning shared production without approval |

## Hard gate before Lab 38

- [ ] Ex notes complete (order above)
- [ ] Lab 37 CUSTOMER/ACCOUNT available
- [ ] Plan: baseline EXPLAIN before creating indexes
