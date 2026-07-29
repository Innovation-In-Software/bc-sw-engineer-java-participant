# Exercise 3 — Java to XSD Map

**Module 13** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab13-java-xsd-map.md` — map Customer fields to XSD-friendly types for fixtures.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-13-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-03-java-xsd-map.md` (this file in the course repo) |
| Your notes file | `notes/lab13-java-xsd-map.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 13 — Java to XSD Map

## Reference

| Java idea | XSD idea | Example |
| --- | --- | --- |
| String customerId | xsd:string | CUS-1001 |
| String fullName | xsd:string | Amina Khan |
| enum/status | xsd:string or enum | ACTIVE / PROSPECT |

## Step 2 — Id pattern

Propose a documentation pattern `CUS-####` (not enforced in code yet).

## Step 3 — Honesty

Note: mapping in this notes file. ≠ generated JAXB yet.

## Step 4 — Boundary

Mark: hosting/codegen with Spring-WS is Lab 24, not this prep.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-13-exercises/`, create `notes/` if needed, then create `notes/lab13-java-xsd-map.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 13 — Java to XSD Map

## Reference

| Java idea | XSD idea | Example |
| --- | --- | --- |
| String customerId | xsd:string | CUS-1001 |
| String fullName | xsd:string | Amina Khan |
| enum/status | xsd:string or enum | ACTIVE / PROSPECT |

## Step 2 — Id pattern

Propose a documentation pattern `CUS-####` (not enforced in code yet).

## Step 3 — Honesty

Note: mapping in this notes file. ≠ generated JAXB yet.

## Step 4 — Boundary

Mark: hosting/codegen with Spring-WS is Lab 24, not this prep.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A Java→XSD map using Amina and Ravi examples in `notes/lab13-java-xsd-map.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab13-java-xsd-map.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 13 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab13-java-xsd-map.md`
- [ ] Table includes both customers
- [ ] Id pattern proposed
- [ ] Lab 24 hosting deferred

