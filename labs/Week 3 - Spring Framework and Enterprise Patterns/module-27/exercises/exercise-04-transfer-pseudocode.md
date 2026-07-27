# Exercise 4 — Transfer Pseudocode (TODOs)

**Module 27** · Hands-on exercise · [setup](EXERCISES-INDEX.md)

## Goal

Complete pseudocode showing rollback when destination is ACC-FORCE-FAIL.

## Steps

### Step 1 — Create file

Create `notes/TransferServiceSketch.java`.

### Step 2 — Fill TODOs

```java
// Sketch only — not a full Spring project
class TransferService {
    // TODO: Spring annotation for one unit of work
    @_____
    void transfer(String fromId, String toId, long amount) {
        Account from = load(fromId);
        Account to = load(toId);
        if ("ACC-FORCE-FAIL".equals(toId)) {
            // TODO: throw a runtime exception to trigger rollback
            throw new _____("forced failure");
        }
        from.debit(_____);   // TODO: amount
        to.credit(_____);    // TODO: amount
        logSuccess(fromId, toId, amount);
    }
}
```
Hints: `@Transactional`, `IllegalStateException` (or RuntimeException), `amount`.

### Step 3 — Self-check

Explain in one sentence why a caught-and-ignored exception would break atomicity.

### Step 4 — Reflect

Customers `CUS-1001` / `CUS-1002` own the seeded accounts — do not invent Kafka outbox here.

## Expected result

Pseudocode blanks filled; atomicity reflection written.

## If it fails

| Problem | Fix |
| --- | --- |
| Problem | Fix |
| `@Transactional` on controller | Put it on TransferService |
| Checked exception swallowed | Let runtime failures roll back / configure rollbackFor |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | `@Transactional` filled | Pass / Fail |
| 2 | Force-fail throw present | Pass / Fail |
| 3 | Swallowing danger explained | Pass / Fail |
