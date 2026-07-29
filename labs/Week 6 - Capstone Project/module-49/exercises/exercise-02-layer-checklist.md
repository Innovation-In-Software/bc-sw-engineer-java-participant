# Exercise 2 — Controller-Service-Repository Checklist

**Module 49** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab49-layer-checklist.md` — list responsibilities per layer for the chosen slice.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-49-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-02-layer-checklist.md` (this file in the course repo) |
| Your notes file | `notes/lab49-layer-checklist.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 49 — Controller-Service-Repository Checklist

## Reference

| Layer | Owns | Avoids |
| --- | --- | --- |
| Controller | HTTP mapping, status codes | Business rules sprawl |
| Service | Transactions, domain rules | Raw JDBC in controller |
| Repository | Persistence | HTTP concerns |

## Step 1 — Table

Controller: HTTP/DTO; Service: rules/transactions; Repository: persistence.

## Step 2 — Check the reference

Validation belongs on inputs; business rules not only in controllers.

## Step 3 — Transaction note

Mark which service method needs `@Transactional` (placeholder).

## Step 4 — JDK/Maven

Note verify habit: `./mvnw -B test` on the backend module.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-49-exercises/`, create `notes/` if needed, then create `notes/lab49-layer-checklist.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 49 — Controller-Service-Repository Checklist

## Reference

| Layer | Owns | Avoids |
| --- | --- | --- |
| Controller | HTTP mapping, status codes | Business rules sprawl |
| Service | Transactions, domain rules | Raw JDBC in controller |
| Repository | Persistence | HTTP concerns |

## Step 1 — Table

Controller: HTTP/DTO; Service: rules/transactions; Repository: persistence.

## Step 2 — Check the reference

Validation belongs on inputs; business rules not only in controllers.

## Step 3 — Transaction note

Mark which service method needs `@Transactional` (placeholder).

## Step 4 — JDK/Maven

Note verify habit: `./mvnw -B test` on the backend module.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Layer checklist with transaction placeholder in `notes/lab49-layer-checklist.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab49-layer-checklist.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 49 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab49-layer-checklist.md`
- [ ] Three layers described
- [ ] Validation placement stated
- [ ] mvnw test noted

