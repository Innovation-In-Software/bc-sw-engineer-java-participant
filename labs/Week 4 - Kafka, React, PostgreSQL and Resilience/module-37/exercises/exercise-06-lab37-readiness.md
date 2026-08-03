# Exercise 6 — Lab 37 Readiness

## Activity card

| | |
| --- | --- |
| **Time** | 8–10 minutes |
| **Checkpoint** | **D** (after slides 176–178) |
| **Deliverable** | `notes/lab37-prep-checklist.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT |

### What you will learn

Confirm Docker/shared Postgres plan; no JPA/EXPLAIN yet.

### Enterprise context

Hard gate before applying DDL.

### Predict

Who should own objects — superuser or CRM_APP?

### Debug

Starting Lab 38 indexes early — park EXPLAIN?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Passwords in Git | Use .env only; never commit secrets |
| No Docker | Use instructor shared PostgreSQL sheet |

**Module 37** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-37-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab37-prep-checklist.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 37 prep checklist

## Earlier exercise files present?
| File | Present? (yes/no) |
| ---- | ----------------- |
| notes/lab37-design.md | (your note here) |
| notes/lab37-er-sketch.md | (your note here) |
| notes/lab37-constraints.md | (your note here) |
| notes/lab37-ddl-todos.md | (your note here) |
| notes/lab37-seed-and-verify-plan.md | (your note here) |

## Fixtures (verify)
| ID | Name | Status |
| -- | ---- | ------ |
| CUS-1001 | Amina Khan | ACTIVE |
| CUS-1002 | Ravi Singh | PROSPECT |

## Scope statement
Pre-lab only — prepare for lab; do not complete full Lab 37 now.

## Self mark
Overall prep: Pass / Fail
If Fail, revisit exercise(s): (your note here)
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-37-exercises/`, create `notes/` if needed, then create `notes/lab37-prep-checklist.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 37 prep checklist

## Earlier exercise files present?
| File | Present? (yes/no) |
| ---- | ----------------- |
| notes/lab37-design.md | _____ |
| notes/lab37-er-sketch.md | _____ |
| notes/lab37-constraints.md | _____ |
| notes/lab37-ddl-todos.md | _____ |
| notes/lab37-seed-and-verify-plan.md | _____ |

## Fixtures (verify)
| ID | Name | Status |
| -- | ---- | ------ |
| CUS-1001 | Amina Khan | ACTIVE |
| CUS-1002 | Ravi Singh | PROSPECT |

## Scope statement
Pre-lab only — prepare for lab; do not complete full Lab 37 now.

## Self mark
Overall prep: Pass / Fail
If Fail, revisit exercise(s): _____
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Readiness checklist spanning design artifacts and secrets hygiene in `notes/lab37-prep-checklist.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab37-prep-checklist.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 37 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab37-prep-checklist.md`
- [ ] Artifacts listed
- [ ] Secrets rule stated
- [ ] Pass/Fail marked

