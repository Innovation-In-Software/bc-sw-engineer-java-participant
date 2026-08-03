# Exercise 6 — Lab 36 Readiness

## Activity card

| | |
| --- | --- |
| **Time** | 8–10 minutes |
| **Checkpoint** | **D** (after slides 156–157) |
| **Deliverable** | `notes/lab36-prep-checklist.md` |
| **Fixtures** | CUS-1001 / CUS-1002 · no real secrets |

### What you will learn

Confirm Lab 35 http boundary ready; no real secrets; no DB trust.

### Enterprise context

Hard gate before login/guards/XSS proofs.

### Predict

Can UI guards replace Spring Security?

### Debug

Starting Module 37 schema early — park it?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| No Lab 35 API client | Finish http/customersApi first or use starter |
| Production tokens in git | Never commit; redact screenshots |

**Module 36** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-36-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab36-prep-checklist.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 36 prep checklist

## Earlier exercise files present?
| File | Present? (yes/no) |
| ---- | ----------------- |
| notes/lab36-security.md | (your note here) |
| notes/lab36-token-storage.md | (your note here) |
| notes/lab36-xss-csp.md | (your note here) |
| notes/lab36-csrf-notes.md | (your note here) |
| notes/lab36-todos.md | (your note here) |

## Fixtures (verify)
| ID | Name | Status |
| -- | ---- | ------ |
| CUS-1001 | Amina Khan | ACTIVE |
| CUS-1002 | Ravi Singh | PROSPECT |

## Scope statement
Pre-lab only — prepare for lab; do not complete full Lab 36 now.

## Self mark
Overall prep: Pass / Fail
If Fail, revisit exercise(s): (your note here)
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-36-exercises/`, create `notes/` if needed, then create `notes/lab36-prep-checklist.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 36 prep checklist

## Earlier exercise files present?
| File | Present? (yes/no) |
| ---- | ----------------- |
| notes/lab36-security.md | _____ |
| notes/lab36-token-storage.md | _____ |
| notes/lab36-xss-csp.md | _____ |
| notes/lab36-csrf-notes.md | _____ |
| notes/lab36-todos.md | _____ |

## Fixtures (verify)
| ID | Name | Status |
| -- | ---- | ------ |
| CUS-1001 | Amina Khan | ACTIVE |
| CUS-1002 | Ravi Singh | PROSPECT |

## Scope statement
Pre-lab only — prepare for lab; do not complete full Lab 36 now.

## Self mark
Overall prep: Pass / Fail
If Fail, revisit exercise(s): _____
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Decision log and Pass/Fail readiness in `notes/lab36-prep-checklist.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab36-prep-checklist.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 36 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab36-prep-checklist.md`
- [ ] Three decisions listed
- [ ] IdP deferred
- [ ] Pass/Fail marked

