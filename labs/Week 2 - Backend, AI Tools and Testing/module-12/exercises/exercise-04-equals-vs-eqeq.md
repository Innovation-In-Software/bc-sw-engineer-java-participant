# Exercise 4 — Equals vs ==

**Module 12** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab12-equals-vs-eqeq.md` — document when == is wrong for status strings and customer ids.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-12-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-04-equals-vs-eqeq.md` (this file in the course repo) |
| Your notes file | `notes/lab12-equals-vs-eqeq.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 12 — Equals vs ==

## Reference

| Check | Use | Why |
| --- | --- | --- |
| status ACTIVE? | Objects.equals / enum | String identity is unsafe |
| same Customer instance? | == | Reference equality only |
| id CUS-1001? | equals | Value equality |

## Step 2 — Bad snippet

Write a bad line: `if (status == "ACTIVE")` and label it Fail.

## Step 3 — Good snippet

Write a good conceptual check for Amina ACTIVE using equals or enum.

## Step 4 — JDK note

Note: prefer enums on JDK 21 sketches when status set is closed.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-12-exercises/`, create `notes/` if needed, then create `notes/lab12-equals-vs-eqeq.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 12 — Equals vs ==

## Reference

| Check | Use | Why |
| --- | --- | --- |
| status ACTIVE? | Objects.equals / enum | String identity is unsafe |
| same Customer instance? | == | Reference equality only |
| id CUS-1001? | equals | Value equality |

## Step 2 — Bad snippet

Write a bad line: `if (status == "ACTIVE")` and label it Fail.

## Step 3 — Good snippet

Write a good conceptual check for Amina ACTIVE using equals or enum.

## Step 4 — JDK note

Note: prefer enums on JDK 21 sketches when status set is closed.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A comparison cheat sheet tied to Northstar statuses in `notes/lab12-equals-vs-eqeq.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab12-equals-vs-eqeq.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 12 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab12-equals-vs-eqeq.md`
- [ ] Table plus null-safe row
- [ ] Bad and good snippets present
- [ ] Enum preference noted

