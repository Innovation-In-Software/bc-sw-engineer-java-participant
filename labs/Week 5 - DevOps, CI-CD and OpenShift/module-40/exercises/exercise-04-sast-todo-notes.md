# Exercise 4 — Fill SAST Path TODOs

## Activity card

| | |
| --- | --- |
| **Time** | 12–15 minutes |
| **Checkpoint** | **B** (after slides 9–13) |
| **Deliverable** | `notes/lab40-sast-todo-notes.md` |
| **Fixtures** | Synthetic CUS-1001 / CUS-1002 only · no real PII |

### What you will learn

List request→sink paths: injection, authz, secrets, unsafe deserialization.

### Enterprise context

Manual focused SAST complements Dependency-Check.

### Predict

Lab 39 `GET /api/customers` has no Spring Security — what do you record as the authz finding?

### Debug

DAST-only mindset — what do you miss offline?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| No code locations | Record class/method for each finding |
| Looking for `GET /{id}` | Lab 39 is list-only (`CustomerController.list`) until you add GET-by-id |
| CI workflow files now | Park GitHub Actions for Lab 43 |

**Module 40** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab). Write the file in **`java-bootcamp/examples/module-40-exercises/`**.

| Item | Path (under `examples/module-40-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab40-sast-todo-notes.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

Use one notes file (`lab40-sast-todo-notes.md`) with two path blocks. Lab 39’s read API is `GET /api/customers` (query params `status`, `page`, `size`) — there is no `{id}` route yet.

Fill:

- Endpoint
- Authz check (Lab 39: none)
- Sink (SQL/file/log)
- Customer fixture used
- Risk if missing check

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `java-bootcamp/examples/module-40-exercises/`, create `notes/` if needed, then create `notes/lab40-sast-todo-notes.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 40 — Fill SAST Path TODOs

## Path A — customer list (read)

- Endpoint: GET /api/customers
- Authz check: _____
- Sink (SQL/file/log): _____
- Customer fixture used: CUS-1001
- Risk if missing check: _____

## Path B — write / status change

- Endpoint: _____
- Authz check: _____
- Sink (SQL/file/log): _____
- Customer fixture used: CUS-1002
- Risk if missing check: _____

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Two filled SAST path notes with remaining blanks only where Lab 40 code proof is required in `notes/lab40-sast-todo-notes.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab40-sast-todo-notes.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 40 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab40-sast-todo-notes.md`
- [ ] Template filled for read and write paths
- [ ] Fixtures CUS-1001/CUS-1002 used
- [ ] No secrets in notes
