# Exercise 6 — Fill Correlation Header TODOs

**Module 19** · Checkpoint D · Classroom order **1 → 2 → 3 → 4 → 6 → 5** then Lab 19

## Activity card

| | |
| --- | --- |
| **Objective** | Complete fill-in blanks for correlation headers in integration tests |
| **Skills practiced** | API IT observability hooks |
| **Expected outcome** | notes/lab19-correlation-header-todos.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-19-exercises/` → notes/lab19-correlation-header-todos.md |
| **Checkpoint** | D (after slides 232) |

## What you will learn

- Header X-Correlation-Id = lab-request-001
- IT must attach header; UI may log optionally
- Actuator not in this pre-lab (Lab 21)

**Enterprise context:** Without correlation on create IT, Lab 20 logging demos cannot join UI and API evidence.

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-19-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab19-correlation-header-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 19 — Fill Correlation Header TODOs

Header: X-Correlation-Id
Value: lab-request-001
IT must attach? yes
UI logs correlation? yes/optional
Flake mitigation: explicit waits / testids
Actuator in this pre-lab? no (Lab 21)

CI agents need browser driver management.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-19-exercises/`, create `notes/` if needed, then create `notes/lab19-correlation-header-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 19 — Fill Correlation Header TODOs

Header name: _____
Header value for lab: _____
IT call must attach header? _____
UI journey logs correlation? _____
Flake mitigation idea: _____
Actuator in this pre-lab? _____

## CI note
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Filled correlation TODOs in `notes/lab19-correlation-header-todos.md`.

## Debug / design challenge

If create IT omits the header, what Lab 20 demo becomes harder?

## Predict the Output / Behavior

Is Actuator required to echo X-Correlation-Id in Lab 19?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab19-correlation-header-todos.md` |
| Claiming Actuator now | Answer no / Lab 21 |
| Wrong correlation value | Use lab-request-001 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab19-correlation-header-todos.md`
- [ ] All _____ replaced
- [ ] X-Correlation-Id named
- [ ] Actuator = no
