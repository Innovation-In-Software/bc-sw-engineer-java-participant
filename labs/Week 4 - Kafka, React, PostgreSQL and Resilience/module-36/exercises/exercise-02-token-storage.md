# Exercise 2 — Token Storage Options

## Activity card

| | |
| --- | --- |
| **Time** | 12–15 minutes |
| **Checkpoint** | **B** (after slides 146–148) |
| **Deliverable** | `notes/lab36-token-storage.md` |
| **Fixtures** | CUS-1001 / CUS-1002 · no real secrets |

### What you will learn

Compare memory vs localStorage/sessionStorage for access tokens.

### Enterprise context

Lab 36 freezes in-memory tokens — no persistent web storage.

### Predict

XSS + localStorage token — what can an attacker do?

### Debug

Refresh token in localStorage 'for convenience' — tradeoff?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Wanting localStorage for demo | Use memory store; document tradeoff |
| Real production secrets in notes | Use placeholders only |

**Module 36** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-36-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab36-token-storage.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 36 — Token Storage Options

## Reference

| Option | Risk / note |
| --- | --- |
| In-memory variable | Lost on refresh; safer from XSS persistence |
| sessionStorage | Per-tab; XSS can read |
| localStorage | Survives refresh; XSS can read |
| HttpOnly cookie | Not JS-readable; needs CSRF strategy |

## Step 1 — Study table

Copy the reference table.

## Step 2 — Lab choice

Pick one approach for Lab 36 and justify in two sentences.

## Step 3 — Never

Never commit tokens; never put DB passwords in Vite env.

## Step 4 — Fixture

Use fake token `lab-token-001` in notes only — not a real secret.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-36-exercises/`, create `notes/` if needed, then create `notes/lab36-token-storage.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 36 — Token Storage Options

## Reference

| Option | Risk / note |
| --- | --- |
| In-memory variable | Lost on refresh; safer from XSS persistence |
| sessionStorage | Per-tab; XSS can read |
| localStorage | Survives refresh; XSS can read |
| HttpOnly cookie | Not JS-readable; needs CSRF strategy |

## Step 1 — Study table

Copy the reference table.

## Step 2 — Lab choice

Pick one approach for Lab 36 and justify in two sentences.

## Step 3 — Never

Never commit tokens; never put DB passwords in Vite env.

## Step 4 — Fixture

Use fake token `lab-token-001` in notes only — not a real secret.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Storage recommendation with explicit never-commit rules in `notes/lab36-token-storage.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab36-token-storage.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 36 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab36-token-storage.md`
- [ ] Choice + justification
- [ ] Never-commit rule
- [ ] Fake token example only

