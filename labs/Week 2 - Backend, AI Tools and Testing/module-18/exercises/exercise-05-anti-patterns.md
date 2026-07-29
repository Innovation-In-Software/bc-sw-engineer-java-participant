# Exercise 5 — Mockito Anti-Patterns

**Module 18** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab18-anti-patterns.md` — list anti-patterns Copilot might suggest for CRM tests.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-18-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-05-anti-patterns.md` (this file in the course repo) |
| Your notes file | `notes/lab18-anti-patterns.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 18 — Mockito Anti-Patterns

## Reference

| Anti-pattern | Better |
| --- | --- |
| Mock the SUT | Mock collaborators only |
| Unnecessary stubbing | Stub what is used |
| verifyNoMoreInteractions always | Use when interaction surface is critical |

## Step 2 — AI reject rule

Reject suggestions that mock CustomerService while testing CustomerService.

## Step 3 — Fixture

Prefer real Customer state objects for Amina/Ravi over mocking getters needlessly.

## Step 4 — Boundary

Note ArgumentCaptor deep practice continues in timed lab; preview next.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-18-exercises/`, create `notes/` if needed, then create `notes/lab18-anti-patterns.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 18 — Mockito Anti-Patterns

## Reference

| Anti-pattern | Better |
| --- | --- |
| Mock the SUT | Mock collaborators only |
| Unnecessary stubbing | Stub what is used |
| verifyNoMoreInteractions always | Use when interaction surface is critical |

## Step 2 — AI reject rule

Reject suggestions that mock CustomerService while testing CustomerService.

## Step 3 — Fixture

Prefer real Customer state objects for Amina/Ravi over mocking getters needlessly.

## Step 4 — Boundary

Note ArgumentCaptor deep practice continues in timed lab; preview next.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

An anti-pattern sheet tuned for AI-assisted Mockito in `notes/lab18-anti-patterns.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab18-anti-patterns.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 18 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab18-anti-patterns.md`
- [ ] Table plus silly mock row
- [ ] SUT-mock reject rule
- [ ] Real fixture preference noted

