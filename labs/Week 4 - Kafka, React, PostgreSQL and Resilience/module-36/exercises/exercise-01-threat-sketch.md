# Exercise 1 — Threat Sketch

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **A** (after slides 141–145) |
| **Deliverable** | `notes/lab36-security.md` |
| **Fixtures** | CUS-1001 / CUS-1002 · no real secrets |

### What you will learn

Sketch XSS, token theft, CSRF, and over-trusting UI guards for CRM.

### Enterprise context

SPA security is UX + hygiene; Spring remains authz source of truth.

### Predict

If ProtectedRoute is bypassed via URL — is data still safe?

### Debug

Hardcoding API keys in Vite — what threat?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Thinking UI guard = authz | Backend must enforce; guards are UX |
| Skipping threat model | Lab requires security-decisions.md |

**Module 36** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-36-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab36-security.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 36 — Threat Sketch

## Step 1 — Assets

What attackers want: session tokens, customer PII for Amina/Ravi, admin actions.

## Step 2 — Threats

Name XSS, token theft, CSRF (if cookie session), open redirects.

## Step 3 — UI vs API

One sentence: hiding a button is not authorization — Spring must enforce.

## Step 4 — Notes

Save `notes/lab36-security.md`.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-36-exercises/`, create `notes/` if needed, then create `notes/lab36-security.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 36 — Threat Sketch

## Step 1 — Assets

What attackers want: session tokens, customer PII for Amina/Ravi, admin actions.

## Step 2 — Threats

Name XSS, token theft, CSRF (if cookie session), open redirects.

## Step 3 — UI vs API

One sentence: hiding a button is not authorization — Spring must enforce.

## Step 4 — Notes

Save `notes/lab36-security.md`.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Threat list with UI-vs-API authorization boundary in `notes/lab36-security.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab36-security.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 36 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab36-security.md`
- [ ] ≥3 threats named
- [ ] Authorization boundary stated
- [ ] Notes saved

