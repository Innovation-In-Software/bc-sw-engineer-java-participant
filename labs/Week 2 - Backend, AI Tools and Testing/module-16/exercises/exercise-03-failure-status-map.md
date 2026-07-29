# Exercise 3 — Failure to Status Map

**Module 16** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab16-status-map.md` — map Northstar failures to client-facing status classes.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-16-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-03-failure-status-map.md` (this file in the course repo) |
| Your notes file | `notes/lab16-status-map.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 16 — Failure to Status Map

## Reference

| Failure | Status idea |
| --- | --- |
| CUS-9999 not found | 404 / SOAP Client fault |
| Activate Amina illegal transition | 409 or 422 |
| Validation blank name | 400 |
| Unexpected bug | 500 (generic message) |

## Step 2 — Choose conflict

Pick 409 vs 422 for illegal activate and write one reason.

## Step 3 — Never

Write: never return 200 with an error payload for these failures.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-16-exercises/`, create `notes/` if needed, then create `notes/lab16-status-map.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 16 — Failure to Status Map

## Reference

| Failure | Status idea |
| --- | --- |
| CUS-9999 not found | 404 / SOAP Client fault |
| Activate Amina illegal transition | 409 or 422 |
| Validation blank name | 400 |
| Unexpected bug | 500 (generic message) |

## Step 2 — Choose conflict

Pick 409 vs 422 for illegal activate and write one reason.

## Step 3 — Never

Write: never return 200 with an error payload for these failures.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A failure→status map with an explicit never-200 rule in `notes/lab16-status-map.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab16-status-map.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 16 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab16-status-map.md`
- [ ] Table copied
- [ ] 409/422 decision reasoned
- [ ] Never-200 rule written

