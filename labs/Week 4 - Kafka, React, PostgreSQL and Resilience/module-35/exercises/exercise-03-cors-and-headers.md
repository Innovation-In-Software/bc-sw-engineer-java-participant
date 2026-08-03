# Exercise 3 — CORS and Headers

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **D** (after slides 134–136) |
| **Deliverable** | `notes/lab35-cors-and-headers.md` |
| **Fixtures** | CUS-1001 / CUS-1002 · `X-Correlation-Id: lab-request-001` |

### What you will learn

Plan Vite origin allowlist and X-Correlation-Id on mutations.

### Enterprise context

Spring CORS must deny evil Origin; browser speaks JSON only.

### Predict

What breaks if allowlist is * in production notes?

### Debug

CORS error but curl works — where to look?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Port mismatch | Match http://localhost:5173 exactly |
| JWT in pre-lab | Auth headers wait for Lab 36 — keep injectable |

**Module 35** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-35-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab35-cors-and-headers.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 35 — CORS and Headers

## Step 1 — Origins

Typical: UI `http://localhost:5173`, API `http://localhost:8080` (adjust if your lab differs).

## Step 2 — CORS

One sentence: browser blocks cross-origin XHR unless Spring allows the UI origin.

## Step 3 — Correlation

Plan header e.g. `X-Correlation-Id: lab-request-001` on fetches.

## Step 4 — Secrets

Do not put DB passwords in frontend env — only public API base URL.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-35-exercises/`, create `notes/` if needed, then create `notes/lab35-cors-and-headers.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 35 — CORS and Headers

## Step 1 — Origins

Typical: UI `http://localhost:5173`, API `http://localhost:8080` (adjust if your lab differs).

## Step 2 — CORS

One sentence: browser blocks cross-origin XHR unless Spring allows the UI origin.

## Step 3 — Correlation

Plan header e.g. `X-Correlation-Id: lab-request-001` on fetches.

## Step 4 — Secrets

Do not put DB passwords in frontend env — only public API base URL.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

CORS/header notes with a safe env boundary in `notes/lab35-cors-and-headers.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab35-cors-and-headers.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 35 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab35-cors-and-headers.md`
- [ ] Origins stated
- [ ] Correlation header planned
- [ ] No-secrets rule written

