# Exercise 2 — Fetch Flow

**Module 35** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab35-fetch-flow.md` — sketch loading/success/error flow for listing customers.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-35-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-02-fetch-flow.md` (this file in the course repo) |
| Your notes file | `notes/lab35-fetch-flow.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 35 — Fetch Flow

## Step 1 — States

`idle | loading | success | error` for the list view.

## Step 2 — Sequence

Mount → set loading → fetch → set data (Amina/Ravi) or error message.

## Step 3 — Abort

Note AbortController on unmount to avoid setState after navigate away.

## Step 4 — Empty

Draft empty-state copy when API returns [].

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-35-exercises/`, create `notes/` if needed, then create `notes/lab35-fetch-flow.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 35 — Fetch Flow

## Step 1 — States

`idle | loading | success | error` for the list view.

## Step 2 — Sequence

Mount → set loading → fetch → set data (Amina/Ravi) or error message.

## Step 3 — Abort

Note AbortController on unmount to avoid setState after navigate away.

## Step 4 — Empty

Draft empty-state copy when API returns [].

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

State machine notes including abort and empty UI in `notes/lab35-fetch-flow.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab35-fetch-flow.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 35 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab35-fetch-flow.md`
- [ ] Four states named
- [ ] Abort noted
- [ ] Empty copy drafted

