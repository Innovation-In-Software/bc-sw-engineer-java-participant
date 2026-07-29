# Exercise 2 — Customer Sketch for Amina

**Module 10** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/customer-sketch-notes.md` with hand-sketched fields for CUS-1001 before asking Copilot to generate code.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-10-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-02-customer-sketch.md` (this file in the course repo) |
| Your notes file | `notes/customer-sketch-notes.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Customer sketch

| customerId | fullName   | status   |
| ---------- | ---------- | -------- |
| CUS-1001   | Amina Khan | ACTIVE   |
| CUS-1002   | Ravi Singh | PROSPECT |

Correlation `lab-request-001`: logs/headers only — not a Customer field.

Boundary: sketch only — pre-lab.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

Create `notes/customer-sketch-notes.md`.

### Step 2 — Fields (Amina)

Record: `customerId`, `fullName`, `status` for Amina Khan ACTIVE (`CUS-1001`).

### Step 3 — Ravi row

Add a second row: `CUS-1002` Ravi Singh PROSPECT — same shape, different values.

### Step 4 — Correlation note

One line: request correlation `lab-request-001` belongs in logs/headers later, **not** as a Customer field.

### Step 5 — Prep boundary

Mark: *Sketch only — do not complete full Lab 10 AI generation path yet.*

Example shape:

```markdown
# Customer sketch

| customerId | fullName   | status   |
| ---------- | ---------- | -------- |
| CUS-1001   | Amina Khan | ACTIVE   |
| CUS-1002   | Ravi Singh | PROSPECT |

Correlation `lab-request-001`: logs/headers only — not a Customer field.

Boundary: sketch only — pre-lab.
```

## Expected result

Two fixture rows and a correlation placement note in `notes/customer-sketch-notes.md`.

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/customer-sketch-notes.md`
- [ ] Amina and Ravi rows correct
- [ ] Correlation not stored as a Customer field
- [ ] Explicit pre-lab boundary written

