# Exercise 2 — Plan RBAC Negative Tests

**Module 51** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab51-rbac-negative-plan.md` — design deny-by-default proofs before coding.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-51-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-02-rbac-negative-plan.md` (this file in the course repo) |
| Your notes file | `notes/lab51-rbac-negative-plan.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 51 — Plan RBAC Negative Tests

## Reference

| Proof | Evidence idea |
| --- | --- |
| JWT resource server | Security tests + config snippets |
| SAST gate | CI log / scan summary sanitized |
| Image digest | sha256 record in manifest |
| k3s deploy | rollout status + Ingress smoke |
| Rollback | undo + readiness re-check |

## Step 1 — Cases

No token → 401; wrong role → 403; cross-customer access denied (as designed).

## Step 2 — Check the reference

Feature-complete is not release-ready without negative authz tests.

## Step 3 — Matrix

Make a small role × endpoint matrix with expected status codes.

## Step 4 — Scope

Plan only—implementation in Lab 51.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-51-exercises/`, create `notes/` if needed, then create `notes/lab51-rbac-negative-plan.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 51 — Plan RBAC Negative Tests

## Reference

| Proof | Evidence idea |
| --- | --- |
| JWT resource server | Security tests + config snippets |
| SAST gate | CI log / scan summary sanitized |
| Image digest | sha256 record in manifest |
| k3s deploy | rollout status + Ingress smoke |
| Rollback | undo + readiness re-check |

## Step 1 — Cases

No token → 401; wrong role → 403; cross-customer access denied (as designed).

## Step 2 — Check the reference

Feature-complete is not release-ready without negative authz tests.

## Step 3 — Matrix

Make a small role × endpoint matrix with expected status codes.

## Step 4 — Scope

Plan only—implementation in Lab 51.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

RBAC negative-test matrix drafted in `notes/lab51-rbac-negative-plan.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab51-rbac-negative-plan.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 51 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab51-rbac-negative-plan.md`
- [ ] Three negative cases listed
- [ ] Role×endpoint matrix present
- [ ] Pre-lab marked

