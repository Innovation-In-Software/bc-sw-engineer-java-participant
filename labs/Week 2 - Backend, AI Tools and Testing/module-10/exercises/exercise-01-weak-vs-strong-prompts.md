# Exercise 1 — Weak vs Strong Prompts

**Module 10** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab10-prelab-prompts.md` and contrast a vague Copilot prompt with a strong Northstar-scoped one.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-10-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-01-weak-vs-strong-prompts.md` (this file in the course repo) |
| Your notes file | `notes/lab10-prelab-prompts.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 10 pre-lab prompts

## Weak
Write a customer class.
Why weak: ...

## Strong
...

## Three constraints
1. ...
2. ...
3. ...
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-10-exercises/`, create `notes/lab10-prelab-prompts.md` (create the `notes/` folder if it does not exist).

### Step 2 — Weak prompt

Write the weak prompt: *Write a customer class.* Note why it invites wrong package, wrong JDK APIs, or invented annotations.

### Step 3 — Strong prompt

Rewrite: plain Java 21 record/class for Northstar CRM customer `CUS-1001` Amina Khan status ACTIVE; fields id, fullName, status; no Spring, no JPA; correlation note `lab-request-001` in comments only.

### Step 4 — Diff the asks

List three constraints the strong prompt adds (JDK, domain fixtures, no-framework).

### Step 5 — Save

Save both prompts and the three constraints in `notes/lab10-prelab-prompts.md`. Pre-lab only — do not finish Lab 10.

Example shape:

```markdown
# Lab 10 pre-lab prompts

## Weak
Write a customer class.
Why weak: ...

## Strong
...

## Three constraints
1. ...
2. ...
3. ...
```

## Expected result

Paired weak/strong prompts with three explicit constraints in `notes/lab10-prelab-prompts.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| Accepting first suggestion blindly | Require fixtures + JDK 21 + no phantom deps in the prompt |
| Putting secrets in chat | Use fake CRM ids only (CUS-1001 / CUS-1002) |
| Wrong file name | Must be `notes/lab10-prelab-prompts.md` (not a random notes title) |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab10-prelab-prompts.md` | Pass / Fail |
| 2 | Weak and strong prompts written | Pass / Fail |
| 3 | Three constraints listed | Pass / Fail |
