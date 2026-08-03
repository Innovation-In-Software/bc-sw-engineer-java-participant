# Exercise 6 — Lab 32 Readiness

## Activity card

| | |
| --- | --- |
| **Time** | 8–10 minutes |
| **Checkpoint** | **D** (after slides 71–72) |
| **Deliverable** | `notes/lab32-prep-checklist.md` |
| **Fixtures** | CUS-1001 Account Profile · instance `accountProfile` |

### What you will learn

Confirm WireMock plan, fixtures, and no React error toasts yet.

### Enterprise context

Hard gate before Resilience4j coding.

### Predict

Can you prove OPEN without asserting WireMock request count?

### Debug

Starting React Module 33 early — park UI?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| No WireMock plan | Stub 503 / slow / OK for CUS-1001 |
| Unsafe write retry in notes | Document: reads only for aggressive retry |

**Module 32** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-32-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab32-prep-checklist.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 32 prep checklist

## Earlier exercise files present?
| File | Present? (yes/no) |
| ---- | ----------------- |
| notes/lab32-resilience.md | (your note here) |
| notes/lab32-circuit-states.md | (your note here) |
| notes/lab32-fallback-contract.md | (your note here) |
| notes/lab32-pattern-map.md | (your note here) |
| notes/lab32-todos.md | (your note here) |

## Fixtures (verify)
| ID | Name | Status |
| -- | ---- | ------ |
| CUS-1001 | Amina Khan | ACTIVE |
| CUS-1002 | Ravi Singh | PROSPECT |

## Scope statement
Pre-lab only — prepare for lab; do not complete full Lab 32 now.

## Self mark
Overall prep: Pass / Fail
If Fail, revisit exercise(s): (your note here)
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-32-exercises/`, create `notes/` if needed, then create `notes/lab32-prep-checklist.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 32 prep checklist

## Earlier exercise files present?
| File | Present? (yes/no) |
| ---- | ----------------- |
| notes/lab32-resilience.md | _____ |
| notes/lab32-circuit-states.md | _____ |
| notes/lab32-fallback-contract.md | _____ |
| notes/lab32-pattern-map.md | _____ |
| notes/lab32-todos.md | _____ |

## Fixtures (verify)
| ID | Name | Status |
| -- | ---- | ------ |
| CUS-1001 | Amina Khan | ACTIVE |
| CUS-1002 | Ravi Singh | PROSPECT |

## Scope statement
Pre-lab only — prepare for lab; do not complete full Lab 32 now.

## Self mark
Overall prep: Pass / Fail
If Fail, revisit exercise(s): _____
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Teach-back paragraph and readiness Pass/Fail in `notes/lab32-prep-checklist.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab32-prep-checklist.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 32 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab32-prep-checklist.md`
- [ ] Teach-back written
- [ ] Evidence preview listed
- [ ] Pass/Fail marked

