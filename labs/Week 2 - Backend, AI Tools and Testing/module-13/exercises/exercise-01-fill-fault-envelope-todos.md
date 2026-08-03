# Exercise 1 — Fill Fault Envelope TODOs

**Module 13** · Checkpoint A · Exercises 1–6 Pass then Lab 13

## Activity card

| | |
| --- | --- |
| **Objective** | Fill SOAP fault envelope TODOs for CUS-9999 not found |
| **Skills practiced** | SOAP Envelope/Body/Fault structure |
| **Expected outcome** | notes/lab13-fault-todos.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-13-exercises/` → notes/lab13-fault-todos.md |
| **Checkpoint** | A (after slides 112–120) |

## What you will learn

- Faults live in the SOAP Body with code/string/detail patterns
- NotFound for unknown customer ids is an explicit contract outcome
- XML must stay well-formed even in fault samples

**Enterprise context:** CRM integrations need predictable SOAP faults, not opaque HTTP-only errors.

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-13-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab13-fault-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 13 — Fill Fault Envelope TODOs

## Step 1 — Copy envelope TODOs

Fault code: (your note here)
Fault string: (your note here)
Detail customerId: (your note here)
Correlation id: (your note here)
HTTP/transport note (placeholder): (your note here)
Real hosting lab: (your note here)

## Step 2 — Fill blanks

Use Client/NotFound style code, message for unknown customer, `CUS-9999`, `lab-request-001`, placeholder endpoint honesty, and `Lab 24`.

## Step 3 — Honesty sentence

Write: *Placeholder endpoint only — no Spring-WS hosting in Lab 13 prep.*

## Step 4 — Self-check

Confirm CUS-9999 (not Amina/Ravi) is the not-found example.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-13-exercises/`, create `notes/` if needed, then create `notes/lab13-fault-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 13 — Fill Fault Envelope TODOs

## Step 1 — Copy envelope TODOs

Fault code: _____
Fault string: _____
Detail customerId: _____
Correlation id: _____
HTTP/transport note (placeholder): _____
Real hosting lab: _____

## Step 2 — Fill blanks

Use Client/NotFound style code, message for unknown customer, `CUS-9999`, `lab-request-001`, placeholder endpoint honesty, and `Lab 24`.

## Step 3 — Honesty sentence

Write: *Placeholder endpoint only — no Spring-WS hosting in Lab 13 prep.*

## Step 4 — Self-check

Confirm CUS-9999 (not Amina/Ravi) is the not-found example.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Filled fault TODOs with CUS-9999 and Lab 24 deferral in `notes/lab13-fault-todos.md`.


## Debug / design challenge

Missing faultstring — add a human-readable NotFound message for CUS-9999.

## Predict the Output / Behavior

Does a SOAP fault replace the success response body for that call?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab13-fault-todos.md` |
| Using CUS-1001 as not-found | Keep Amina valid; use CUS-9999 for fault demos |
| Claiming live Spring-WS | Design-only until Lab 24 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab13-fault-todos.md`
- [ ] All _____ replaced
- [ ] CUS-9999 and lab-request-001 present
- [ ] Lab 24 named

