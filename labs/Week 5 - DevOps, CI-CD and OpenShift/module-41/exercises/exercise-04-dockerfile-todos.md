# Exercise 4 — Fill Dockerfile TODO Skeleton

**Module 41** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab41-dockerfile-todos.md` — complete a skeleton with blanks (do not claim a finished Lab 41 image).

## Deliverable

| Item | Path (under `examples/module-41-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-04-dockerfile-todos.md` (this file in the course repo) |
| Your notes file | `notes/lab41-dockerfile-todos.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-41-exercises/`, create `notes/` if needed, then create `notes/lab41-dockerfile-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 41 — Fill Dockerfile TODO Skeleton

## Step 1 — Skeleton

Create `Dockerfile.skeleton` notes:
```
FROM _____ AS build
WORKDIR /workspace
COPY _____ .
RUN ./mvnw -B -DskipTests package
FROM _____ AS runtime
USER _____
COPY --from=build _____ /app/app.jar
HEALTHCHECK CMD _____
ENTRYPOINT ["java","-jar","/app/app.jar"]
```

## Step 2 — Fill blanks

Fill JDK/JRE image tags, copy paths, USER, and HEALTHCHECK using course conventions.

## Step 3 — Peer check

Mark any blank you are unsure about for Lab 41 confirmation.

## Step 4 — Security scrub

Confirm no secret ARG/ENV slipped in.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A filled Dockerfile skeleton ready for Lab 41 verification in `notes/lab41-dockerfile-todos.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab41-dockerfile-todos.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 41 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab41-dockerfile-todos.md` | Pass / Fail |
| 2 | All major blanks filled or marked unsure | Pass / Fail |
| 3 | Non-root USER set | Pass / Fail |
| 4 | No secrets present | Pass / Fail |
