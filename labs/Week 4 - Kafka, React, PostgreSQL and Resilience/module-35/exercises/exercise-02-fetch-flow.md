# Exercise 2 — Fetch Flow

## Activity card

| | |
| --- | --- |
| **Time** | 12–15 minutes |
| **Checkpoint** | **B** (after slides 126–130) |
| **Deliverable** | `notes/lab35-fetch-flow.md` |
| **Fixtures** | CUS-1001 / CUS-1002 · `X-Correlation-Id: lab-request-001` |

### What you will learn

Sketch load → loading → data/empty/error with AbortController.

### Enterprise context

Obsolete loads must cancel when query/unmount changes.

### Predict

Fast typing in search — what happens without abort?

### Debug

Double POST create — what guard?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| No loading flag | Distinct loading vs empty vs error states |
| Fetch in every card | One api layer + hook/cache in App |

**Module 35** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-35-exercises/`) |
| ---- | --------------------------------------------- |
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

