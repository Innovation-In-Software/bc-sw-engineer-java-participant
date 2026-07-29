# Exercise 3 — Fill Resilience TODOs

**Module 32** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab32-todos.md` — fill TODOs in Resilience4j pseudocode for the CRM client.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-32-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-05-fill-resilience-todos.md` (this file in the course repo) |
| Your notes file | `notes/lab32-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 32 — Fill Resilience TODOs

## Step 1 — Paste

Create `notes/lab32-todos.md`:
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-32-exercises/`, create `notes/` if needed, then create `notes/lab32-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 32 — Fill Resilience TODOs

## Step 1 — Paste

Create `notes/lab32-todos.md`:

```java
@CircuitBreaker(name = "_____", fallbackMethod = "_____")
@Retry(name = "accountProfile")
@TimeLimiter(name = "accountProfile")
public CompletableFuture<AccountProfile> getProfile(String customerId) {
  return _____.fetch(customerId); // remote client
}

private CompletableFuture<AccountProfile> profileFallback(String customerId, Throwable t) {
  // TODO: return minimal profile for CUS-1001 / CUS-1002
  return CompletableFuture.completedFuture(_____);
}
```

## Step 2 — Fill

Suggested fills: `accountProfile`, `profileFallback`, `accountClient`, `AccountProfile.minimal(customerId)` (or similar).

## Step 3 — Config blanks

Add YAML TODOs: `failureRateThreshold: _____`, `waitDurationInOpenState: _____`, `maxAttempts: _____` with example numbers you choose.

## Step 4 — Correlation

TODO comment: log `lab-request-001` when fallback fires.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Filled pseudocode and numeric config TODOs ready for the starter in `notes/lab32-todos.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab32-todos.md` |
| Fallback signature mismatch | Fallback must match return type + extra Throwable arg |
| Retrying non-idempotent POSTs forever | Limit attempts; prefer idempotent GETs for profile |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab32-todos.md`
- [ ] Annotation blanks filled
- [ ] Three config numbers chosen
- [ ] Correlation log TODO present

