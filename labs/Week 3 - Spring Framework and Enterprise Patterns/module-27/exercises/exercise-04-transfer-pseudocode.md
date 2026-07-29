# Exercise 4 — Transfer Pseudocode (TODOs)

**Module 27** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab27-transfer-pseudocode.md` — complete pseudocode showing rollback when destination is ACC-FORCE-FAIL.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-27-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-04-transfer-pseudocode.md` (this file in the course repo) |
| Your notes file | `notes/lab27-transfer-pseudocode.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 27 — Transfer Pseudocode (TODOs)

## Step 2 — Fill TODOs
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-27-exercises/`, create `notes/` if needed, then create `notes/lab27-transfer-pseudocode.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 27 — Transfer Pseudocode (TODOs)

## Step 2 — Fill TODOs

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

## Step 3 — Self-check

Explain in one sentence why a caught-and-ignored exception would break atomicity.

## Step 4 — Reflect

Customers `CUS-1001` / `CUS-1002` own the seeded accounts — do not invent Kafka outbox here.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Pseudocode blanks filled; atomicity reflection written in `notes/lab27-transfer-pseudocode.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab27-transfer-pseudocode.md` |
| `@Transactional` on controller | Put it on TransferService |
| Checked exception swallowed | Let runtime failures roll back / configure rollbackFor |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab27-transfer-pseudocode.md`
- [ ] `@Transactional` filled
- [ ] Force-fail throw present
- [ ] Swallowing danger explained

