# Exercise 6 — Lab 24 Readiness Checklist

**Module 24** · Checkpoint D · Exercises 1–6 Pass then Lab 24

## Activity card

| | |
| --- | --- |
| **Objective** | Confirm prior notes exist and you are ready for Lab 24 |
| **Skills practiced** | Readiness gate |
| **Expected outcome** | notes/lab24-readiness.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-24-exercises/` → notes/lab24-readiness.md |
| **Checkpoint** | D (after slides 83–86) |

## What you will learn

- Gate Lab 24 on Ex 1–5 notes
- Contract-first + shared service clear
- No REST deletion / JWT detour planned

**Enterprise context:** Teams that skip the ops map implement business rules twice and fail peer review.

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-24-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab24-readiness.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 24 readiness checklist

| File | Present? |
| ---- | -------- |
| notes/contract-first.md | yes |
| notes/soap-ops.md | yes |
| notes/lab24-payloadroot-skeleton.md | yes |
| notes/fault-vs-rest.md | yes |
| notes/usernametoken-plan.md | yes |

Keep REST. Overall prep: Pass
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-24-exercises/`, create `notes/` if needed, then create `notes/lab24-readiness.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 24 readiness checklist

| File | Present? (yes/no) |
| ---- | ----------------- |
| notes/contract-first.md | _____ |
| notes/soap-ops.md | _____ |
| notes/lab24-payloadroot-skeleton.md | _____ |
| notes/fault-vs-rest.md | _____ |
| notes/usernametoken-plan.md | _____ |

## Scope
Pre-lab only. Keep REST? _____

## Self mark
Overall prep: Pass / Fail
If Fail, revisit: _____
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab24-001` (or `lab-request-001` on REST). Replace every `_____` before Pass.

## Expected result

Readiness checklist in `notes/lab24-readiness.md`.

## Debug / design challenge

If contract-first notes say Java is source of truth, which exercise do you reopen?

## Predict the Output / Behavior

What WSDL URL will you hit after spring-boot:run in the lab starter?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab24-readiness.md` |
| Marking Pass with blanks | Fill every yes/no |
| Starting Lab 24 mid-checklist | Finish Ex 1–5 first |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab24-readiness.md`
- [ ] Artifacts confirmed
- [ ] Keep REST noted
- [ ] Pass/Fail marked
