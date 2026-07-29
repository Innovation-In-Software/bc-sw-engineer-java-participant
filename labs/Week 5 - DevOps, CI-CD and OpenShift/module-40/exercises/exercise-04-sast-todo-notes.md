# Exercise 4 — Fill SAST Path TODOs

**Module 40** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab40-sast-todo-notes.md` — complete a fill-in checklist for one request-to-sink path (pre-lab notes only).

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-40-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-04-sast-todo-notes.md` (this file in the course repo) |
| Your notes file | `notes/lab40-sast-todo-notes.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 40 — Fill SAST Path TODOs

## Step 1 — Copy template

In notes, create `sast-path-todo.md` with blanks:
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-40-exercises/`, create `notes/` if needed, then create `notes/lab40-sast-todo-notes.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 40 — Fill SAST Path TODOs

## Step 1 — Copy template

In notes, create `sast-path-todo.md` with blanks:
```
Endpoint: _____
Authz check: _____
Sink (SQL/file/log): _____
Customer fixture used: _____
Risk if missing check: _____
```

## Step 2 — Fill for customer read

Fill blanks for `GET /api/customers/{id}` using `CUS-1001`. Authz must mention role/object-level check TODOs.

## Step 3 — Second path

Duplicate the template for a write path (update interaction or status) involving `CUS-1002`.

## Step 4 — Self-check

Ensure no passwords, tokens, or real PII appear. Mark items still `_____` that Lab 40 will prove with code.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Two filled SAST path notes with remaining blanks only where Lab 40 code proof is required in `notes/lab40-sast-todo-notes.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab40-sast-todo-notes.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 40 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab40-sast-todo-notes.md`
- [ ] Template filled for read and write paths
- [ ] Fixtures CUS-1001/CUS-1002 used
- [ ] No secrets in notes

