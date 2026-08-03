# Exercise 1 — Test Pyramid for CRM

**Module 19** · Checkpoint A · Classroom order **1 → 2 → 3 → 4 → 6 → 5** then Lab 19

## Activity card

| | |
| --- | --- |
| **Objective** | Place activate unit tests, API IT, and Selenium UI on a pyramid |
| **Skills practiced** | Test strategy, layer placement |
| **Expected outcome** | notes/lab19-pyramid.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-19-exercises/` → notes/lab19-pyramid.md |
| **Checkpoint** | A (after slides 220–225) |

## What you will learn

- Base: many JUnit/Mockito service tests (Labs 17–18)
- Middle: fewer API integration tests
- Top: few Selenium journeys

**Enterprise context:** Enterprises that invert the pyramid drown in flaky UI suites and still miss domain bugs.

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-19-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab19-pyramid.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 19 — Test Pyramid for CRM

Base: many fast JUnit/Mockito tests (Labs 17–18).
Middle: fewer API IT (create/get + correlation).
Top: few Selenium journeys (Amina form / status).

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-19-exercises/`, create `notes/` if needed, then create `notes/lab19-pyramid.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 19 — Test Pyramid for CRM

## Base (unit)
_____

## Middle (API IT)
_____

## Top (UI)
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Pyramid with three layers in `notes/lab19-pyramid.md`.

## Debug / design challenge

If someone deletes all unit tests and keeps only Selenium, which pyramid problem is that?

## Predict the Output / Behavior

Where do Labs 17–18 suites sit on your diagram?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab19-pyramid.md` |
| Only UI at the base | Invert: units at base |
| Starting the full lab mid-exercise | Finish pre-lab notes first |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab19-pyramid.md`
- [ ] Base named
- [ ] Middle named
- [ ] Top named
