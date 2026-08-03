# Exercise 3 — Paging and Locking Notes

## Activity card

| | |
| --- | --- |
| **Time** | 12–15 minutes |
| **Checkpoint** | **C** (after slides 221–224) |
| **Deliverable** | `notes/lab39-paging-locking.md` |
| **Fixtures** | CUS-1001 / CUS-1002 · Lab 37/38 column names |

### What you will learn

Plan bounded Pageable, sort allow-list, and @Version conflict behavior.

### Enterprise context

Stable ACTIVE customer lists; concurrent edits → 409.

### Predict

Why add ID tie-breaker to sort?

### Debug

Lazy load after transaction with OSIV off — symptom?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Client-controlled sort on any column | Allow-list sortable fields |
| Eager everything | Prefer lazy + fetch join when needed |

**Module 39** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-39-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab39-paging-locking.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 39 — Paging and Locking Notes

## Step 1 — Page request

`PageRequest.of(0, 20, Sort.by("customerId"))`.

## Step 2 — Response

Return totalElements + content slice to the UI later.

## Step 3 — Optimistic lock

Second writer on Amina fails if version stale — user retries.

## Step 4 — Correlation

Log `lab-request-001` on lock failures for support.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-39-exercises/`, create `notes/` if needed, then create `notes/lab39-paging-locking.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 39 — Paging and Locking Notes

## Step 1 — Page request

`PageRequest.of(0, 20, Sort.by("customerId"))`.

## Step 2 — Response

Return totalElements + content slice to the UI later.

## Step 3 — Optimistic lock

Second writer on Amina fails if version stale — user retries.

## Step 4 — Correlation

Log `lab-request-001` on lock failures for support.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Paging + optimistic locking behavior notes in `notes/lab39-paging-locking.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab39-paging-locking.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 39 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab39-paging-locking.md`
- [ ] PageRequest example
- [ ] Stale version behavior
- [ ] Correlation logging note

