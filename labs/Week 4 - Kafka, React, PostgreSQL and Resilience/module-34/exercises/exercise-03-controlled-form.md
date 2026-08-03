# Exercise 4 — Controlled Form Sketch

## Activity card

| | |
| --- | --- |
| **Time** | 12–15 minutes |
| **Checkpoint** | **B** (after slides 108–110) |
| **Deliverable** | `notes/lab34-controlled-form.md` |
| **Fixtures** | CUS-1001 Amina · CUS-1002 Ravi · in-memory only |

### What you will learn

Sketch controlled inputs: value from state + onChange setters.

### Enterprise context

CustomerForm stays presentational; App owns draft state.

### Predict

Input won’t type — what’s usually missing?

### Debug

Uncontrolled defaultValue mixed with value — when OK?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| value without onChange | Bind both or input appears stuck |
| Draft in every card | Lift draft to App / form parent |

**Module 34** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-34-exercises/`) |
| ---- | --------------------------------------------- |
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

