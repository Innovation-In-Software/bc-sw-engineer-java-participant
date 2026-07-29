# Exercise 1 — Authentication Versus Authorization

**Module 28** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/authn-authz.md` — explain 401 vs 403 with Northstar agent/admin examples.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-28-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-01-authn-vs-authz.md` (this file in the course repo) |
| Your notes file | `notes/authn-authz.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 28 — Authentication Versus Authorization

## Reference

| Status | Meaning | CRM example |
| --- | --- | --- |
| 401 | Not authenticated | No/invalid Bearer token |
| 403 | Authenticated but forbidden | `agent1` hits `/api/admin/**` |
| 200 | Allowed | `agent1` GET `CUS-1001` |

## Step 1 — Define

In `notes/authn-authz.md`, define authentication and authorization in one sentence each.

## Step 2 — Check the reference

Fill a 401/403/200 example row matching the table.

## Step 3 — Lab users

Record `agent1` (AGENT) and `admin1` (ADMIN).

## Step 4 — Correlation ≠ auth

`lab-request-001` is operational metadata — never treat it as a credential.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-28-exercises/`, create `notes/` if needed, then create `notes/authn-authz.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 28 — Authentication Versus Authorization

## Reference

| Status | Meaning | CRM example |
| --- | --- | --- |
| 401 | Not authenticated | No/invalid Bearer token |
| 403 | Authenticated but forbidden | `agent1` hits `/api/admin/**` |
| 200 | Allowed | `agent1` GET `CUS-1001` |

## Step 1 — Define

In `notes/authn-authz.md`, define authentication and authorization in one sentence each.

## Step 2 — Check the reference

Fill a 401/403/200 example row matching the table.

## Step 3 — Lab users

Record `agent1` (AGENT) and `admin1` (ADMIN).

## Step 4 — Correlation ≠ auth

`lab-request-001` is operational metadata — never treat it as a credential.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

401/403/200 CRM examples and lab users documented in `notes/authn-authz.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/authn-authz.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 28 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/authn-authz.md`
- [ ] Authn vs authz defined
- [ ] 401/403 examples correct
- [ ] Correlation-not-auth stated

