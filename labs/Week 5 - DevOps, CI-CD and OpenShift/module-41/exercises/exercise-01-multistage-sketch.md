# Exercise 1 — Sketch Multi-Stage Build

**Module 41** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab41-multistage-sketch.md` — separate Maven build stage from JRE runtime stage on paper.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-41-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-01-multistage-sketch.md` (this file in the course repo) |
| Your notes file | `notes/lab41-multistage-sketch.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 41 — Sketch Multi-Stage Build

## Reference

| Stage | Contains | Must not contain |
| --- | --- | --- |
| build | JDK 21, Maven, sources | runtime secrets |
| runtime | JRE, app JAR, non-root user | Maven, .git, passwords |

## Step 1 — Stages

Name two stages: `build` (Maven + JDK 21) and `runtime` (JRE 21). List what copies between them (the JAR only).

## Step 2 — Check the reference

Runtime must not include Maven, source, or `.git`. Prefer Temurin/Eclipse JRE base images as instructed.

## Step 3 — User

Plan non-root UID (example `10001`) and note why root fails the lab.

## Step 4 — CRM note

State that fixtures `CUS-1001`/`CUS-1002` are app data at runtime—not build args.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-41-exercises/`, create `notes/` if needed, then create `notes/lab41-multistage-sketch.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 41 — Sketch Multi-Stage Build

## Reference

| Stage | Contains | Must not contain |
| --- | --- | --- |
| build | JDK 21, Maven, sources | runtime secrets |
| runtime | JRE, app JAR, non-root user | Maven, .git, passwords |

## Step 1 — Stages

Name two stages: `build` (Maven + JDK 21) and `runtime` (JRE 21). List what copies between them (the JAR only).

## Step 2 — Check the reference

Runtime must not include Maven, source, or `.git`. Prefer Temurin/Eclipse JRE base images as instructed.

## Step 3 — User

Plan non-root UID (example `10001`) and note why root fails the lab.

## Step 4 — CRM note

State that fixtures `CUS-1001`/`CUS-1002` are app data at runtime—not build args.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A two-stage Dockerfile sketch with non-root runtime intent in `notes/lab41-multistage-sketch.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab41-multistage-sketch.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 41 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab41-multistage-sketch.md`
- [ ] Build vs runtime separated
- [ ] JAR-only copy planned
- [ ] Non-root UID noted

