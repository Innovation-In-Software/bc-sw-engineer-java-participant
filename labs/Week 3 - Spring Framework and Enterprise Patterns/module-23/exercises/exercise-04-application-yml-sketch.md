# Exercise 3 — application.yml Sketch

**Module 23** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab23-application-yml-sketch.md` — sketch YAML keys Lab 23 will use without committing secrets.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-23-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-04-application-yml-sketch.md` (this file in the course repo) |
| Your notes file | `notes/lab23-application-yml-sketch.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 23 — application.yml Sketch

## Reference

| Key | Example |
| --- | --- |
| `spring.application.name` | `northstar-crm` |
| `server.port` | `8080` |
| `logging.level.root` | `INFO` |

## Step 1 — Draft YAML

Create `notes/application-yml-sketch.yml` with `spring.application.name`, `server.port`, and a logging level. No passwords.

## Step 2 — Check the reference

Confirm keys match the reference table style.

## Step 3 — Profile teaser

Add a commented line mentioning `spring.profiles.active` — Lab 26 deepens this; do not invent prod secrets.

## Step 4 — Security hygiene

Write: real DB passwords never go in committed YAML.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-23-exercises/`, create `notes/` if needed, then create `notes/lab23-application-yml-sketch.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 23 — application.yml Sketch

## Reference

| Key | Example |
| --- | --- |
| `spring.application.name` | `northstar-crm` |
| `server.port` | `8080` |
| `logging.level.root` | `INFO` |

## Step 1 — Draft YAML

Create `notes/application-yml-sketch.yml` with `spring.application.name`, `server.port`, and a logging level. No passwords.

## Step 2 — Check the reference

Confirm keys match the reference table style.

## Step 3 — Profile teaser

Add a commented line mentioning `spring.profiles.active` — Lab 26 deepens this; do not invent prod secrets.

## Step 4 — Security hygiene

Write: real DB passwords never go in committed YAML.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Safe YAML sketch exists with no secrets in `notes/lab23-application-yml-sketch.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab23-application-yml-sketch.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 23 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab23-application-yml-sketch.md`
- [ ] Name and port present
- [ ] No secret values committed
- [ ] Profile called out as Lab 26 topic

