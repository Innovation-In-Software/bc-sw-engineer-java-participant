# Exercise 4 — Fill ci.yml TODOs

**Module 43** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab43-workflow-todos.md` — complete a workflow skeleton with blanks (do not require a passing remote run).

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-43-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-04-workflow-todos.md` (this file in the course repo) |
| Your notes file | `notes/lab43-workflow-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 43 — Fill ci.yml TODOs

## Step 1 — Skeleton

Create notes `ci.yml.skeleton` with blanks for `java-version`, verify command, artifact paths, and package `if:` condition.

## Step 2 — Fill

Fill blanks using Temurin 21 and `./mvnw -B clean verify` / package-once pattern.

## Step 3 — Secrets comment

Add a YAML comment: `# secrets via GitHub Actions secrets — never hardcode`.

## Step 4 — Scope

State that pushing and greening the workflow is Lab 43, not this exercise.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-43-exercises/`, create `notes/` if needed, then create `notes/lab43-workflow-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 43 — Fill ci.yml TODOs

## Step 1 — Skeleton

Create notes `ci.yml.skeleton` with blanks for `java-version`, verify command, artifact paths, and package `if:` condition.

## Step 2 — Fill

Fill blanks using Temurin 21 and `./mvnw -B clean verify` / package-once pattern.

## Step 3 — Secrets comment

Add a YAML comment: `# secrets via GitHub Actions secrets — never hardcode`.

## Step 4 — Scope

State that pushing and greening the workflow is Lab 43, not this exercise.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Filled workflow skeleton ready for Lab 43 in `notes/lab43-workflow-todos.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab43-workflow-todos.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 43 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab43-workflow-todos.md`
- [ ] Blanks filled for Java/verify/package
- [ ] Secrets comment present
- [ ] Pre-lab scope stated

