# Exercise 5 — JDK 21 / Maven Habit

**Module 10** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/jdk-maven-checklist.md` and record the exact version checks you will run before Lab 10 coding.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-10-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-05-jdk-maven-habit.md` (this file in the course repo) |
| Your notes file | `notes/jdk-maven-checklist.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# JDK 21 / Maven habit

- [ ] `java -version` shows 21.x
- [ ] `mvn -version` uses JDK 21
- PATH trap: ...
- Workspace: examples/module-10-exercises/notes/
- Boundary: do not run full Lab 10 Maven goals yet
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

Create `notes/jdk-maven-checklist.md`.

### Step 2 — Commands

Write checklist: `java -version` (21.x) and `mvn -version` (Java home = 21).

### Step 3 — PATH trap

Note one Windows PATH failure mode (wrong JDK first on PATH) and the fix habit.

### Step 4 — Workspace

Note target idea: bootcamp workspace + `notes\` for this module's prep files.

### Step 5 — Out of scope

Mark: *Do not run the full lab Maven goals until the timed Lab 10 session.*

Example shape:

```markdown
# JDK 21 / Maven habit

- [ ] `java -version` shows 21.x
- [ ] `mvn -version` uses JDK 21
- PATH trap: ...
- Workspace: examples/module-10-exercises/notes/
- Boundary: do not run full Lab 10 Maven goals yet
```

## Expected result

A short toolchain checklist in `notes/jdk-maven-checklist.md` with PATH awareness and pre-lab boundary.

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/jdk-maven-checklist.md`
- [ ] java and mvn checks listed
- [ ] One PATH trap named
- [ ] No-full-lab note present

