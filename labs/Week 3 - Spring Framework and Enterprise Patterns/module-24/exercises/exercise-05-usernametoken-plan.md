# Exercise 5 — UsernameToken Plan

**Module 24** · Checkpoint D · Exercises 1–6 Pass then Lab 24

## Activity card

| | |
| --- | --- |
| **Objective** | Plan minimal WS-Security UsernameToken for the lab |
| **Skills practiced** | Message-level security planning |
| **Expected outcome** | notes/usernametoken-plan.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-24-exercises/` → notes/usernametoken-plan.md |
| **Checkpoint** | D (after slides 83–86) |

## What you will learn

- Token lives in SOAP Header
- Lab secret / PasswordText teaching mode
- Not a substitute for Lab 28 JWT on REST

**Enterprise context:** Message-level auth proves the partner presented credentials inside the envelope — still use TLS in production.

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-24-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/usernametoken-plan.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 24 — UsernameToken Plan

Header: wsse UsernameToken (lab user + lab password).
Success: secured GetCustomer for CUS-1001.
Failure: missing/wrong token → security fault before service call.
Not in scope: full signatures, SAML, OAuth IdP.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-24-exercises/`, create `notes/` if needed, then create `notes/usernametoken-plan.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 24 — UsernameToken Plan

## Where credentials live
_____

## Success case
_____

## Failure case
_____

## Out of scope
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab24-001` (or `lab-request-001` on REST). Replace every `_____` before Pass.

## Expected result

UsernameToken plan in `notes/usernametoken-plan.md`.

## Debug / design challenge

Is PasswordText UsernameToken enough without HTTPS in production?

## Predict the Output / Behavior

Does UsernameToken replace constructor DI on CustomerService?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/usernametoken-plan.md` |
| Planning JWT here | JWT is Lab 28 — UsernameToken for SOAP lab |
| No failure case | Missing token → security fault |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/usernametoken-plan.md`
- [ ] Header location
- [ ] Success + failure
- [ ] Out of scope noted
