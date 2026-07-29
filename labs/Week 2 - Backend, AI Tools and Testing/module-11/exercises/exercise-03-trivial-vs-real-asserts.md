# Exercise 3 — Trivial vs Real Asserts

**Module 11** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab11-prelab-asserts.md` that labels weak Copilot asserts vs asserts that protect Amina/Ravi behavior.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-11-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-03-trivial-vs-real-asserts.md` (this file in the course repo) |
| Your notes file | `notes/lab11-prelab-asserts.md` |

## Northstar fixtures

| ID | Name | Status |
| -- | ---- | ------ |
| `CUS-1001` | Amina Khan | `ACTIVE` |
| `CUS-1002` | Ravi Singh | `PROSPECT` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 11 pre-lab — trivial vs real asserts

## Trivial (reject these — false confidence)
1. assertNotNull(customer);
2. assertTrue(true);

Why weak: they pass even if status, id, or business rules are wrong.

## Meaningful (prefer these)
1. assertEquals(CustomerStatus.ACTIVE, amina.getStatus());  // CUS-1001 Amina
2. assertEquals(CustomerStatus.PROSPECT, ravi.getStatus()); // CUS-1002 Ravi

## Review rule (one sentence)
Reject AI tests that never mention domain values (CUS-1001/CUS-1002, ACTIVE/PROSPECT) or outcomes.

## Scope
Pre-lab only — do not finish Lab 11.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-11-exercises/`, create `notes/lab11-prelab-asserts.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 11 pre-lab — trivial vs real asserts

## Trivial (reject these — false confidence)
1. assertNotNull(customer);
2. assertTrue(true);

Why weak: they pass even if status, id, or business rules are wrong.

## Meaningful (prefer these)
1. assertEquals(CustomerStatus.ACTIVE, amina.getStatus());  // CUS-1001 Amina
2. assertEquals(CustomerStatus.PROSPECT, ravi.getStatus()); // CUS-1002 Ravi

## Review rule (one sentence)
Reject AI tests that never mention domain values (CUS-1001/CUS-1002, ACTIVE/PROSPECT) or outcomes.

## Scope
Pre-lab only — do not finish Lab 11.
```

### Step 3 — Self-check

Amina = ACTIVE; Ravi = PROSPECT. Do not swap.

## Expected result

`notes/lab11-prelab-asserts.md` with two trivial asserts, two meaningful asserts, and a reject rule.

## If it fails

| Problem | Fix |
| --- | --- |
| Only listing trivial asserts | Add the two ACTIVE/PROSPECT asserts |
| Swapping Amina/Ravi | Amina ACTIVE (`CUS-1001`); Ravi PROSPECT (`CUS-1002`) |
| Wrong file name | Must be `notes/lab11-prelab-asserts.md` |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab11-prelab-asserts.md` | Pass / Fail |
| 2 | Two trivial + two meaningful asserts written | Pass / Fail |
| 3 | Review rule + correct fixtures | Pass / Fail |
