# Exercise 4 — Fill Message Hygiene TODOs

**Module 16** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab16-message-hygiene-todos.md` — complete fill-in blanks for safe vs unsafe error messages.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-16-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-04-fill-message-hygiene-todos.md` (this file in the course repo) |
| Your notes file | `notes/lab16-message-hygiene-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 16 — Fill Message Hygiene TODOs

## Step 1 — Copy TODOs

Safe not-found message: (your note here)
Unsafe message anti-pattern: (your note here)
Correlation always field: (your note here)
Log stack trace? (your note here) (server logs yes/no)
Return stack trace to client? (your note here)
@ControllerAdvice live in this pre-lab? (your note here)

## Step 2 — Fill blanks

Fill safe message for unknown customer, unsafe SQL/PII example, `correlationId`, yes for server logs, no for client, no for live advice.

## Step 3 — Correlation always

Write: *Every error sketch includes lab-request-001 (or request header value).*

## Step 4 — Self-check

Confirm client stack-trace blank is no.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-16-exercises/`, create `notes/` if needed, then create `notes/lab16-message-hygiene-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 16 — Fill Message Hygiene TODOs

## Step 1 — Copy TODOs

Safe not-found message: _____
Unsafe message anti-pattern: _____
Correlation always field: _____
Log stack trace? _____ (server logs yes/no)
Return stack trace to client? _____
@ControllerAdvice live in this pre-lab? _____

## Step 2 — Fill blanks

Fill safe message for unknown customer, unsafe SQL/PII example, `correlationId`, yes for server logs, no for client, no for live advice.

## Step 3 — Correlation always

Write: *Every error sketch includes lab-request-001 (or request header value).*

## Step 4 — Self-check

Confirm client stack-trace blank is no.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Filled hygiene TODOs with correlation-always rule in `notes/lab16-message-hygiene-todos.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab16-message-hygiene-todos.md` |
| Returning e.getMessage() blindly | Map to stable client messages |
| Omitting correlation on 500s | Always include correlationId |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab16-message-hygiene-todos.md`
- [ ] All _____ replaced
- [ ] Correlation rule written
- [ ] No live @ControllerAdvice claimed

