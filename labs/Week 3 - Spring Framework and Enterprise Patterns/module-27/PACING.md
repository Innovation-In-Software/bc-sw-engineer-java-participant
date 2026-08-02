# Module 27 — Classroom pacing (Learn → Practice → Review)

**For instructors and participants.** Do **not** finish every Module 27 slide before practicing.

Detailed author notes: `curriculum/Week 3 - Spring Framework and Enterprise Patterns/module-27/INSTRUCTOR-PACING.md`

## Checkpoint map

| Block | After slides | Practice |
| ----- | ------------ | -------- |
| **A** | 137–146 | [Ex 1](exercises/exercise-01-acid-crm.md) |
| **B** | 147–151 | [Ex 2](exercises/exercise-02-transaction-boundary.md) · [Ex 3](exercises/exercise-03-rollback-plan.md) |
| **C** | 152–156a | [Ex 4](exercises/exercise-04-transfer-pseudocode.md) · [Ex 5](exercises/exercise-05-propagation-warnings.md) · [Ex 6](exercises/exercise-06-lab27-readiness.md) |
| **D** | 157–159 | [Lab 27](lab27/LAB-27-GUIDE.md) · Kahoot |

**Classroom practice order:** **1 → 2 → 3 → 4 → 5 → 6**

## Streamline overlapping topics

| Topic | Keep short | Why |
| ----- | ---------- | --- |
| Isolation level deep dive | Awareness | Lab proves atomic rollback |
| Distributed / XA / sagas | Awareness | Single-DB transfer lab |
| `@Transactional` on controllers | Forbidden | Service boundary only |
| JWT / SecurityFilterChain | Later (Lab 28) | Money paths first |

## Transaction reminder

```text
@Transactional on TransferService (not controller)
debit + credit + TransactionLog = one unit of work
ACC-FORCE-FAIL → balances unchanged + no success log
ACID notes must cite observed evidence
```

## Incremental build

Exercises 1–6 notes → Lab 27 `examples/lab27-crm` (TransferService + rollback evidence + ACID notes).

Start here: [`README.md`](README.md) · Exercises: [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md)
