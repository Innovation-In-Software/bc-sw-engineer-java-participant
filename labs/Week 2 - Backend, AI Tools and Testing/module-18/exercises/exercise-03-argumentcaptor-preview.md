# Exercise 3 — ArgumentCaptor Preview

**Module 18** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab18-argumentcaptor-preview.md` — sketch ArgumentCaptor steps for saved Customer without running tests yet.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-18-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-03-argumentcaptor-preview.md` (this file in the course repo) |
| Your notes file | `notes/lab18-argumentcaptor-preview.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 18 — ArgumentCaptor Preview

## Step 1 — Declare

Paper: `ArgumentCaptor<Customer> captor = ArgumentCaptor.forClass(Customer.class);`

## Step 2 — Verify

`verify(repo).save(captor.capture());`

## Step 3 — Assert

Assert captor.getValue().getStatus() is ACTIVE for Ravi.

## Step 4 — Prep only

Write: *Prepare for Lab 18; do not complete full Mockito lab now.*

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-18-exercises/`, create `notes/` if needed, then create `notes/lab18-argumentcaptor-preview.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 18 — ArgumentCaptor Preview

## Step 1 — Declare

Paper: `ArgumentCaptor<Customer> captor = ArgumentCaptor.forClass(Customer.class);`

## Step 2 — Verify

`verify(repo).save(captor.capture());`

## Step 3 — Assert

Assert captor.getValue().getStatus() is ACTIVE for Ravi.

## Step 4 — Prep only

Write: *Prepare for Lab 18; do not complete full Mockito lab now.*

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A three-step captors sketch with pre-lab boundary in `notes/lab18-argumentcaptor-preview.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab18-argumentcaptor-preview.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 18 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab18-argumentcaptor-preview.md`
- [ ] Declare/verify/assert sketched
- [ ] ACTIVE asserted
- [ ] Pre-lab boundary present

