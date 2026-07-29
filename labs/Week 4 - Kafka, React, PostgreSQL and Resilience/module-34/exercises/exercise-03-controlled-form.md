# Exercise 4 — Controlled Form Sketch

**Module 34** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab34-controlled-form.md` — sketch a controlled form flow for creating a customer (paper).

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-34-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-03-controlled-form.md` (this file in the course repo) |
| Your notes file | `notes/lab34-controlled-form.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 34 — Controlled Form Sketch

## Reference

| UI piece | State field |
| --- | --- |
| Name input | name |
| Status select | status |
| Error text | error |
| Submit disabled | isValid derived |

## Step 2 — Flow

Number steps: render → onChange updates state → validate → onSubmit.

## Step 3 — Fixture

Example draft: name `Ravi Singh`, status `ACTIVE` before submit assigns `CUS-1002` (server later).

## Step 4 — Uncontrolled note

One line: uncontrolled refs are out of scope for this lab path.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-34-exercises/`, create `notes/` if needed, then create `notes/lab34-controlled-form.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 34 — Controlled Form Sketch

## Reference

| UI piece | State field |
| --- | --- |
| Name input | name |
| Status select | status |
| Error text | error |
| Submit disabled | isValid derived |

## Step 2 — Flow

Number steps: render → onChange updates state → validate → onSubmit.

## Step 3 — Fixture

Example draft: name `Ravi Singh`, status `ACTIVE` before submit assigns `CUS-1002` (server later).

## Step 4 — Uncontrolled note

One line: uncontrolled refs are out of scope for this lab path.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Controlled-form flow diagram/list tied to Ravi example in `notes/lab34-controlled-form.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab34-controlled-form.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 34 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab34-controlled-form.md`
- [ ] Table present
- [ ] Four flow steps
- [ ] Fixture example included

