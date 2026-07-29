# Exercise 1 — Sketch Context Diagram

**Module 48** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab48-context-sketch.md` — identify users, external systems, and trust boundaries for Northstar CRM.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-48-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-01-context-sketch.md` (this file in the course repo) |
| Your notes file | `notes/lab48-context-sketch.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 48 — Sketch Context Diagram

## Reference

| Artifact | Purpose |
| --- | --- |
| docs/architecture/context.md | Users and external systems |
| docs/architecture/container.md | Deployable units and flows |
| docs/nfrs.md | Measurable quality attributes |
| docs/adrs/ | Decision records |
| docs/backlog.md | Vertical stories |
| docs/risk-register.md | Risks with owners/dates |

## Step 1 — Actors

List service agents, admins, and any external IdP/email/Kafka dependencies.

## Step 2 — Check the reference

Week 6 master doc expects `docs/architecture/context.md` and container.md.

## Step 3 — Trust boundaries

Mark where JWT auth, DB, and Kafka cross trust zones.

## Step 4 — Fixtures

Note synthetic customers `CUS-1001`/`CUS-1002` as demo data—not external systems.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-48-exercises/`, create `notes/` if needed, then create `notes/lab48-context-sketch.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 48 — Sketch Context Diagram

## Reference

| Artifact | Purpose |
| --- | --- |
| docs/architecture/context.md | Users and external systems |
| docs/architecture/container.md | Deployable units and flows |
| docs/nfrs.md | Measurable quality attributes |
| docs/adrs/ | Decision records |
| docs/backlog.md | Vertical stories |
| docs/risk-register.md | Risks with owners/dates |

## Step 1 — Actors

List service agents, admins, and any external IdP/email/Kafka dependencies.

## Step 2 — Check the reference

Week 6 master doc expects `docs/architecture/context.md` and container.md.

## Step 3 — Trust boundaries

Mark where JWT auth, DB, and Kafka cross trust zones.

## Step 4 — Fixtures

Note synthetic customers `CUS-1001`/`CUS-1002` as demo data—not external systems.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Context sketch with actors and trust boundaries in `notes/lab48-context-sketch.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab48-context-sketch.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 48 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab48-context-sketch.md`
- [ ] Actors listed
- [ ] Trust boundaries marked
- [ ] Fixtures distinguished

