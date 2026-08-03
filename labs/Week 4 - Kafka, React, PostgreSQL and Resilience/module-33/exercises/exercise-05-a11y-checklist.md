# Exercise 5 — A11y Checklist

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **D** (after slides 90–94) |
| **Deliverable** | `notes/lab33-a11y-checklist.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT |

### What you will learn

Checklist: labels, roles, status text, keyboard-friendly buttons.

### Enterprise context

RTL tests query by role — UI must be accessible to pass.

### Predict

getByRole('button', { name: /save/i }) fails — what to fix?

### Debug

Status shown only as green/red circle — a11y fail?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| No form labels | htmlFor / aria-label on inputs |
| Testing class names | Prefer role + name queries |

**Module 33** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-33-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab33-a11y-checklist.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 33 — A11y Checklist

## Step 1 — Semantics

Prefer `button`, `h1–h3`, `ul/li` over clickable divs.

## Step 2 — Contrast

Note status colors need text + icon/shape, not color alone.

## Step 3 — Keyboard

Tab order reaches View for Amina and Ravi.

## Step 4 — Checklist file

Save 5 checkbox lines in notes.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-33-exercises/`, create `notes/` if needed, then create `notes/lab33-a11y-checklist.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 33 — A11y Checklist

## Step 1 — Semantics

Prefer `button`, `h1–h3`, `ul/li` over clickable divs.

## Step 2 — Contrast

Note status colors need text + icon/shape, not color alone.

## Step 3 — Keyboard

Tab order reaches View for Amina and Ravi.

## Step 4 — Checklist file

Save 5 checkbox lines in notes.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A five-item a11y checklist for Lab 33 in `notes/lab33-a11y-checklist.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab33-a11y-checklist.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 33 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab33-a11y-checklist.md`
- [ ] Semantics called out
- [ ] Color-not-only noted
- [ ] Five checklist lines

