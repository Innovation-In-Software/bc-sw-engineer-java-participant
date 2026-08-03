# Exercise 6 — Release Readiness Scorecard

## Activity card

| | |
| --- | --- |
| **Time** | 8–10 minutes |
| **Checkpoint** | **D** (after slides 112–115) |
| **Deliverable** | `notes/lab51-prep-checklist.md` |
| **Fixtures** | CUS-1001 smoke · 401/403 negatives · no secrets in Git |

### What you will learn

Score release readiness: security, pipeline, image, deploy, smoke, rollback, residual risks.

### Enterprise context

Lab 52 defends with this evidence pack—owners required on accepted risks.

### Predict

Can you GO with undocumented residual Critical findings?

### Debug

Starting Lab 52 slides as this warmup — park?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| No residual risk owner | Name owner + expiry |
| Secrets in evidence | Redact; rotate |

**Module 51** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-51-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab51-prep-checklist.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 51 prep checklist

## Earlier exercise files present?
| File | Present? (yes/no) |
| ---- | ----------------- |
| notes/lab51-threat-checklist.md | (your note here) |
| notes/lab51-rbac-negative-plan.md | (your note here) |
| notes/lab51-pipeline-gates.md | (your note here) |
| notes/lab51-deploy-evidence-todos.md | (your note here) |
| notes/lab51-rollback-smoke.md | (your note here) |

## Fixtures (verify)
| ID | Name | Status |
| -- | ---- | ------ |
| CUS-1001 | Amina Khan | ACTIVE |
| CUS-1002 | Ravi Singh | PROSPECT |

## Scope statement
Pre-lab only — prepare for lab; do not complete full Lab 51 now.

## Self mark
Overall prep: Pass / Fail
If Fail, revisit exercise(s): (your note here)
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-51-exercises/`, create `notes/` if needed, then create `notes/lab51-prep-checklist.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 51 prep checklist

## Earlier exercise files present?
| File | Present? (yes/no) |
| ---- | ----------------- |
| notes/lab51-threat-checklist.md | _____ |
| notes/lab51-rbac-negative-plan.md | _____ |
| notes/lab51-pipeline-gates.md | _____ |
| notes/lab51-deploy-evidence-todos.md | _____ |
| notes/lab51-rollback-smoke.md | _____ |

## Fixtures (verify)
| ID | Name | Status |
| -- | ---- | ------ |
| CUS-1001 | Amina Khan | ACTIVE |
| CUS-1002 | Ravi Singh | PROSPECT |

## Scope statement
Pre-lab only — prepare for lab; do not complete full Lab 51 now.

## Self mark
Overall prep: Pass / Fail
If Fail, revisit exercise(s): _____
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Honest readiness scorecard with owners in `notes/lab51-prep-checklist.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab51-prep-checklist.md` |
| Shipping on :latest | Pin digest |
| Green build with skipped SAST | Keep the gate |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab51-prep-checklist.md`
- [ ] Categories listed
- [ ] No fake Pass on undone work
- [ ] Owners assigned

