# Exercise 5 — UI Verification Evidence Plan

## Activity card

| | |
| --- | --- |
| **Time** | 8–10 minutes |
| **Checkpoint** | **D** (after slides 83–84) |
| **Deliverable** | `notes/lab50-verification-plan.md` |
| **Fixtures** | CUS-1001/CUS-1002 · lab-request-001 · no real PII |

### What you will learn

Plan component/E2E evidence and one controlled failure path.

### Enterprise context

Defense needs screenshots/commands proving UI→API→DB—not vibes.

### Predict

What SELECT proves correlation lab-request-001?

### Debug

Flaky Selenium only — add component tests?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| No failure path | Invalid input or outage case |
| Secrets in screenshots | Redact tokens |

**Module 50** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-50-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab50-verification-plan.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 50 — UI Verification Evidence Plan

## Step 1 — Cases

Search hit, profile render, create interaction, error banner on API failure.

## Step 2 — Tools

Note assigned approach (component test and/or E2E) per instructor.

## Step 3 — Screenshots

Name files under `notes/screenshots/lab-50/`.

## Step 4 — Data proof

Include DB/API proof step after UI write.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-50-exercises/`, create `notes/` if needed, then create `notes/lab50-verification-plan.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 50 — UI Verification Evidence Plan

## Step 1 — Cases

Search hit, profile render, create interaction, error banner on API failure.

## Step 2 — Tools

Note assigned approach (component test and/or E2E) per instructor.

## Step 3 — Screenshots

Name files under `notes/screenshots/lab-50/`.

## Step 4 — Data proof

Include DB/API proof step after UI write.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Verification plan with evidence filenames in `notes/lab50-verification-plan.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab50-verification-plan.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 50 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab50-verification-plan.md`
- [ ] Four cases listed
- [ ] Evidence paths named
- [ ] DB/API proof included

