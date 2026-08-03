# Exercise 3 — XSS and CSP Notes

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 149–152) |
| **Deliverable** | `notes/lab36-xss-csp.md` |
| **Fixtures** | CUS-1001 / CUS-1002 · no real secrets |

### What you will learn

Plan text-safe rendering and CSP evidence for customer name payloads.

### Enterprise context

Amina/Ravi names must never execute as HTML/JS.

### Predict

dangerouslySetInnerHTML with API name — pass or fail?

### Debug

XSS test finds an img node — what sink was used?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Relying on CSP alone | Still render as text; CSP is defense-in-depth |
| Disabling browser security | Never for convenience |

**Module 36** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-36-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab36-xss-csp.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 36 — XSS and CSP Notes

## Step 1 — Danger

If a malicious name contains `<script>...` and you use `dangerouslySetInnerHTML`, XSS can steal tokens.

## Step 2 — Rule

Prefer text children / React escaping; avoid HTML injection APIs.

## Step 3 — CSP

One sentence: CSP can reduce inline script risk (lab may only document).

## Step 4 — Test idea

Paper test string: `Amina <b>Khan</b>` should show angle brackets as text.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-36-exercises/`, create `notes/` if needed, then create `notes/lab36-xss-csp.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 36 — XSS and CSP Notes

## Step 1 — Danger

If a malicious name contains `<script>...` and you use `dangerouslySetInnerHTML`, XSS can steal tokens.

## Step 2 — Rule

Prefer text children / React escaping; avoid HTML injection APIs.

## Step 3 — CSP

One sentence: CSP can reduce inline script risk (lab may only document).

## Step 4 — Test idea

Paper test string: `Amina <b>Khan</b>` should show angle brackets as text.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

XSS rules and a paper test string for safe rendering in `notes/lab36-xss-csp.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab36-xss-csp.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 36 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab36-xss-csp.md`
- [ ] dangerouslySetInnerHTML warning
- [ ] Prefer-escaping rule
- [ ] Test string recorded

