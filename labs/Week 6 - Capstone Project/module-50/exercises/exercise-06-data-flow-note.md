# Exercise 6 — Document End-to-End Data Flow

## Activity card

| | |
| --- | --- |
| **Time** | 8–10 minutes |
| **Checkpoint** | **D** (after slides 83–84) |
| **Deliverable** | `notes/lab50-data-flow-note.md` |
| **Fixtures** | CUS-1001/CUS-1002 · lab-request-001 · no real PII |

### What you will learn

Document UI → API → JPA → PostgreSQL flow for one interaction create.

### Enterprise context

Peers and Lab 52 defense need a clear data-flow story.

### Predict

Where can the flow break if datasource profile is wrong?

### Debug

Timeline stale after POST — what step missing?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Vague 'data goes to DB' | Name endpoints, tables, correlation |
| Lab 51 CI as this warmup | Park deploy/security |

**Module 50** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-50-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab50-data-flow-note.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 50 — Document End-to-End Data Flow

## Step 1 — Pick action

Add interaction on `CUS-1001` with correlation `lab-request-001`.

## Step 2 — Sequence

Numbered steps across frontend, controller, service, repository, DB row.

## Step 3 — Failure point

Mark where validation or DB failure surfaces in the UI.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-50-exercises/`, create `notes/` if needed, then create `notes/lab50-data-flow-note.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 50 — Document End-to-End Data Flow

## Step 1 — Pick action

Add interaction on `CUS-1001` with correlation `lab-request-001`.

## Step 2 — Sequence

Numbered steps across frontend, controller, service, repository, DB row.

## Step 3 — Failure point

Mark where validation or DB failure surfaces in the UI.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

End-to-end data-flow note with failure surfacing in `notes/lab50-data-flow-note.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab50-data-flow-note.md` |
| Demo only happy path UI | Plan error/empty states |
| Manual SQL in prod | Use migrations |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab50-data-flow-note.md`
- [ ] Sequence numbered
- [ ] Failure surfacing marked
- [ ] Notes saved

