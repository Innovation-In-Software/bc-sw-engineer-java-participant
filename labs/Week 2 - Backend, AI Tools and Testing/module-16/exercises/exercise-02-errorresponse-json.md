# Exercise 2 — ErrorResponse JSON Draft

**Module 16** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab16-errorresponse-json.md` — draft JSON fields for a not-found error including correlation.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-16-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-02-errorresponse-json.md` (this file in the course repo) |
| Your notes file | `notes/lab16-errorresponse-json.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 16 — ErrorResponse JSON Draft

## Step 1 — Fields

Fields: timestamp, status, error, message, path, correlationId.

## Step 2 — Sample

Sketch JSON for CUS-9999 not found with correlationId lab-request-001.

## Step 3 — Hygiene

Message must not include stack traces or SQL.

## Step 4 — Boundary

Note: paper draft only; advice controller wiring is lab-time.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-16-exercises/`, create `notes/` if needed, then create `notes/lab16-errorresponse-json.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 16 — ErrorResponse JSON Draft

## Step 1 — Fields

Fields: timestamp, status, error, message, path, correlationId.

## Step 2 — Sample

Sketch JSON for CUS-9999 not found with correlationId lab-request-001.

## Step 3 — Hygiene

Message must not include stack traces or SQL.

## Step 4 — Boundary

Note: paper draft only; advice controller wiring is lab-time.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A sample ErrorResponse JSON using lab-request-001 in `notes/lab16-errorresponse-json.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab16-errorresponse-json.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 16 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab16-errorresponse-json.md`
- [ ] Required fields listed
- [ ] CUS-9999 sample sketched
- [ ] No stack-trace in message

